package org.netbeans.modules.autoupdate.ui.wizards;
/** Localizable strings for {@link org.netbeans.modules.autoupdate.ui.wizards}. */
class Bundle {
    /**
     * @return <i>The Plugin Installer has successfully activated the following plugins:</i>
     * @see UninstallStep
     */
    static String UninstallStep_ActivateDone_Text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "UninstallStep_ActivateDone_Text");
    }
    /**
     * @param An_error_message An error message
     * @return <i>Activation failed: </i>{@code An_error_message}
     * @see UninstallStep
     */
    static String UninstallStep_ActivateFailed_Text(Object An_error_message) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "UninstallStep_ActivateFailed_Text", An_error_message);
    }
    /**
     * @return <i>The Plugin Installer has successfully activated the following plugins:</i>
     * @see UninstallStep
     */
    static String UninstallStep_ActivateLater_Text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "UninstallStep_ActivateLater_Text");
    }
    /**
     * @return <i>The Plugin Installer has successfully deactivated the following plugins:</i>
     * @see UninstallStep
     */
    static String UninstallStep_DeactivateDone_Text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "UninstallStep_DeactivateDone_Text");
    }
    /**
     * @param An_error_message An error message
     * @return <i>Deactivation failed: </i>{@code An_error_message}
     * @see UninstallStep
     */
    static String UninstallStep_DeactivateFailed_Text(Object An_error_message) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "UninstallStep_DeactivateFailed_Text", An_error_message);
    }
    /**
     * @return <i>The Plugin Installer has successfully deactivated the following plugins:</i>
     * @see UninstallStep
     */
    static String UninstallStep_DeactivateLater_Text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "UninstallStep_DeactivateLater_Text");
    }
    /**
     * @return <i>Done.</i>
     * @see UninstallStep
     */
    static String UninstallStep_Done() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "UninstallStep_Done");
    }
    /**
     * @param A_error_message A error message
     * @return <i>Failed. </i>{@code A_error_message}
     * @see UninstallStep
     */
    static String UninstallStep_Failed(Object A_error_message) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "UninstallStep_Failed", A_error_message);
    }
    /**
     * @return <i>Click Finish to quit the plugin installer.</i>
     * @see UninstallStep
     */
    static String UninstallStep_Header_ActivateDone_Content() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "UninstallStep_Header_ActivateDone_Content");
    }
    /**
     * @return <i>Activation completed successfully</i>
     * @see UninstallStep
     */
    static String UninstallStep_Header_ActivateDone_Head() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "UninstallStep_Header_ActivateDone_Head");
    }
    /**
     * @return <i>Click Cancel to quit the plugin installer.</i>
     * @see UninstallStep
     */
    static String UninstallStep_Header_ActivateFailed_Content() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "UninstallStep_Header_ActivateFailed_Content");
    }
    /**
     * @return <i>Activation failed</i>
     * @see UninstallStep
     */
    static String UninstallStep_Header_ActivateFailed_Head() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "UninstallStep_Header_ActivateFailed_Head");
    }
    /**
     * @return <i>Please wait until the installer finishes activating all the selected plugins.</i>
     * @see UninstallStep
     */
    static String UninstallStep_Header_Activate_Content() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "UninstallStep_Header_Activate_Content");
    }
    /**
     * @return <i>Activation</i>
     * @see UninstallStep
     */
    static String UninstallStep_Header_Activate_Head() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "UninstallStep_Header_Activate_Head");
    }
    /**
     * @return <i>Click Finish to quit the plugin installer.</i>
     * @see UninstallStep
     */
    static String UninstallStep_Header_DeactivateDone_Content() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "UninstallStep_Header_DeactivateDone_Content");
    }
    /**
     * @return <i>Deactivation completed successfully</i>
     * @see UninstallStep
     */
    static String UninstallStep_Header_DeactivateDone_Head() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "UninstallStep_Header_DeactivateDone_Head");
    }
    /**
     * @return <i>Click Cancel to quit the plugin installer.</i>
     * @see UninstallStep
     */
    static String UninstallStep_Header_DeactivateFailed_Content() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "UninstallStep_Header_DeactivateFailed_Content");
    }
    /**
     * @return <i>Deactivation failed</i>
     * @see UninstallStep
     */
    static String UninstallStep_Header_DeactivateFailed_Head() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "UninstallStep_Header_DeactivateFailed_Head");
    }
    /**
     * @return <i>Please wait until the installer finishes deactivating all the selected plugins.</i>
     * @see UninstallStep
     */
    static String UninstallStep_Header_Deactivate_Content() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "UninstallStep_Header_Deactivate_Content");
    }
    /**
     * @return <i>Deactivation</i>
     * @see UninstallStep
     */
    static String UninstallStep_Header_Deactivate_Head() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "UninstallStep_Header_Deactivate_Head");
    }
    /**
     * @return <i>Restart application to finish plugin deactivation.</i>
     * @see UninstallStep
     */
    static String UninstallStep_Header_Restart_Content() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "UninstallStep_Header_Restart_Content");
    }
    /**
     * @return <i>Restart application to complete deactivation</i>
     * @see UninstallStep
     */
    static String UninstallStep_Header_Restart_Head() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "UninstallStep_Header_Restart_Head");
    }
    /**
     * @return <i>Click Finish to quit the plugin installer.</i>
     * @see UninstallStep
     */
    static String UninstallStep_Header_UninstallDone_Content() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "UninstallStep_Header_UninstallDone_Content");
    }
    /**
     * @return <i>Uninstallation completed successfully</i>
     * @see UninstallStep
     */
    static String UninstallStep_Header_UninstallDone_Head() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "UninstallStep_Header_UninstallDone_Head");
    }
    /**
     * @return <i>Click Cancel to quit the plugin installer.</i>
     * @see UninstallStep
     */
    static String UninstallStep_Header_UninstallFailed_Content() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "UninstallStep_Header_UninstallFailed_Content");
    }
    /**
     * @return <i>Uninstallation failed</i>
     * @see UninstallStep
     */
    static String UninstallStep_Header_UninstallFailed_Head() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "UninstallStep_Header_UninstallFailed_Head");
    }
    /**
     * @return <i>Please wait until the installer uninstalls all the selected plugins.</i>
     * @see UninstallStep
     */
    static String UninstallStep_Header_Uninstall_Content() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "UninstallStep_Header_Uninstall_Content");
    }
    /**
     * @return <i>Uninstallation</i>
     * @see UninstallStep
     */
    static String UninstallStep_Header_Uninstall_Head() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "UninstallStep_Header_Uninstall_Head");
    }
    /**
     * @param invalid_elements invalid elements
     * @return <i>Found invalid element(s) </i>{@code invalid_elements}<i> for that operation.</i>
     * @see UninstallStep
     */
    static String UninstallStep_NullSupport_InvalidElements(Object invalid_elements) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "UninstallStep_NullSupport_InvalidElements", invalid_elements);
    }
    /**
     * @return <i>Not found any elements for that operation.</i>
     * @see UninstallStep
     */
    static String UninstallStep_NullSupport_NullElements() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "UninstallStep_NullSupport_NullElements");
    }
    /**
     * @return <i>Activating plugins</i>
     * @see UninstallStep
     */
    static String UninstallStep_ProgressName_Activate() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "UninstallStep_ProgressName_Activate");
    }
    /**
     * @return <i>Deactivating plugins</i>
     * @see UninstallStep
     */
    static String UninstallStep_ProgressName_Deactivate() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "UninstallStep_ProgressName_Deactivate");
    }
    /**
     * @return <i>Uninstalling plugins</i>
     * @see UninstallStep
     */
    static String UninstallStep_ProgressName_Uninstall() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "UninstallStep_ProgressName_Uninstall");
    }
    /**
     * @return <i>The Plugin Installer has successfully uninstalled the following plugins:</i>
     * @see UninstallStep
     */
    static String UninstallStep_UninstallDone_Text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "UninstallStep_UninstallDone_Text");
    }
    /**
     * @param An_error_message An error message
     * @return <i>Uninstallation failed: </i>{@code An_error_message}
     * @see UninstallStep
     */
    static String UninstallStep_UninstallFailed_Text(Object An_error_message) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "UninstallStep_UninstallFailed_Text", An_error_message);
    }
    /**
     * @return <i>The Plugin Installer has successfully uninstalled the following plugins:</i>
     * @see UninstallStep
     */
    static String UninstallStep_UninstallLater_Text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "UninstallStep_UninstallLater_Text");
    }
    /**
     * @return <i>Restart the application to complete the deactivation.</i>
     * @see UninstallStep
     */
    static String UninstallSupport_RestartNeeded() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "UninstallSupport_RestartNeeded");
    }
    /**
     * @return <i>Cancel</i>
     * @see InstallStep
     */
    static String cancel() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "cancel");
    }
    /**
     * @param plugin_name plugin_name
     * @return <i>You don''t have permission to install plugin </i>{@code plugin_name}<i> into the installation directory.</i>
     * @see InstallStep
     */
    static String inBackground_WritePermission(Object plugin_name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "inBackground_WritePermission", plugin_name);
    }
    /**
     * @return <i>details</i>
     * @see InstallStep
     */
    static String inBackground_WritePermission_Details() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "inBackground_WritePermission_Details");
    }
    /**
     * @return <i>Install anyway</i>
     * @see InstallStep
     */
    static String install() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "install");
    }
    private Bundle() {}
}
