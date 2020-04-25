package org.openide.io;
/** Localizable strings for {@link org.openide.io}. */
class Bundle {
    /**
     * @return <i>Standard output</i>
     * @see BridgingIOProvider
     */
    static String LBL_STDOUT() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "LBL_STDOUT");
    }
    private Bundle() {}
}
