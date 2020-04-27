package org.netbeans.core.windows.documentgroup;
/** Localizable strings for {@link org.netbeans.core.windows.documentgroup}. */
class Bundle {
    /**
     * @return <i>&lt;none></i>
     * @see GroupsMenuAction
     */
    static String CTL_CloseDocumentGroupAction() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CTL_CloseDocumentGroupAction");
    }
    /**
     * @return <i>Manage...</i>
     * @see GroupsMenuAction
     */
    static String CTL_ManageGroupsAction() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CTL_ManageGroupsAction");
    }
    /**
     * @return <i>New Document Group...</i>
     * @see GroupsMenuAction
     */
    static String CTL_NewGroupAction() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CTL_NewGroupAction");
    }
    private Bundle() {}
}
