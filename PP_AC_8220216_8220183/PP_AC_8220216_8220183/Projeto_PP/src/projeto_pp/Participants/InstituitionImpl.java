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
import ma02_resources.participants.InstituitionType;

/**
 * The InstituitionImpl class represents an institution. It implements the
 * Instituition interface. An institution has a name, email, type, contact
 * information, website, and description. This class provides methods to
 * retrieve and modify these attributes.
 */
public class InstituitionImpl implements Instituition, Serializable {

    /**
     * The name of the instituition.
     */
    private String name;
    /**
     * The email of the instituition.
     */
    private String email;
    /**
     * The instituition type.
     */
    private InstituitionType type;
   /**
     * The contact of the instituition.
     */
    private Contact contact;
    /**
     * The website of the instituition.
     */
    private String website;
    /**
     * The description of the instituition.
     */
    private String description;

    /**
     * Constructs an InstituitionImpl object with the specified attributes.
     *
     * @param name The name of the institution.
     * @param email The email address of the institution.
     * @param type The type of the institution.
     * @param contact The contact information of the institution.
     * @param website The website of the institution.
     * @param description The description of the institution.
     */
    public InstituitionImpl(String name, String email, InstituitionType type, Contact contact, String website, String description) throws IllegalArgumentException {
        if (name.equals("") || email.equals("") || type == null) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.email = email;
        this.type = type;
        this.contact = contact;
        this.website = website;
        this.description = description;
    }

    /**
     * Constructs an InstituitionImpl object with the name.
     * 
     * @param name The name of the instituition.
     */
    public InstituitionImpl(String name) {
        this.name = name;
    }

    /**
     * Retrieves the name of the institution.
     *
     * @return The name of the institution.
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Retrieves the email address of the institution.
     *
     * @return The email address of the institution.
     */
    @Override
    public String getEmail() {
        return this.email;
    }

    /**
     * Retrieves the type of the institution.
     *
     * @return The type of the institution.
     */
    @Override
    public InstituitionType getType() {
        return this.type;
    }

    /**
     * Retrieves the contact information of the institution.
     *
     * @return The contact information of the institution.
     */
    @Override
    public Contact getContact() {
        return this.contact;
    }

    /**
     * Retrieves the website of the institution.
     *
     * @return The website of the institution.
     */
    @Override
    public String getWebsite() {
        return this.website;
    }

    /**
     * Retrieves the description of the institution.
     *
     * @return The description of the institution.
     */
    @Override
    public String getDescription() {
        return this.description;
    }

    /**
     * Sets the website of the institution.
     *
     * @param website The website to be set.
     */
    @Override
    public void setWebsite(String website) {
        this.website = website;
    }

    /**
     * Sets the description of the institution.
     *
     * @param description The description to be set.
     */
    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Sets the contact information of the institution.
     *
     * @param contact The contact information to be set.
     */
    @Override
    public void setContact(Contact contact) {
        this.contact = contact;
    }

    /**
     * Sets the type of the institution.
     *
     * @param type The type to be set.
     */
    @Override
    public void setType(InstituitionType type) {
        this.type = type;
    }

    /**
     * Checks if the provided object is equal to this Instituition. Two
     * instituitions are considered equal if they have the same name.
     *
     * @param obj the object to compare
     * @return true if the object is equal to this Instituition, false otherwise
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
        final InstituitionImpl other = (InstituitionImpl) obj;
        if (this.name.equals(other.name)) {
            return true;
        }
        return false;
    }

    /**
     * Returns a string representation of the InstituitionImpl object.
     *
     * @return a string representation of the InstituitionImpl object
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n\t>Institution Details:\n");
        sb.append("\t Name: ").append(this.getName()).append("\n");
        sb.append("\t Email: ").append(this.getEmail()).append("\n");
        sb.append("\t Type: ").append(this.getType()).append("\n");
        sb.append(this.getContact()).append("\n");
        sb.append("\t Website: ").append(website).append("\n");
        sb.append("\t Description: ").append(description).append("\n");

        return sb.toString();
    }
}
