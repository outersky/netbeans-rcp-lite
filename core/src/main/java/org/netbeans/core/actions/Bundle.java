package org.netbeans.core.actions;
/** Localizable strings for {@link org.netbeans.core.actions}. */
class Bundle {
    /**
     * @return <i>IDE &amp;Log</i>
     * @see LogAction
     */
    static String MSG_LogTab_name() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_LogTab_name");
    }
    /**
     * @return <i>IDE Log</i>
     * @see LogAction
     */
    static String MSG_ShortLogTab_name() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_ShortLogTab_name");
    }
    private Bundle() {}
}
