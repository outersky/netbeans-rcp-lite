package org.netbeans.modules.templates.ui;
/** Localizable strings for {@link org.netbeans.modules.templates.ui}. */
class Bundle {
    /**
     * @return <i>&amp;Rename</i>
     * @see TemplatesPanel
     */
    static String Action_Rename() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Action_Rename");
    }
    /**
     * @return <i>&amp;Add...</i>
     * @see TemplatesPanel
     */
    static String BTN_TemplatesPanel_Add() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "BTN_TemplatesPanel_Add");
    }
    /**
     * @return <i>Add</i>
     * @see TemplatesPanel
     */
    static String BTN_TemplatesPanel_JFileChooser_AddButtonName() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "BTN_TemplatesPanel_JFileChooser_AddButtonName");
    }
    /**
     * @return <i>&amp;New Folder</i>
     * @see TemplatesPanel
     */
    static String BTN_TemplatesPanel_NewFolder() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "BTN_TemplatesPanel_NewFolder");
    }
    /**
     * @return <i>Template with this file name already exists.</i>
     * @see RenameTemplatePanel
     */
    static String Err_FileNameExists() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "Err_FileNameExists");
    }
    /**
     * @return <i>Add Existing Template</i>
     * @see TemplatesPanel
     */
    static String LBL_TemplatesPanel_JFileChooser_Title() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "LBL_TemplatesPanel_JFileChooser_Title");
    }
    /**
     * @param The_file_name The file name
     * @return <i>The file </i>{@code The_file_name}<i> is in use.</i>
     * @see TemplatesPanel
     */
    static String MSG_FileIsLocked(Object The_file_name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_FileIsLocked", The_file_name);
    }
    /**
     * @param file_name file name
     * @return <i>File ''</i>{@code file_name}<i>''<br>does not exist, please specify an existing file.</i>
     * @see TemplatesPanel
     */
    static String MSG_TemplatesPanel_Nonexistent_File(Object file_name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_TemplatesPanel_Nonexistent_File", file_name);
    }
    /**
     * @param prefix_of_the_license_file_name prefix of the license file name
     * @param suffix_of_the_license_file_name suffix of the license file name
     * @return <i>License file name must start with "</i>{@code prefix_of_the_license_file_name}<i>" and end with "</i>{@code suffix_of_the_license_file_name}<i>".</i>
     * @see RenameTemplatePanel
     */
    static String RenameTemplatePanel_license_warning_text(Object prefix_of_the_license_file_name, Object suffix_of_the_license_file_name) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "RenameTemplatePanel.license.warning.text", prefix_of_the_license_file_name, suffix_of_the_license_file_name);
    }
    /**
     * @return <i>Rename Template</i>
     * @see TemplatesPanel
     */
    static String RenameTemplatePanel_title_text() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "RenameTemplatePanel.title.text");
    }
    /**
     * @return <i>New Folder</i>
     * @see TemplatesPanel
     */
    static String TXT_TemplatesPanel_NewFolderName() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TXT_TemplatesPanel_NewFolderName");
    }
    /**
     * @return <i>Display Name</i>
     * @see TemplatesPanel
     */
    static String TemplatesPanel_TemplateNode_DisplayName() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TemplatesPanel_TemplateNode_DisplayName");
    }
    /**
     * @return <i>Display name of this template. Shown in File|New wizard as well as in Tools|Templates.</i>
     * @see TemplatesPanel
     */
    static String TemplatesPanel_TemplateNode_DisplayName_Desc() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TemplatesPanel_TemplateNode_DisplayName_Desc");
    }
    /**
     * @return <i>File Name</i>
     * @see TemplatesPanel
     */
    static String TemplatesPanel_TemplateNode_FileName() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TemplatesPanel_TemplateNode_FileName");
    }
    /**
     * @return <i>File name of file represented by this template.</i>
     * @see TemplatesPanel
     */
    static String TemplatesPanel_TemplateNode_FileName_Desc() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TemplatesPanel_TemplateNode_FileName_Desc");
    }
    /**
     * @return <i>License URL(s)</i>
     * @see TemplatesPanel
     */
    static String TemplatesPanel_TemplateNode_License() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TemplatesPanel_TemplateNode_License");
    }
    /**
     * @return <i>Authoritative web location of this license (may include several separated by spaces).</i>
     * @see TemplatesPanel
     */
    static String TemplatesPanel_TemplateNode_License_Desc() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TemplatesPanel_TemplateNode_License_Desc");
    }
    /**
     * @return <i>Script Engine</i>
     * @see TemplatesPanel
     */
    static String TemplatesPanel_TemplateNode_ScriptEngine() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TemplatesPanel_TemplateNode_ScriptEngine");
    }
    /**
     * @return <i>Script engine use for processing this template.</i>
     * @see TemplatesPanel
     */
    static String TemplatesPanel_TemplateNode_ScriptEngine_Desc() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TemplatesPanel_TemplateNode_ScriptEngine_Desc");
    }
    /**
     * @return <i>Template Categories</i>
     * @see TemplatesPanel
     */
    static String TemplatesPanel_TemplateNode_TemplateCategories() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TemplatesPanel_TemplateNode_TemplateCategories");
    }
    /**
     * @return <i>A list of template's categories appropriate for this template.</i>
     * @see TemplatesPanel
     */
    static String TemplatesPanel_TemplateNode_TemplateCategories_Desc() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TemplatesPanel_TemplateNode_TemplateCategories_Desc");
    }
    private Bundle() {}
}
