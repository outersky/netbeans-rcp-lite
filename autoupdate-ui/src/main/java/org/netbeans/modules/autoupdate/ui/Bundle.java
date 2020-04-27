package org.netbeans.modules.autoupdate.ui;
/** Localizable strings for {@link org.netbeans.modules.autoupdate.ui}. */
class Bundle {
    /**
     * @return <i>Module Archive Modified</i>
     * @see ProblemPanel
     */
    static String CTL_ModifiedError() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CTL_ModifiedError");
    }
    /**
     * @return <i>OSGi Bundle files (*.jar)</i>
     * @see LocalDownloadSupport
     */
    static String CTL_OsgiBundleFilterDescription() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CTL_OsgiBundleFilterDescription");
    }
    /**
     * @return <i>Write Permissions Problem</i>
     * @see ProblemPanel
     */
    static String CTL_WriteError() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CTL_WriteError");
    }
    /**
     * @return <i>Activating modules</i>
     * @see ModuleInstallerSupport
     */
    static String active_handle() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "active_handle");
    }
    /**
     * @return <i>Activating </i>{@code arg0}
     * @see ModuleInstallerSupport
     */
    static String active_handle_single(Object arg0) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "active_handle_single", arg0);
    }
    /**
     * @return <i>Default</i>
     * @see SettingsTab
     */
    static String cbLocation_InstallDefault() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "cbLocation_InstallDefault");
    }
    /**
     * @return <i>Force install into shared directories</i>
     * @see SettingsTab
     */
    static String cbLocation_InstallGlobal() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "cbLocation_InstallGlobal");
    }
    /**
     * @return <i>Force install into user directory</i>
     * @see SettingsTab
     */
    static String cbLocation_InstallLocal() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "cbLocation_InstallLocal");
    }
    /**
     * @param message_of_exception message of exception
     * @return <i>The validation of download plugins cannot be completed, cause: </i>{@code message_of_exception}
     * @see ProblemPanel
     */
    static String install_taMessage_ErrorText(Object message_of_exception) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "install_taMessage_ErrorText", message_of_exception);
    }
    /**
     * @return <i>Cannot complete the validation of download plugins</i>
     * @see ProblemPanel
     */
    static String install_taTitle_Text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "install_taTitle_Text");
    }
    /**
     * @param message_of_exception message of exception
     * @return <i>The installation of download plugins cannot be completed, cause: </i>{@code message_of_exception}
     * @see ProblemPanel
     */
    static String modified_taMessage_ErrorText(Object message_of_exception) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "modified_taMessage_ErrorText", message_of_exception);
    }
    /**
     * @param plugin_name plugin name
     * @return <i>Module </i>{@code plugin_name}<i> has been modified and cannot be installed.</i>
     * @see ProblemPanel
     */
    static String modified_taTitle_Text(Object plugin_name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "modified_taTitle_Text", plugin_name);
    }
    /**
     * @return <i>Unable to connect  to the NetBeans plugin portal</i>
     * @see ModuleInstallerSupport
     */
    static String networkproblem_header() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "networkproblem_header");
    }
    /**
     * @return <i>Check your proxy settings or try again later. The server may be unavailable at the moment. You may also want to make sure that your firewall is not blocking network traffic.</i>
     * @see ModuleInstallerSupport
     */
    static String networkproblem_message() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "networkproblem_message");
    }
    /**
     * @return <i>Modules have not been downloaded</i>
     * @see ModuleInstallerSupport
     */
    static String nodownload_header() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "nodownload_header");
    }
    /**
     * @return <i>"</i>{@code arg0}<i>" module has not been downloaded</i>
     * @see ModuleInstallerSupport
     */
    static String nodownload_header_single(Object arg0) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "nodownload_header_single", arg0);
    }
    /**
     * @return <i>You can try to download modules again</i>
     * @see ModuleInstallerSupport
     */
    static String nodownload_message() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "nodownload_message");
    }
    /**
     * @return <i>You can try to download "</i>{@code arg0}<i>" module again</i>
     * @see ModuleInstallerSupport
     */
    static String nodownload_message_single(Object arg0) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "nodownload_message_single", arg0);
    }
    /**
     * @return <i>&amp;Proxy Settings...</i>
     * @see ModuleInstallerSupport
     */
    static String proxy_button() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "proxy_button");
    }
    /**
     * @return <i>Not all of the plugins have been successfully downloaded. The server may be unavailable at the moment. Try again later.</i>
     * @see ProblemPanel
     */
    static String proxy_taMessage_ErrorText() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "proxy_taMessage_ErrorText");
    }
    /**
     * @return <i>Check your proxy settings or try again later. The server may be unavailable at the moment. <br><br>You may also want to make sure that your firewall is not blocking network traffic.</i>
     * @see ProblemPanel
     */
    static String proxy_taMessage_WarningText() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "proxy_taMessage_WarningText");
    }
    /**
     * @return <i>Check your proxy settings or try again later. The server may be unavailable at the moment. <br><br>You may also want to make sure that your firewall is not blocking network traffic. <br><br>Your cache may be out of date. Please click Check for Updates to refresh content.</i>
     * @see ProblemPanel
     */
    static String proxy_taMessage_WarningTextWithReload() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "proxy_taMessage_WarningTextWithReload");
    }
    /**
     * @return <i>Unable to connect to the Update Center</i>
     * @see ProblemPanel
     */
    static String proxy_taTitle_Text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "proxy_taTitle_Text");
    }
    /**
     * @return <i>Resolve Reference Problem</i>
     * @see ModuleInstallerSupport
     */
    static String resolve_title() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "resolve_title");
    }
    /**
     * @return <i>Resolve "</i>{@code arg0}<i>" Reference Problem</i>
     * @see ModuleInstallerSupport
     */
    static String resolve_title_single(Object arg0) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "resolve_title_single", arg0);
    }
    /**
     * @return <i>Searching for modules on NetBeans plugin portal...</i>
     * @see ModuleInstallerSupport
     */
    static String searching_handle() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "searching_handle");
    }
    /**
     * @return <i>Searching for "</i>{@code arg0}<i>" module on NetBeans plugin portal...</i>
     * @see ModuleInstallerSupport
     */
    static String searching_handle_single(Object arg0) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "searching_handle_single", arg0);
    }
    /**
     * @return <i>Try &amp;Again</i>
     * @see ModuleInstallerSupport
     */
    static String tryagain_button() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "tryagain_button");
    }
    /**
     * @param file_path file path
     * @return <i>Plugin </i>{@code file_path}<i> is already installed.</i>
     * @see AvailableTableModel
     */
    static String unit_already_installed(Object file_path) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "unit_already_installed", file_path);
    }
    /**
     * @return <i>To perform installation into the installation directory, you should run the application as a user with administrative privilege, i.e. &lt;i>Run as administrator&lt;/i> on Windows platform or run as &lt;i>sudo&lt;/i> command on Unix-like systems.</i>
     * @see ProblemPanel
     */
    static String write_taMessage_WarningText() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "write_taMessage_WarningText");
    }
    /**
     * @param plugin_name plugin_name
     * @return <i>You don''t have permission to install plugin &lt;b></i>{@code plugin_name}<i>&lt;/b> into the installation directory.</i>
     * @see ProblemPanel
     */
    static String write_taTitle_Text(Object plugin_name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "write_taTitle_Text", plugin_name);
    }
    private Bundle() {}
}
