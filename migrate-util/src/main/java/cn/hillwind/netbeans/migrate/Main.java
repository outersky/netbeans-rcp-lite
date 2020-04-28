package cn.hillwind.netbeans.migrate;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class Main {

    private static final String NETBEANS_ORIG_DIR = "/data/work/netbeans/netbeans-11.3-source";
    private static final String PLATFORM_ORIG_DIR = NETBEANS_ORIG_DIR + "/platform";
    private static final String HARNESS_ORIG_DIR = NETBEANS_ORIG_DIR + "/harness";
    private static final String NEW_DIR = "/data/work/netbeans/netbeans";

    private static final String NETBEANS_JAR_DIR = "/data/work/netbeans/netbeans-11.3-source/nbbuild/netbeans";
    private static final String PLATFORM_JAR_DIR = NETBEANS_JAR_DIR + "/platform";
    private static final String HARNESS_JAR_DIR = NETBEANS_JAR_DIR + "/harness";

    public static void main(String[] args) throws Exception {
//        fixBundles();
        fixManifestFiles();
    }

    private static void fixManifestFiles() throws Exception {
        handleModule("org-openide-actions.jar", "actions");
        handleModule("org-netbeans-modules-autoupdate-cli.jar", "autoupdate-cli");
        handleModule("org-netbeans-modules-autoupdate-services.jar", "autoupdate-service");
        handleModule("org-netbeans-modules-autoupdate-ui.jar", "autoupdate-ui");
        handleModule("org-openide-awt.jar", "awt-util");
        handleLib("org-openide-util.jar", "basic-util");
        handleLib("boot.jar", "bootstrap");
        handleModule("org-netbeans-modules-sendopts.jar", "cli-util");
        handleModule("org-netbeans-api-annotations-common.jar", "common-annotations");
        handleModule("org-netbeans-core.jar", "core");
        handleModule("org-netbeans-core-execution.jar", "core-execution");
        handleModule("org-netbeans-core-network.jar", "core-network");
        handleModule("org-netbeans-core-ui.jar","core-ui");
        handleModule("org-netbeans-core-windows.jar", "core-windows");

        handleModule("org-netbeans-swing-laf-dark.jar", "dark-theme");
        handleModule("org-openide-loaders.jar", "datasystems");
        handleModule("org-openide-dialogs.jar", "dialogs");
        handleModule("org-openide-execution.jar", "execution");
        handleModule("org-openide-explorer.jar", "explorer");
        handleModule("org-netbeans-modules-favorites.jar", "favorites");
        handleModule("org-netbeans-api-templates.jar", "file-templates");
        handleCore("org-openide-filesystems.jar", "filesystems");
        handleModule("org-openide-filesystems-nb.jar", "filesystems-nb");
        handleModule("org-netbeans-swing-laf-flatlaf.jar", "flatlaf-nb");

        handleHarnessMf("org-netbeans-insane.jar", "insane");
        handleModule("org-netbeans-api-intent.jar", "intent");
        handleModule("org-netbeans-api-io.jar", "io");
        handleModule("org-openide-io.jar", "io-swing");
        handleModule("org-netbeans-core-io-ui.jar", "io-ui");
        handleModule("org-netbeans-modules-janitor.jar", "janitor");
        handleModule("org-netbeans-modules-options-keymap.jar", "keymap-options");
        handleModule("org-netbeans-modules-keyring.jar", "keyring");
        handleModule("org-netbeans-modules-keyring-fallback.jar", "keyring-fallback");
        handleModule("org-netbeans-swing-plaf.jar", "lookfeel");
        handleLib("org-openide-util-lookup.jar", "lookup");
        handleModule("org-netbeans-modules-masterfs.jar", "master-fs");
        handleModule("org-netbeans-modules-masterfs-ui.jar", "master-fs-ui");
        handleModule("org-netbeans-modules-editor-mimelookup.jar", "mimelookup");
        handleModule("org-netbeans-modules-editor-mimelookup-impl.jar", "mimelookupimpl");
        handleLib("org-openide-modules.jar", "modules");
        handleModule("org-netbeans-core-multiview.jar", "multiview-windows");
        handleModule("org-netbeans-core-nativeaccess.jar", "native-access");
//        handleHarness("nbjunit", "nbjunit");
        handleModule("org-openide-nodes.jar", "nodes");

        handleModule("org-netbeans-modules-options-api.jar", "options-dialog");
        handleModule("org-netbeans-swing-outline.jar", "outline");
        handleModule("org-netbeans-core-output2.jar", "output-window");
        handleModule("org-netbeans-modules-print.jar", "print");
        handleModule("org-netbeans-api-progress.jar", "progress");
        handleModule("org-netbeans-api-progress-nb.jar", "progress-swing");
        handleModule("org-netbeans-modules-progress-ui.jar", "progress-ui");
        handleModule("org-netbeans-modules-queries.jar", "queries");
        handleModule("org-netbeans-api-search.jar", "quicksearch");
//        handleModule("core.kit", "rcp");
        handleModule("org-netbeans-modules-sampler.jar", "sampler");
        handleModule("org-netbeans-api-scripting.jar", "scripting");
        handleModule("org-netbeans-modules-settings.jar", "settings");
        handleModule("org-openide-options.jar", "settings-options");
        handleCore("core.jar", "startup");
        handleCore("core-base.jar", "startup-base");
        handleModule("org-netbeans-swing-tabcontrol.jar", "tabcontrol");
        handleModule("org-netbeans-modules-templates.jar", "templates");
        handleModule("org-openide-text.jar", "text");
        handleModule("org-netbeans-lib-uihandler.jar", "ui-handler");
        handleLib("org-openide-util-ui.jar", "ui-util");
        handleModule("org-netbeans-api-visual.jar", "visual");
        handleModule("org-openide-windows.jar", "windows");
    }

    private static void handleModule(String srcJarPath, String targetModuleDir) {
        handlePlatformMF("modules/" + srcJarPath,targetModuleDir);
    }

    private static void handleHarnessMf(String srcJarPath, String targetModuleDir) {
        copyMf(new File(HARNESS_JAR_DIR,"modules/" + srcJarPath), new File(targetModuleDir,"src/main/resources/META-INF/MANIFEST.MF"));
    }

    private static void handleLib(String srcJarPath, String targetModuleDir) {
        handlePlatformMF("lib/" + srcJarPath,targetModuleDir);
    }

    private static void handleCore(String srcJarPath, String targetModuleDir) {
        handlePlatformMF("core/" + srcJarPath,targetModuleDir);
    }

    private static void handlePlatformMF(String srcJarPath, String targetModuleDir){
        copyMf(new File(PLATFORM_JAR_DIR,srcJarPath), new File(targetModuleDir,"src/main/resources/META-INF/MANIFEST.MF"));
    }

    private static final String MANIFEST_ENTRY = "META-INF/MANIFEST.MF";
    public static final void copyMf(File srcJarFile, File targetFile) {
        JarFile jar = null;
        try {
            jar = new JarFile(srcJarFile);
            JarEntry entry = jar.getJarEntry(MANIFEST_ENTRY);
            if (entry != null) {
                //noinspection ResultOfMethodCallIgnored
                targetFile.getParentFile().mkdirs();
                Files.copy(jar.getInputStream(entry), targetFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                jar.close();
            }
        } catch (Exception e) {
            throw new RuntimeException("Cannot read MANIFEST.MF from jar '" + srcJarFile.getAbsolutePath() + "'.", e);
        } finally {
            if (jar != null) {
                try {
                    jar.close();
                } catch (IOException ioe) {
                    throw new RuntimeException("Failed to close jar '" + srcJarFile.getAbsolutePath() + "'.", ioe);
                }
            }
        }
    }

    public static void fixBundles() throws Exception {
        // handle platform/harness  ( old name, new name)
        handlePlatform("openide.actions", "actions");
        handlePlatform("autoupdate.cli", "autoupdate-cli");
        handlePlatform("autoupdate.services", "autoupdate-service");
        handlePlatform("autoupdate.ui", "autoupdate-ui");
        handlePlatform("openide.awt", "awt-util");
        handlePlatform("openide.util", "basic-util");
        handlePlatform("o.n.bootstrap", "bootstrap");
        handlePlatform("sendopts", "cli-util");
        handlePlatform("api.annotations.common", "common-annotations");
        handlePlatform("o.n.core", "core");
        handlePlatform("core.execution", "core-execution");
        handlePlatform("core.network", "core-network");
        handlePlatform("core.ui", "core-ui");
        handlePlatform("core.windows", "core-windows");

        handlePlatform("o.n.swing.laf.dark", "dark-theme");
        handlePlatform("openide.loaders", "datasystems");
        handlePlatform("openide.dialogs", "dialogs");
        handlePlatform("openide.execution", "execution");
        handlePlatform("openide.explorer", "explorer");
        handlePlatform("favorites", "favorites");
        handlePlatform("api.templates", "file-templates");
        handlePlatform("openide.filesystems", "filesystems");
        handlePlatform("openide.filesystems.nb", "filesystems-nb");
        handlePlatform("o.n.swing.laf.flatlaf", "flatlaf-nb");

        handleHarness("o.n.insane", "insane");
        handlePlatform("api.intent", "intent");
        handlePlatform("api.io", "io");
        handlePlatform("openide.io", "io-swing");
        handlePlatform("core.io.ui", "io-ui");
        handlePlatform("janitor", "janitor");
        handlePlatform("options.keymap", "keymap-options");
        handlePlatform("keyring", "keyring");
        handlePlatform("keyring.fallback", "keyring-fallback");
        handlePlatform("o.n.swing.plaf", "lookfeel");
        handlePlatform("openide.util.lookup", "lookup");
        handlePlatform("masterfs", "master-fs");
        handlePlatform("masterfs.ui", "master-fs-ui");
        handlePlatform("editor.mimelookup", "mimelookup");
        handlePlatform("editor.mimelookup.impl", "mimelookupimpl");
        handlePlatform("openide.modules", "modules");
        handlePlatform("core.multiview", "multiview-windows");
        handlePlatform("core.nativeaccess", "native-access");
        handleHarness("nbjunit", "nbjunit");
        handlePlatform("openide.nodes", "nodes");

        handlePlatform("options.api", "options-dialog");
        handlePlatform("o.n.swing.outline", "outline");
        handlePlatform("core.output2", "output-window");
        handlePlatform("print", "print");
        handlePlatform("api.progress", "progress");
        handlePlatform("api.progress.nb", "progress-swing");
        handlePlatform("progress.ui", "progress-ui");
        handlePlatform("queries", "queries");
        handlePlatform("spi.quicksearch", "quicksearch");
        handlePlatform("core.kit", "rcp");
        handlePlatform("sampler", "sampler");
        handlePlatform("api.scripting", "scripting");
        handlePlatform("settings", "settings");
        handlePlatform("openide.options", "settings-options");
        handlePlatform("core.startup", "startup");
        handlePlatform("core.startup.base", "startup-base");
        handlePlatform("o.n.swing.tabcontrol", "tabcontrol");
        handlePlatform("templates", "templates");
        handlePlatform("openide.text", "text");
        handlePlatform("lib.uihandler", "ui-handler");
        handlePlatform("openide.util.ui", "ui-util");
        handlePlatform("api.visual", "visual");
        handlePlatform("openide.windows", "windows");


    }

    private static void handlePlatform(String origModuleDir, String newModuleDir) throws Exception {
        File origModuleRootDir = new File(PLATFORM_ORIG_DIR, origModuleDir);
        handleBundle(origModuleRootDir, newModuleDir);
    }

    private static void handleHarness(String origModuleDir, String newModuleDir) throws Exception {
        File origModuleRootDir = new File(HARNESS_ORIG_DIR, origModuleDir);
        handleBundle(origModuleRootDir, newModuleDir);
    }

    private static void handleBundle(File origModuleRootDir, String newModuleDir) throws Exception {
        Path origModuleClassDir = new File(origModuleRootDir, "build/classes").toPath();
        Path newModuleResourceDir = new File(NEW_DIR, newModuleDir + File.separator + "src/main/resources").toPath();


        Files.walk(origModuleClassDir).filter(path -> {
            return path.toFile().getName().equalsIgnoreCase("Bundle.properties");
        }).forEach(path -> {
            System.out.printf("found %s\n", path.toString());
            copyTo(path, origModuleClassDir, newModuleResourceDir);
        });
    }

    private static void copyTo(Path bundleFile, Path origModuleClassDir, Path newModuleResourcePath) {
        Path relativize = origModuleClassDir.relativize(bundleFile.getParent());
        System.out.printf("rel: %s\n", relativize.toString());
        String fileName = bundleFile.toFile().getName();
        Path newPath = newModuleResourcePath.resolve(relativize);
        try {
            //noinspection ResultOfMethodCallIgnored
            newPath.toFile().mkdirs();
            Files.copy(bundleFile, new File(newPath.toFile(), fileName).toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.err.println("copy error: " + bundleFile.toString());
            e.printStackTrace();
        }
    }
}
