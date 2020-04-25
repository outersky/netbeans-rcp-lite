package org.netbeans.modules.quicksearch.recent;
/** Localizable strings for {@link org.netbeans.modules.quicksearch.recent}. */
class Bundle {
    /**
     * @return <i>Searching for a Quick Search Item</i>
     * @see RecentSearches
     */
    static String LBL_SearchingRecentResult() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "LBL_SearchingRecentResult");
    }
    /**
     * @return <i>Recent Quick Search Item was not found.</i>
     * @see RecentSearches
     */
    static String MSG_RecentResultNotFound() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_RecentResultNotFound");
    }
    /**
     * @return <i>(Clear recent searches)</i>
     * @see RecentProvider
     */
    static String RecentSearches_clear() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "RecentSearches.clear");
    }
    private Bundle() {}
}
