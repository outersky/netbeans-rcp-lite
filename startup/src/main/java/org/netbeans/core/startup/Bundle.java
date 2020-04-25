package org.netbeans.core.startup;
/** Localizable strings for {@link org.netbeans.core.startup}. */
class Bundle {
    /**
     * @return <i>Disable Modules and Continue</i>
     * @see NbEvents
     */
    static String MSG_continue() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_continue");
    }
    /**
     * @return <i>Exit</i>
     * @see NbEvents
     */
    static String MSG_exit() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_exit");
    }
    /**
     * @return <i>Warning - could not install some modules:</i>
     * @see NbEvents
     */
    static String MSG_failed_install_new() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_failed_install_new");
    }
    /**
     * @param module_display_name module display name
     * @return <i>Warning - could not install module </i>{@code module_display_name}
     * @see NbEvents
     */
    static String MSG_failed_install_new_unexpected(Object module_display_name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_failed_install_new_unexpected", module_display_name);
    }
    /**
     * @return <i>Done loading modules.</i>
     * @see NbEvents
     */
    static String MSG_finish_auto_restore() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_finish_auto_restore");
    }
    /**
     * @return <i>Turning off modules...done.</i>
     * @see NbEvents
     */
    static String MSG_finish_disable_modules() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_finish_disable_modules");
    }
    /**
     * @return <i>Turning on modules...done.</i>
     * @see NbEvents
     */
    static String MSG_finish_enable_modules() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_finish_enable_modules");
    }
    /**
     * @return <i>Loading core...done.</i>
     * @see NbEvents
     */
    static String MSG_finish_load_boot_modules() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_finish_load_boot_modules");
    }
    /**
     * @return <i>Reading module storage...done.</i>
     * @see NbEvents
     */
    static String MSG_finish_read() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_finish_read");
    }
    /**
     * @return <i>Information</i>
     * @see NbEvents
     */
    static String MSG_info() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_info");
    }
    /**
     * @param module_display_name module display name
     * @return <i>Installing </i>{@code module_display_name}
     * @see NbEvents
     */
    static String MSG_install(Object module_display_name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_install", module_display_name);
    }
    /**
     * @return <i>Loading module services...</i>
     * @see NbEvents
     */
    static String MSG_load_layers() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_load_layers");
    }
    /**
     * @return <i>Loading modules...</i>
     * @see NbEvents
     */
    static String MSG_load_section() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_load_section");
    }
    /**
     * @return <i>Starting modules...</i>
     * @see NbEvents
     */
    static String MSG_restore() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_restore");
    }
    /**
     * @return <i>Loading modules...</i>
     * @see NbEvents
     */
    static String MSG_start_auto_restore() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_start_auto_restore");
    }
    /**
     * @return <i>Turning off modules...</i>
     * @see NbEvents
     */
    static String MSG_start_disable_modules() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_start_disable_modules");
    }
    /**
     * @return <i>Turning on modules...</i>
     * @see NbEvents
     */
    static String MSG_start_enable_modules() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_start_enable_modules");
    }
    /**
     * @return <i>Loading core...</i>
     * @see NbEvents
     */
    static String MSG_start_load_boot_modules() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_start_load_boot_modules");
    }
    /**
     * @return <i>Reading module storage...</i>
     * @see NbEvents
     */
    static String MSG_start_read() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_start_read");
    }
    /**
     * @return <i>, startlevel=</i>{@code arg0}
     * @see NbEvents
     */
    static String MSG_startlevelinfo(Object arg0) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_startlevelinfo", arg0);
    }
    /**
     * @param module_display_name module display name
     * @return <i>Stopping </i>{@code module_display_name}
     * @see NbEvents
     */
    static String MSG_uninstall(Object module_display_name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_uninstall", module_display_name);
    }
    /**
     * @param module_display_name module display name
     * @return <i>Starting a new version of </i>{@code module_display_name}
     * @see NbEvents
     */
    static String MSG_update(Object module_display_name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_update", module_display_name);
    }
    /**
     * @return <i>Warning</i>
     * @see NbEvents
     */
    static String MSG_warning() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_warning");
    }
    /**
     * @param module_display_name module display name
     * @return <i>The module </i>{@code module_display_name}<i> could not be deleted as it was an autoload or eager module and still in use.</i>
     * @see NbEvents
     */
    static String TEXT_cant_delete_enabled_autoload(Object module_display_name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TEXT_cant_delete_enabled_autoload", module_display_name);
    }
    /**
     * @return <i>Finished deploying test module.</i>
     * @see NbEvents
     */
    static String TEXT_finish_deploy_test_module() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TEXT_finish_deploy_test_module");
    }
    /**
     * @return <i>Turning off modules:</i>
     * @see NbEvents
     */
    static String TEXT_finish_disable_modules() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TEXT_finish_disable_modules");
    }
    /**
     * @return <i>Turning on modules:</i>
     * @see NbEvents
     */
    static String TEXT_finish_enable_modules() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TEXT_finish_enable_modules");
    }
    /**
     * @param module_display_name module display name
     * @return <i>Installing new module: </i>{@code module_display_name}
     * @see NbEvents
     */
    static String TEXT_install(Object module_display_name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TEXT_install", module_display_name);
    }
    /**
     * @param module_display_name module display name
     * @param property_name_in_XML property name in XML
     * @param value_on_disk_in_XML value on disk in XML
     * @param actual_value actual value
     * @return <i>An attempt was made to change the property </i>{@code property_name_in_XML}<i> of the module </i>{@code module_display_name}<i> in the system/Modules folder.<br>The actual value is "</i>{@code actual_value}<i>" but it was changed on disk to read "</i>{@code value_on_disk_in_XML}<i>".<br>This property cannot be changed while the IDE is running, so this attempt had no effect.</i>
     * @see NbEvents
     */
    static String TEXT_misc_prop_mismatch(Object module_display_name, Object property_name_in_XML, Object value_on_disk_in_XML, Object actual_value) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TEXT_misc_prop_mismatch", module_display_name, property_name_in_XML, value_on_disk_in_XML, actual_value);
    }
    /**
     * @param path_to_expected_module_JAR path to expected module JAR
     * @return <i>Warning: the module </i>{@code path_to_expected_module_JAR}<i> could not be found, ignoring...</i>
     * @see NbEvents
     */
    static String TEXT_missing_jar_file(Object path_to_expected_module_JAR) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TEXT_missing_jar_file", path_to_expected_module_JAR);
    }
    /**
     * @param JAR_file_name JAR file name
     * @return <i>Module patch or custom extension: </i>{@code JAR_file_name}
     * @see NbEvents
     */
    static String TEXT_patch(Object JAR_file_name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TEXT_patch", JAR_file_name);
    }
    /**
     * @param file_name_ file name 
     * @return <i>Deploying test module in </i>{@code file_name_}<i> ...</i>
     * @see NbEvents
     */
    static String TEXT_start_deploy_test_module(Object file_name_) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TEXT_start_deploy_test_module", file_name_);
    }
    /**
     * @param module_display_name module display name
     * @return <i>Updating module: </i>{@code module_display_name}
     * @see NbEvents
     */
    static String TEXT_update(Object module_display_name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TEXT_update", module_display_name);
    }
    private Bundle() {}
}
