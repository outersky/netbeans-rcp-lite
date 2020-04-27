package org.netbeans.core.windows.actions;
/** Localizable strings for {@link org.netbeans.core.windows.actions}. */
class Bundle {
    /**
     * @return <i>Save Window Setup</i>
     * @see SaveWindowsAction
     */
    static String CTL_SaveWindowsAction() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CTL_SaveWindowsAction");
    }
    /**
     * @return <i>Switch Role</i>
     * @see SwitchRoleKeepDocumentsAction
     */
    static String CTL_SwitchRoleKeepDocumentsAction() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CTL_SwitchRoleKeepDocumentsAction");
    }
    private Bundle() {}
}
