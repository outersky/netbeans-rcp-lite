package org.netbeans.modules.janitor;
/** Localizable strings for {@link org.netbeans.modules.janitor}. */
class Bundle {
    /**
     * @param is_the_user_directory_name is the user directory name
     * @param the_days_of_abandonement the days of abandonement
     * @param the_disk_space_can_be_reclaimed_in_megabytes_ the disk space can be reclaimed (in megabytes)
     * @return <i>Remove unused data and cache directories of NetBeans </i>{@code is_the_user_directory_name}<i>. Free up </i>{@code the_disk_space_can_be_reclaimed_in_megabytes_}<i> MB of disk space.</i>
     * @see Janitor
     */
    static String DESC_ABANDONED_USERDIR(Object is_the_user_directory_name, Object the_days_of_abandonement, Object the_disk_space_can_be_reclaimed_in_megabytes_) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "DESC_ABANDONED_USERDIR", is_the_user_directory_name, the_days_of_abandonement, the_disk_space_can_be_reclaimed_in_megabytes_);
    }
    /**
     * @param the_dirname_to_be_cleaned_up the dirname to be cleaned up
     * @return <i>Removing user and cache dirs of </i>{@code the_dirname_to_be_cleaned_up}
     * @see Janitor
     */
    static String LBL_CLEANUP(Object the_dirname_to_be_cleaned_up) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "LBL_CLEANUP", the_dirname_to_be_cleaned_up);
    }
    /**
     * @return <i>Janitor</i>
     * @see JanitorOptionsController
     */
    static String OptionsCategory_Janitor() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "OptionsCategory_Janitor");
    }
    /**
     * @param is_the_user_directory_name is the user directory name
     * @param the_days_of_abandonement the days of abandonement
     * @param the_disk_space_can_be_reclaimed_in_megabytes_ the disk space can be reclaimed (in megabytes)
     * @return <i>NetBeans </i>{@code is_the_user_directory_name}<i> was last used </i>{@code the_days_of_abandonement}<i> days ago.</i>
     * @see Janitor
     */
    static String TIT_ABANDONED_USERDIR(Object is_the_user_directory_name, Object the_days_of_abandonement, Object the_disk_space_can_be_reclaimed_in_megabytes_) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TIT_ABANDONED_USERDIR", is_the_user_directory_name, the_days_of_abandonement, the_disk_space_can_be_reclaimed_in_megabytes_);
    }
    /**
     * @return <i>Confirm Cleanup</i>
     * @see Janitor
     */
    static String TIT_CONFIRM_CLEANUP() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TIT_CONFIRM_CLEANUP");
    }
    /**
     * @param the_dirname_to_be_cleaned_up the dirname to be cleaned up
     * @return <i>Remove user and cache data for NetBeans </i>{@code the_dirname_to_be_cleaned_up}<i>?</i>
     * @see Janitor
     */
    static String TXT_CONFIRM_CLEANUP(Object the_dirname_to_be_cleaned_up) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TXT_CONFIRM_CLEANUP", the_dirname_to_be_cleaned_up);
    }
    /**
     * @return <i>Janitor run. Check your Notifications.</i>
     * @see JanitorOptionsPanel
     */
    static String lbRunNowInfo_Info() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "lbRunNowInfo_Info");
    }
    private Bundle() {}
}
