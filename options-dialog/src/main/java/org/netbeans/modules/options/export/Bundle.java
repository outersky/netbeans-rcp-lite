package org.netbeans.modules.options.export;
/** Localizable strings for {@link org.netbeans.modules.options.export}. */
class Bundle {
    /**
     * @param path_where_the_exported_options_are_saved path where the exported options are saved
     * @return <i>File saved at </i>{@code path_where_the_exported_options_are_saved}
     * @see OptionsChooserPanel
     */
    static String Export_Notification_DetailsText(Object path_where_the_exported_options_are_saved) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Export_Notification_DetailsText", path_where_the_exported_options_are_saved);
    }
    /**
     * @return <i>false</i>
     * @see OptionsChooserPanel
     */
    static String OPT_RestartAfterImport() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "OPT_RestartAfterImport");
    }
    /**
     * @return <i>Exporting Options</i>
     * @see OptionsChooserPanel
     */
    static String ProgressHandle_Export_DisplayName() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ProgressHandle_Export_DisplayName");
    }
    private Bundle() {}
}
