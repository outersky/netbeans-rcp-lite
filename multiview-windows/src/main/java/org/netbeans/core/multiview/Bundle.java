package org.netbeans.core.multiview;
/** Localizable strings for {@link org.netbeans.core.multiview}. */
class Bundle {
    /**
     * @return <i>Empty</i>
     * @see EmptyViewDescription
     */
    static String CTL_EmptyViewName() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CTL_EmptyViewName");
    }
    /**
     * @return <i>&amp;Split</i>
     * @see SplitAction
     */
    static String CTL_SplitAction() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CTL_SplitAction");
    }
    /**
     * @return <i>&amp;Split Document</i>
     * @see SplitAction
     */
    static String CTL_SplitDocumentAction() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CTL_SplitDocumentAction");
    }
    /**
     * @return <i>Cannot find registrations for mime type "</i>{@code arg0}<i>".  Consider usage of &#64;MultiViewElement.Registration!</i>
     * @see EmptyViewDescription
     */
    static String ERR_EmptyView(Object arg0) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ERR_EmptyView", arg0);
    }
    /**
     * @return <i>Do you really want to clear the split?</i>
     * @see TabsComponent
     */
    static String LBL_ClearAllSplitsDialogMessage() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "LBL_ClearAllSplitsDialogMessage");
    }
    /**
     * @return <i>Clear Split</i>
     * @see TabsComponent
     */
    static String LBL_ClearAllSplitsDialogTitle() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "LBL_ClearAllSplitsDialogTitle");
    }
    /**
     * @return <i>&amp;Clear</i>
     * @see ClearSplitAction
     */
    static String LBL_ClearSplitAction() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "LBL_ClearSplitAction");
    }
    /**
     * @return <i>&amp;Horizontally</i>
     * @see SplitDocumentHorizontallyAction
     */
    static String LBL_SplitDocumentActionHorizontal() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "LBL_SplitDocumentActionHorizontal");
    }
    /**
     * @return <i>&amp;Vertically</i>
     * @see SplitDocumentVerticallyAction
     */
    static String LBL_SplitDocumentActionVertical() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "LBL_SplitDocumentActionVertical");
    }
    /**
     * @return <i>clearSplit</i>
     * @see ClearSplitAction
     */
    static String LBL_ValueClearSplit() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "LBL_ValueClearSplit");
    }
    /**
     * @return <i>Split horizontally</i>
     * @see SplitDocumentHorizontallyAction
     */
    static String LBL_ValueSplitHorizontal() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "LBL_ValueSplitHorizontal");
    }
    /**
     * @return <i>Split vertically</i>
     * @see SplitDocumentVerticallyAction
     */
    static String LBL_ValueSplitVertical() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "LBL_ValueSplitVertical");
    }
    /**
     * @return <i>true</i>
     * @see SplitAction
     */
    static String MultiViewElement_Spliting_Enabled() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MultiViewElement.Spliting.Enabled");
    }
    private Bundle() {}
}
