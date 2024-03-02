/* 
* Nome: Joaquim Fontes Matos
* Número: 8220216
* Turma: LEI12T3
* 
* Nome: Leonardo Henrique Barbosa Da Silva
* Número: 8220183
* Turma: LEI12T3
 */
package projeto_pp.Participants;

import java.io.Serializable;
import ma02_resources.participants.Contact;
import ma02_resources.participants.Instituition;
import ma02_resources.participants.Partner;

/**
 * PartnerImpl is a class that represents a partner in a project. It extends the
 * ParticipantImpl class and implements the Partner interface. It provides
 * methods to access and manipulate partner information such as VAT number and
 * website.
 */
public class PartnerImpl extends ParticipantImpl implements Partner, Serializable {

    /**
     * VAT number of the partner
     */
    private String vat;
    /**
     * Website of the partner
     */
    private String website;

    /**
     * Constructs a PartnerImpl object with the specified VAT number, website,
     * name, email, contact, and institution.
     *
     * @param vat the VAT number of the partner
     * @param website the website of the partner
     * @param name the name of the partner
     * @param email the email address of the partner
     * @param contact the contact information of the partner
     * @param institution the institution of the partner
     */
    public PartnerImpl(String vat, String website, String name, String email, Contact contact, Instituition institution) {
        super(name, email, contact, institution);
        this.vat = vat;
        this.website = website;
    }

    /**
     *
     * Retrieves the VAT number of the partner.
     *
     * @return the VAT number of the partner
     */
    @Override
    public String getVat() {
        return this.vat;
    }

    /**
     *
     * Retrieves the website of the partner.
     *
     * @return the website of the partner
     */
    @Override
    public String getWebsite() {
        return this.website;
    }

    /**
     * Checks if the provided object is equal to this Partner. Two partners are
     * considered equal if they have the same vat number and website.
     *
     * @param obj the object to compare
     * @return true if the object is equal to this Partner, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PartnerImpl other = (PartnerImpl) obj;
        if (this.vat.equals(other.vat)) {
            if (this.website.equals(other.website)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns a string representation of the PartnerImpl object.
     *
     * @return a string representation of the PartnerImpl object
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\t>Partner Details:\n");
        sb.append("\t VAT: ").append(vat).append("\n");
        sb.append("\t Website: ").append(website).append("\n");

        return sb.toString();
    }
}
