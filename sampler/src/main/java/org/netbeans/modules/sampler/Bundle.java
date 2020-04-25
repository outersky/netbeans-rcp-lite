package org.netbeans.modules.sampler;
/** Localizable strings for {@link org.netbeans.modules.sampler}. */
class Bundle {
    /**
     * @return <i>Saving snapshot</i>
     * @see InternalSampler
     */
    static String Save_Progress() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Save_Progress");
    }
    /**
     * @return <i>Snapshot was saved to </i>{@code arg0}
     * @see InternalSampler
     */
    static String SelfSamplerAction_SavedFile(Object arg0) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "SelfSamplerAction_SavedFile", arg0);
    }
    private Bundle() {}
}
