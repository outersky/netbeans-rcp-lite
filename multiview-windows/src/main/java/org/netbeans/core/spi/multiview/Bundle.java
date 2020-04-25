package org.netbeans.core.spi.multiview;
/** Localizable strings for {@link org.netbeans.core.spi.multiview}. */
class Bundle {
    /**
     * @return <i>&amp;Discard</i>
     * @see MultiViewFactory
     */
    static String CTL_Discard() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CTL_Discard");
    }
    /**
     * @return <i>Save</i>
     * @see MultiViewFactory
     */
    static String CTL_Save() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CTL_Save");
    }
    private Bundle() {}
}
