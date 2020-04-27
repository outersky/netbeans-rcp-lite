package org.netbeans.api.options.test;

import java.beans.PropertyVetoException;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import java.util.Enumeration;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileSystem;
import org.openide.filesystems.FileUtil;
import org.openide.filesystems.MultiFileSystem;
import org.openide.filesystems.Repository;
import org.openide.filesystems.XMLFileSystem;
import org.openide.util.Lookup;
import org.openide.util.lookup.Lookups;
import org.openide.util.lookup.ProxyLookup;


/**
 * Inspired by org.netbeans.api.project.TestUtil.
 *
 * @author Miloslav Metelka, Jan Lahoda
 */
public class IDEInitializer extends ProxyLookup {

    public static IDEInitializer DEFAULT_LOOKUP = null;
    private static FileSystem lfs;

    static {
        IDEInitializer.class.getClassLoader ().setDefaultAssertionStatus (true);
        System.setProperty ("org.openide.util.Lookup", IDEInitializer.class.getName ());
    }

    public IDEInitializer () {
        DEFAULT_LOOKUP = this;
        URL.setURLStreamHandlerFactory (new MyURLHandlerFactory ());
    }

    /**
     * Set the global default lookup with the specified content.
     *
     * @param layers xml-layer URLs to be present in the system filesystem.
     * @param instances object instances to be present in the default lookup.
     */
    public static void setup (
            String[] layers,
            Object[] instances
    ) {
        ClassLoader classLoader = IDEInitializer.class.getClassLoader ();
        File workDir = new File(".");
        URL[] urls = new URL [layers.length];
        int i, k = urls.length;
        for (i = 0; i < k; i++)
            urls [i] = classLoader.getResource (layers [i]);

        // 1) create repository
        XMLFileSystem systemFS = new XMLFileSystem ();
        lfs = FileUtil.createMemoryFileSystem();
        try {
            systemFS.setXmlUrls (urls);
        } catch (Exception ex) {
            ex.printStackTrace ();
        }
        MyFileSystem myFileSystem = new MyFileSystem (
                new FileSystem [] {lfs, systemFS}
        );
        Repository repository = new Repository (myFileSystem);

        Object[] lookupContent = new Object [instances.length + 1];
        lookupContent [0] = repository;
        System.arraycopy (instances, 0, lookupContent, 1, instances.length);

        DEFAULT_LOOKUP.setLookups (new Lookup[] {
                Lookups.fixed (lookupContent),
                Lookups.metaInfServices (classLoader),
                Lookups.singleton (classLoader),
        });
    }

    public static void cleanWorkDir () {
        try {
            Enumeration en = lfs.getRoot ().getChildren (false);
            while (en.hasMoreElements ())
                ((FileObject) en.nextElement ()).delete ();
        } catch (IOException ex) {
            ex.printStackTrace ();
        }
    }

    private static class MyFileSystem extends MultiFileSystem {
        public MyFileSystem (FileSystem[] fileSystems) {
            super (fileSystems);
            try {
                setSystemName ("TestFS");
            } catch (PropertyVetoException ex) {
                ex.printStackTrace();
            }
        }
    }

    private static class MyURLHandlerFactory implements URLStreamHandlerFactory {
        public URLStreamHandler createURLStreamHandler(String protocol) {
            if (protocol.equals ("nbfs")) {
                return FileUtil.nbfsURLStreamHandler ();
            }
            return null;
        }
    }
}
