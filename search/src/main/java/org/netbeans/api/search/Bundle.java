package org.netbeans.api.search;
/** Localizable strings for {@link org.netbeans.api.search}. */
class Bundle {
    /**
     * @return <i>Basic Wildcards</i>
     * @see SearchPattern
     */
    static String LBL_MatchType_Basic_Wildcards() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "LBL_MatchType_Basic_Wildcards");
    }
    /**
     * @return <i>Literal</i>
     * @see SearchPattern
     */
    static String LBL_MatchType_Literal() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "LBL_MatchType_Literal");
    }
    /**
     * @return <i>Regular Expression</i>
     * @see SearchPattern
     */
    static String LBL_MatchType_Regular_Expression() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "LBL_MatchType_Regular_Expression");
    }
    private Bundle() {}
}
