package cn.hillwind.netbeans.migrate;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Main {

    private static final String NETBEANS_ORIG_DIR = "/data/work/netbeans/netbeans-11.3-source" ;
    private static final String PLATFORM_ORIG_DIR = NETBEANS_ORIG_DIR + "/platform"  ;
    private static final String HARNESS_ORIG_DIR = NETBEANS_ORIG_DIR + "/harness"  ;
    private static final String NEW_DIR = "/data/work/netbeans/netbeans";

    public static void main(String[] args) throws Exception{
            // handle platform/harness  ( old name, new name)
//        handlePlatform("openide.actions","actions");
//        handlePlatform("autoupdate.cli","autoupdate-cli");
//        handlePlatform("autoupdate.services","autoupdate-service");
//        handlePlatform("autoupdate.ui","autoupdate-ui");
//        handlePlatform("openide.awt","awt-util");
//        handlePlatform("openide.util","basic-util");
//        handlePlatform("o.n.bootstrap","bootstrap");
//        handlePlatform("sendopts","cli-util");
//        handlePlatform("api.annotations.common","common-annotations");
//        handlePlatform("o.n.core","core");
//        handlePlatform("core.execution","core-execution");
//        handlePlatform("core.network","core-network");
//        handlePlatform("core.ui","core-ui");
//        handlePlatform("core.windows","core-windows");

//        handlePlatform("o.n.swing.laf.dark","dark-theme");
//        handlePlatform("openide.loaders","datasystems");
//        handlePlatform("openide.dialogs","dialogs");
//        handlePlatform("openide.execution","execution");
//        handlePlatform("openide.explorer","explorer");
//        handlePlatform("favorites","favorites");
//        handlePlatform("api.templates","file-templates");
//        handlePlatform("openide.filesystems","filesystems");
//        handlePlatform("openide.filesystems.nb","filesystems-nb");
//        handlePlatform("o.n.swing.laf.flatlaf","flatlaf-nb");

//        handleHarness("o.n.insane","insane");
//        handlePlatform("api.intent","intent");
//        handlePlatform("api.io","io");
//        handlePlatform("openide.io","io-swing");
//        handlePlatform("core.io.ui","io-ui");
//        handlePlatform("janitor","janitor");
//        handlePlatform("options.keymap","keymap-options");
//        handlePlatform("keyring","keyring");
//        handlePlatform("keyring.fallback","keyring-fallback");
//        handlePlatform("o.n.swing.plaf","lookfeel");
//        handlePlatform("openide.util.lookup","lookup");
//        handlePlatform("masterfs","master-fs");
//        handlePlatform("masterfs.ui","master-fs-ui");
//        handlePlatform("editor.mimelookup","mimelookup");
//        handlePlatform("editor.mimelookup.impl","mimelookupimpl");
//        handlePlatform("openide.modules","modules");
//        handlePlatform("core.multiview","multiview-windows");
//        handlePlatform("core.nativeaccess","native-access");
//        handleHarness("nbjunit","nbjunit");
//        handlePlatform("openide.nodes","nodes");

//        handlePlatform("options.api","options-dialog");
//        handlePlatform("o.n.swing.outline","outline");
//        handlePlatform("core.output2","output-window");
//        handlePlatform("print","print");
//        handlePlatform("api.progress","progress");
//        handlePlatform("api.progress.nb","progress-swing");
//        handlePlatform("progress.ui","progress-ui");
//        handlePlatform("queries","queries");
//        handlePlatform("spi.quicksearch","quicksearch");
//        handlePlatform("core.kit","rcp");
//        handlePlatform("sampler","sampler");
//        handlePlatform("api.scripting","scripting");
//        handlePlatform("settings","settings");
//        handlePlatform("openide.options","settings-options");
//        handlePlatform("core.startup","startup");
//        handlePlatform("core.startup.base","startup-base");
//        handlePlatform("o.n.swing.tabcontrol","tabcontrol");
//        handlePlatform("templates","templates");
//        handlePlatform("openide.text","text");
//        handlePlatform("lib.uihandler","ui-handler");
//        handlePlatform("openide.util.ui","ui-util");
//        handlePlatform("api.visual","visual");
//        handlePlatform("openide.windows","windows");


    }

    private static void handlePlatform(String origModuleDir, String newModuleDir) throws Exception {
        File origModuleRootDir = new File(PLATFORM_ORIG_DIR, origModuleDir);
        handle(origModuleRootDir, newModuleDir);
    }

    private static void handleHarness(String origModuleDir, String newModuleDir) throws Exception {
        File origModuleRootDir = new File(HARNESS_ORIG_DIR, origModuleDir);
        handle(origModuleRootDir, newModuleDir);
    }

    private static void handle(File origModuleRootDir, String newModuleDir) throws Exception {
        Path origModuleClassDir = new File(origModuleRootDir,"build/classes").toPath();
        Path newModuleResourceDir = new File(NEW_DIR, newModuleDir+File.separator+"src/main/resources").toPath();


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
            Files.copy(bundleFile, new File(newPath.toFile(),fileName).toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.err.println("copy error: " + bundleFile.toString());
            e.printStackTrace();
        }
    }
}
