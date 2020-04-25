package org.netbeans.modules.masterfs.ui.suspend;
/** Localizable strings for {@link org.netbeans.modules.masterfs.ui.suspend}. */
class Bundle {
    /**
     * @return <i>Pause I/O Checks</i>
     * @see PauseAction
     */
    static String CTL_PauseAction() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CTL_PauseAction");
    }
    /**
     * @param number_of_pending_events number of pending events
     * @return <i>Resume (pending events: </i>{@code number_of_pending_events}<i>)</i>
     * @see PauseAction
     */
    static String MSG_Resume(Object number_of_pending_events) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_Resume", number_of_pending_events);
    }
    private Bundle() {}
}
