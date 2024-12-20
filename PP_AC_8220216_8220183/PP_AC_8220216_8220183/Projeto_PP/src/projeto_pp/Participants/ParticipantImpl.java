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
import ma02_resources.participants.Participant;

/**
 *
 * ParticipantImpl is a class that represents a participant in a project. It
 * implements the Participant interface. It provides methods to access and
 * manipulate participant information such as name, email, contact, and
 * institution.
 */
public abstract class ParticipantImpl implements Participant, Serializable {

    /**
     * Name of the participant
     */
    private String name;
    /**
     * Email address of the participant
     */
    private String email;
    /**
     * Contact information of the participant
     */
    private Contact contact;
    /**
     * Institution of the participant
     */
    private Instituition instituition;

    /**
     *
     * Constructs a ParticipantImpl object with the specified name, email,
     * contact, and institution.
     *
     * @param name the name of the participant
     * @param email the email address of the participant
     * @param contact the contact information of the participant
     * @param instituition the institution of the participant
     */
    public ParticipantImpl(String name, String email, Contact contact, Instituition instituition) {
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.instituition = instituition;
    }

    /**
     *
     * Retrieves the name of the participant.
     *
     * @return the name of the participant
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     *
     * Retrieves the email address of the participant.
     *
     * @return the email address of the participant
     */
    @Override
    public String getEmail() {
        return this.email;
    }

    /**
     *
     * Retrieves the contact information of the participant.
     *
     * @return the contact information of the participant
     */
    @Override
    public Contact getContact() {
        return this.contact;
    }

    /**
     *
     * Retrieves the institution of the participant.
     *
     * @return the institution of the participant
     */
    @Override
    public Instituition getInstituition() {
        return this.instituition;
    }

    /**
     *
     * Sets the institution of the participant.
     *
     * @param instituition the institution to set
     */
    @Override
    public void setInstituition(Instituition instituition) {
        this.instituition = instituition;
    }

    /**
     *
     * Sets the contact information of the participant.
     *
     * @param contact the contact information to set
     */
    @Override
    public void setContact(Contact contact) {
        this.contact = contact;
    }

    /**
     * Checks if the provided object is equal to this Participant. Two
     * participants are considered equal if they have the same email.
     *
     * @param obj the object to compare
     * @return true if the object is equal to this Participant, false otherwise
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
        final ParticipantImpl other = (ParticipantImpl) obj;
        if (this.email.equals(other.email)) {
            return true;
        }
        return false;
    }

    /**
     * Returns a string representation of the ParticipantImpl object.
     *
     * @return a string representation of the ParticipantImpl object
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\t>General Details:\n");
        sb.append("\t Name: ").append(name).append("\n");
        sb.append("\t Email: ").append(email).append("\n");
        ContactImpl contact_2 = (ContactImpl) contact;
        sb.append(contact_2.toString()).append("\n");
        InstituitionImpl instituition_2 = (InstituitionImpl) instituition;
        sb.append(instituition_2.toString()).append("\n");

        return sb.toString();
    }

    /**
     * Returns a string representation of the ParticipantImpl object most
     * important information the name and email.
     *
     * @return a string representation of the ParticipantImpl object most
     * important information the name and email.
     */
    public String listParticipantImportantInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("\tStudent{\n");
        sb.append("\t Name: ").append(name).append("\n");
        sb.append("\t Email: ").append(email).append("\n");
        sb.append("\t}");

        return sb.toString();
    }
}
