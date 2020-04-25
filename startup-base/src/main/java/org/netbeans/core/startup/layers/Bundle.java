package org.netbeans.core.startup.layers;
/** Localizable strings for {@link org.netbeans.core.startup.layers}. */
class Bundle {
    /**
     * @return <i>Default System</i>
     * @see SystemFileSystem
     */
    static String CTL_SystemFileSystem() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CTL_SystemFileSystem");
    }
    /**
     * @return <i>Instance Files</i>
     * @see SystemFileSystem
     */
    static String INSTANCE_FILES() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "INSTANCE_FILES");
    }
    /**
     * @param type type
     * @param path_to_the_file path to the file
     * @param file_object_itself file object itself
     * @param event_itself event itself
     * @return <i>File event </i>{@code type}<i>, file </i>{@code path_to_the_file}
     * @see SystemFileSystem
     */
    static String LOG_FILE_EVENT(Object type, Object path_to_the_file, Object file_object_itself, Object event_itself) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "LOG_FILE_EVENT", type, path_to_the_file, file_object_itself, event_itself);
    }
    private Bundle() {}
}
