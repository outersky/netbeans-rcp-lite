package org.netbeans.api.keyring;
/** Localizable strings for {@link org.netbeans.api.keyring}. */
class Bundle {
    /**
     * @return <i>Requesting keyring access</i>
     * @see Keyring
     */
    static String MSG_KeyringAccess() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "MSG_KeyringAccess");
    }
    private Bundle() {}
}
