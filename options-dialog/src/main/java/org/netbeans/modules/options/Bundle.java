package org.netbeans.modules.options;
/** Localizable strings for {@link org.netbeans.modules.options}. */
class Bundle {
    /**
     * @param name_of_the_category_button name of the category button
     * @return {@code name_of_the_category_button}<i> category button. Use the arrow keys to move between top level categories.</i>
     * @see OptionsPanel
     */
    static String CategoryButton_AccessibleDescription(Object name_of_the_category_button) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CategoryButton_AccessibleDescription", name_of_the_category_button);
    }
    /**
     * @param shortcut_to_access_the_search_text_field shortcut to access the search text field
     * @return <i>Filter (</i>{@code shortcut_to_access_the_search_text_field}<i>)</i>
     * @see OptionsPanel
     */
    static String Filter_Textfield_Hint(Object shortcut_to_access_the_search_text_field) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Filter_Textfield_Hint", shortcut_to_access_the_search_text_field);
    }
    /**
     * @return <i>Press Esc or Enter with empty text to clear the filter</i>
     * @see OptionsPanel
     */
    static String Filter_Textfield_Tooltip() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Filter_Textfield_Tooltip");
    }
    /**
     * @return <i>Please wait while getting config file.</i>
     * @see OptionsDisplayerImpl
     */
    static String Get_Config_File_Lengthy_Operation() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Get_Config_File_Lengthy_Operation");
    }
    /**
     * @return <i>Please wait while help context is being loaded.</i>
     * @see OptionsDisplayerImpl
     */
    static String Loading_HelpCtx_Lengthy_Operation() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Loading_HelpCtx_Lengthy_Operation");
    }
    /**
     * @return <i>Please wait while options are being saved.</i>
     * @see OptionsDisplayerImpl
     */
    static String Saving_Options_Lengthy_Operation() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Saving_Options_Lengthy_Operation");
    }
    /**
     * @return <i>Lengthy operation in progress</i>
     * @see OptionsDisplayerImpl
     */
    static String Saving_Options_Lengthy_Operation_Title() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Saving_Options_Lengthy_Operation_Title");
    }
    private Bundle() {}
}
