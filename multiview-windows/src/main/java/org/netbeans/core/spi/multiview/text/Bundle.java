package org.netbeans.core.spi.multiview.text;
/** Localizable strings for {@link org.netbeans.core.spi.multiview.text}. */
class Bundle {
    /**
     * @param file_name file name
     * @return <i>File </i>{@code file_name}<i> is modified. Save?</i>
     * @see MultiViewCloneableEditor
     */
    static String MSG_SaveModified(Object file_name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_SaveModified", file_name);
    }
    /**
     * @return <i>File is modified. Save?</i>
     * @see MultiViewCloneableEditor
     */
    static String MSG_SaveModified_no_name() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_SaveModified_no_name");
    }
    private Bundle() {}
}
