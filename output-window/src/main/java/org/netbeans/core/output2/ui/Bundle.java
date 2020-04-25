package org.netbeans.core.output2.ui;
/** Localizable strings for {@link org.netbeans.core.output2.ui}. */
class Bundle {
    /**
     * @return <i>Terminate the process?</i>
     * @see AbstractOutputPane
     */
    static String MSG_TerminateProcess() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_TerminateProcess");
    }
    /**
     * @return <i>Selecting large parts of text can cause Out-Of-Memory errors. Do you want to continue?</i>
     * @see AbstractOutputPane
     */
    static String MSG_TooMuchTextSelected() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_TooMuchTextSelected");
    }
    private Bundle() {}
}
