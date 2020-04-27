package org.netbeans.core.ui.warmup;
/** Localizable strings for {@link org.netbeans.core.ui.warmup}. */
class Bundle {
    /**
     * @return <i>Checking for external changes</i>
     * @see MenuWarmUpTask
     */
    static String MSG_Refresh() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_Refresh");
    }
    /**
     * @return <i>10000</i>
     * @see MenuWarmUpTask
     */
    static String MSG_RefreshDelay() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_RefreshDelay");
    }
    /**
     * @return <i>Suspended</i>
     * @see MenuWarmUpTask
     */
    static String MSG_Refresh_Suspend() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_Refresh_Suspend");
    }
    private Bundle() {}
}
