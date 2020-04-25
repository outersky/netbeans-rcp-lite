package org.netbeans.core.ui;
/** Localizable strings for {@link org.netbeans.core.ui}. */
class Bundle {
    /**
     * @param product_version product version
     * @param Java_version Java version
     * @param VM_version VM version
     * @param OS OS
     * @param encoding encoding
     * @param locale locale
     * @param user_dir user dir
     * @param cache_dir cache dir
     * @param updates updates
     * @param font_size font size
     * @param Java_runtime Java runtime
     * @return <i>&lt;div style="font-size: </i>{@code font_size}<i>pt; font-family: Verdana, 'Verdana CE',  Arial, 'Arial CE', 'Lucida Grande CE', lucida, 'Helvetica CE', sans-serif;">&lt;p style="margin: 0">&lt;b>Product Version:&lt;/b> </i>{@code product_version}<i>&lt;/p><br> </i>{@code updates}<i>&lt;p style="margin: 0">&lt;b>Java:&lt;/b> </i>{@code Java_version}<i>; </i>{@code VM_version}<i>&lt;/p><br> &lt;p style="margin: 0">&lt;b>Runtime:&lt;/b> </i>{@code Java_runtime}<i>&lt;/p><br> &lt;p style="margin: 0">&lt;b>System:&lt;/b> </i>{@code OS}<i>; </i>{@code encoding}<i>; </i>{@code locale}<i>&lt;/p><br> &lt;p style="margin: 0">&lt;b>User directory:&lt;/b> </i>{@code user_dir}<i>&lt;/p><br> &lt;p style="margin: 0">&lt;b>Cache directory:&lt;/b> </i>{@code cache_dir}<i>&lt;/p>&lt;/div></i>
     * @see ProductInformationPanel
     */
    static String LBL_description(Object product_version, Object Java_version, Object VM_version, Object OS, Object encoding, Object locale, Object user_dir, Object cache_dir, Object updates, Object font_size, Object Java_runtime) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "LBL_description", product_version, Java_version, VM_version, OS, encoding, locale, user_dir, cache_dir, updates, font_size, Java_runtime);
    }
    /**
     * @return <i>Check for Updates</i>
     * @see ProductInformationPanel
     */
    static String check_for_updates() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "check_for_updates");
    }
    /**
     * @return <i>to version </i>{@code arg0}
     * @see ProductInformationPanel
     */
    static String to_version(Object arg0) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "to_version", arg0);
    }
    /**
     * @param content_description content description
     * @return <i>&lt;p style="margin: 0">&lt;b>Updates:&lt;/b> &lt;a href="check-for-updates">Updates available&lt;/a> </i>{@code content_description}<i>&lt;/p><br> </i>
     * @see ProductInformationPanel
     */
    static String updates_found(Object content_description) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "updates_found", content_description);
    }
    /**
     * @param content_description content description
     * @return <i>&lt;p style="margin: 0">&lt;b>Updates:&lt;/b> NetBeans IDE is updated to version </i>{@code content_description}<i>&lt;/p><br> </i>
     * @see ProductInformationPanel
     */
    static String updates_not_found(Object content_description) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "updates_not_found", content_description);
    }
    private Bundle() {}
}
