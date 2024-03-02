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

import ma02_resources.participants.Contact;
import ma02_resources.participants.Facilitator;
import ma02_resources.participants.Instituition;

/**
 * The FacilitatorImpl class represents a facilitator participant in a project.
 * It extends the ParticipantImpl class and implements the Facilitator
 * interface. A facilitator is a project participant with an area of expertise.
 * This class provides methods to get and set the area of expertise.
 *
 * @author Joaquim Matos
 */
public class FacilitatorImpl extends ParticipantImpl implements Facilitator {

    /**
     * The area of expertise.
     */
    private String areaOfExpertise;

    /**
     * Constructs a FacilitatorImpl object with the specified name, email,
     * contact, institution, and area of expertise.
     *
     * @param name The name of the facilitator.
     * @param email The email address of the facilitator.
     * @param contact The contact information of the facilitator.
     * @param institution The institution associated with the facilitator.
     * @param areaOfExpertise The area of expertise of the facilitator.
     */
    public FacilitatorImpl(String name, String email, Contact contact, Instituition institution, String areaOfExpertise) {
        super(name, email, contact, institution);
        this.areaOfExpertise = areaOfExpertise;
    }

    /**
     * Retrieves the area of expertise of the facilitator.
     *
     * @return The area of expertise.
     */
    @Override
    public String getAreaOfExpertise() {
        return this.areaOfExpertise;
    }

    /**
     * Sets the area of expertise of the facilitator.
     *
     * @param areaOfExpertise The area of expertise to be set.
     */
    @Override
    public void setAreaOfExpertise(String areaOfExpertise) {
        this.areaOfExpertise = areaOfExpertise;
    }

    /**
     * Checks if the provided object is equal to this Facilitator.
     *
     * @param obj the object to compare
     * @return true if the object is equal to this Facilitator, false otherwise
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
        return false;
    }

    /**
     * Returns a string representation of the FacilitatorImpl object.
     *
     * @return a string representation of the FacilitatorImpl object
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\t>Facilitator Details:\n");
        sb.append("\t Area of Expertise: ").append(areaOfExpertise).append("\n");

        return sb.toString();
    }

}
