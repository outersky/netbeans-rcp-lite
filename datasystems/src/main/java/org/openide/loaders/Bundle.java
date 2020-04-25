package org.openide.loaders;
/** Localizable strings for {@link org.openide.loaders}. */
class Bundle {
    /**
     * @return <i>Settings Files</i>
     * @see DataLoaderPool
     */
    static String CTL_SettingsFile() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CTL_SettingsFile");
    }
    /**
     * @param the_path the path
     * @return <i>The file </i>{@code the_path}<i> seems no longer valid!</i>
     * @see DataObject
     */
    static String EXC_FIND_4_INVALID(Object the_path) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "EXC_FIND_4_INVALID", the_path);
    }
    /**
     * @return <i>Copied file </i>{@code arg0}<i> is no longer valid!</i>
     * @see MultiDataObject
     */
    static String EXC_NO_LONGER_VALID(Object arg0) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "EXC_NO_LONGER_VALID", arg0);
    }
    /**
     * @param File_name File name
     * @return <i>Copying </i>{@code File_name}
     * @see DataObject
     */
    static String LBL_Copying(Object File_name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "LBL_Copying", File_name);
    }
    /**
     * @param Deleted_file_or_folder Deleted file or folder
     * @return <i>Deleting </i>{@code Deleted_file_or_folder}
     * @see DataObject
     */
    static String LBL_Deleting(Object Deleted_file_or_folder) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "LBL_Deleting", Deleted_file_or_folder);
    }
    /**
     * @param File_name File name
     * @return <i>Moving </i>{@code File_name}
     * @see DataObject
     */
    static String LBL_Moving(Object File_name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "LBL_Moving", File_name);
    }
    /**
     * @return <i> (to parent)</i>
     * @see DataNode
     */
    static String LBL_PasteToParent() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "LBL_PasteToParent");
    }
    private Bundle() {}
}
