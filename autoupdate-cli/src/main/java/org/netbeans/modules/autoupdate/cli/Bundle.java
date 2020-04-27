package org.netbeans.modules.autoupdate.cli;
/** Localizable strings for {@link org.netbeans.modules.autoupdate.cli}. */
class Bundle {
    /**
     * @param regexp regexp
     * @return <i>Cannot understand regular expession ''</i>{@code regexp}<i>''</i>
     * @see ModuleOptions
     */
    static String MSG_CantCompileRegex(Object regexp) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_CantCompileRegex", regexp);
    }
    /**
     * @return <i>Installed</i>
     * @see Status
     */
    static String MSG_Disabled() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_Disabled");
    }
    /**
     * @param plugin_name plugin name
     * @return <i>Downloading </i>{@code plugin_name}
     * @see ModuleOptions
     */
    static String MSG_Download(Object plugin_name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_Download", plugin_name);
    }
    /**
     * @return <i>Enabled</i>
     * @see Status
     */
    static String MSG_Enabled() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_Enabled");
    }
    /**
     * @return <i>Add a extra Update Center (URL)</i>
     * @see ModuleOptions
     */
    static String MSG_ExtraUC() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_ExtraUC");
    }
    /**
     * @param paterns paterns
     * @return <i>Cannot install. No match for </i>{@code paterns}<i>.</i>
     * @see ModuleOptions
     */
    static String MSG_InstallNoMatch(Object paterns) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_InstallNoMatch", paterns);
    }
    /**
     * @param module_name module name
     * @param module_version module version
     * @return <i>Installing </i>{@code module_name}<i>&#64;</i>{@code module_version}
     * @see ModuleOptions
     */
    static String MSG_Installing(Object module_name, Object module_version) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_Installing", module_name, module_version);
    }
    /**
     * @return <i>Code Name</i>
     * @see ModuleOptions
     */
    static String MSG_ListHeader_CodeName() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_ListHeader_CodeName");
    }
    /**
     * @return <i>State</i>
     * @see ModuleOptions
     */
    static String MSG_ListHeader_State() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_ListHeader_State");
    }
    /**
     * @return <i>Version</i>
     * @see ModuleOptions
     */
    static String MSG_ListHeader_Version() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_ListHeader_Version");
    }
    /**
     * @return <i>None extra Update Center (URL) specified.</i>
     * @see ModuleOptions
     */
    static String MSG_NoURL() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_NoURL");
    }
    /**
     * @return <i>Refresh all catalogs</i>
     * @see ModuleOptions
     */
    static String MSG_Refresh() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_Refresh");
    }
    /**
     * @return <i>Unknown state</i>
     * @see Status
     */
    static String MSG_Unknown() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_Unknown");
    }
    /**
     * @param module_name module name
     * @param installed_version installed version
     * @param available_version available version
     * @return <i>Will update </i>{@code module_name}<i>&#64;</i>{@code installed_version}<i> to version </i>{@code available_version}
     * @see ModuleOptions
     */
    static String MSG_Update(Object module_name, Object installed_version, Object available_version) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_Update", module_name, installed_version, available_version);
    }
    /**
     * @return <i>Updates all modules</i>
     * @see ModuleOptions
     */
    static String MSG_UpdateAll() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_UpdateAll");
    }
    /**
     * @param available_version available version
     * @return <i>Upgrade to </i>{@code available_version}
     * @see Status
     */
    static String MSG_UpdateAvailable(Object available_version) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_UpdateAvailable", available_version);
    }
    /**
     * @return <i>Updates all or specified modules</i>
     * @see ModuleOptions
     */
    static String MSG_UpdateModules() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_UpdateModules");
    }
    /**
     * @param pattern pattern
     * @return <i>Nothing to update. The pattern </i>{@code pattern}<i> has no match among available updates.</i>
     * @see ModuleOptions
     */
    static String MSG_UpdateNoMatchPattern(Object pattern) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_UpdateNoMatchPattern", pattern);
    }
    /**
     * @return <i>Updates not found.</i>
     * @see ModuleOptions
     */
    static String MSG_UpdateNotFound() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_UpdateNotFound");
    }
    /**
     * @return <i>Available</i>
     * @see Status
     */
    static String MSG_Updateable() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_Updateable");
    }
    private Bundle() {}
}
