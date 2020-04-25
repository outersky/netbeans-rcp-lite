package org.netbeans.modules.openide.explorer;
/** Localizable strings for {@link org.netbeans.modules.openide.explorer}. */
class Bundle {
    /**
     * @param name name
     * @return <i>Are you sure you want to delete </i>{@code name}<i>?</i>
     * @see ExplorerActionsImpl
     */
    static String MSG_ConfirmDeleteObject(Object name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_ConfirmDeleteObject", name);
    }
    /**
     * @return <i>Confirm Object Deletion</i>
     * @see ExplorerActionsImpl
     */
    static String MSG_ConfirmDeleteObjectTitle() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_ConfirmDeleteObjectTitle");
    }
    /**
     * @param number_of_objects number of objects
     * @return <i>Are you sure you want to delete these </i>{@code number_of_objects}<i> items?</i>
     * @see ExplorerActionsImpl
     */
    static String MSG_ConfirmDeleteObjects(Object number_of_objects) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_ConfirmDeleteObjects", number_of_objects);
    }
    /**
     * @return <i>Confirm Multiple Object Deletion</i>
     * @see ExplorerActionsImpl
     */
    static String MSG_ConfirmDeleteObjectsTitle() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_ConfirmDeleteObjectsTitle");
    }
    private Bundle() {}
}
