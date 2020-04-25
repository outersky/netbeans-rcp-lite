package org.openide.explorer;
/** Localizable strings for {@link org.openide.explorer}. */
class Bundle {
    /**
     * @return <i>Cannot have null root context.</i>
     * @see ExplorerManager
     */
    static String EXC_CannotHaveNullRootContext() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "EXC_CannotHaveNullRootContext");
    }
    /**
     * @param name_of_node_to_be_selected name of node to be selected
     * @param name_of_node_at_root name of node at root
     * @return <i>An explored context (</i>{@code name_of_node_to_be_selected}<i>) must be within the root context (</i>{@code name_of_node_at_root}<i>).</i>
     * @see ExplorerManager
     */
    static String EXC_ContextMustBeWithinRootContext(Object name_of_node_to_be_selected, Object name_of_node_at_root) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "EXC_ContextMustBeWithinRootContext", name_of_node_to_be_selected, name_of_node_at_root);
    }
    /**
     * @return <i>No element of a node selection may be null.</i>
     * @see ExplorerManager
     */
    static String EXC_NoElementOfNodeSelectionMayBeNull() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "EXC_NoElementOfNodeSelectionMayBeNull");
    }
    /**
     * @return <i>Cannot use null for node selection.</i>
     * @see ExplorerManager
     */
    static String EXC_NodeCannotBeNull() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "EXC_NodeCannotBeNull");
    }
    /**
     * @param name_of_old_node name of old node
     * @return <i>Could not restore Explorer window; the root node "</i>{@code name_of_old_node}<i>" could not be restored correctly.</i>
     * @see ExplorerManager
     */
    static String EXC_handle_failed(Object name_of_old_node) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "EXC_handle_failed", name_of_old_node);
    }
    private Bundle() {}
}
