package cn.hillwind.netbeans.migrate;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Main {

    private static final String NETBEANS_ORIG_DIR = "/data/work/netbeans/netbeans-11.3-source" ;
    private static final String PLATFORM_ORIG_DIR = NETBEANS_ORIG_DIR + "/platform"  ;
    private static final String NEW_DIR = "/data/work/netbeans/netbeans";

    public static void main(String[] args) throws Exception{
//        handlePlatform("core.startup","startup");
//        handlePlatform("o.n.core","core");
//        handlePlatform("core.windows","core-windows");
//        handlePlatform("core.ui","core-ui");
        handlePlatform("core.startup.base","startup-base");
    }

    private static void handlePlatform(String origModuleDir, String newModuleDir) throws Exception {
        File origModuleRootDir = new File(PLATFORM_ORIG_DIR, origModuleDir);
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
