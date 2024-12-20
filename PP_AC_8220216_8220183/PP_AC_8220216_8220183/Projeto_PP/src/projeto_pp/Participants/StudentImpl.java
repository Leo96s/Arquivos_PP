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
import ma02_resources.participants.Student;

/**
 *
 * The StudentImpl class represents a student participant in a project. It
 * extends the ParticipantImpl class and implements the Student interface. A
 * student is a project participant with an identification number. This class
 * provides methods to get and set the identification number.
 */
public class StudentImpl extends ParticipantImpl implements Student, Serializable {

    /**
     * The number of the student
     */
    private int number;

    /**
     * Constructs a StudentImpl object with the specified number, name, email,
     * contact and institution
     *
     * @param number The number of the student
     * @param name The name of the student.
     * @param email The email address of the student.
     * @param contact The contact information of the student.
     * @param institution The institution associated with the student.
     */
    public StudentImpl(int number, String name, String email, Contact contact, Instituition institution) {
        super(name, email, contact, institution);
        this.number = number;
    }

    /**
     * Retrieves the identification number of the student.
     *
     * @return The number.
     */
    @Override
    public int getNumber() {
        return this.number;
    }

    /**
     * Checks if the provided object is equal to this Student. Two students are
     * considered equal if they have the same number.
     *
     * @param obj the object to compare
     * @return true if the object is equal to this edition, false otherwise
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
        final StudentImpl other = (StudentImpl) obj;
        return this.number == other.number;
    }

    /**
     * Returns a string representation of the StudentImpl object.
     *
     * @return a string representation of the StudentImpl object
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\t>Student Details:\n");
        sb.append("\t Number: ").append(number).append("\n");

        return sb.toString();
    }
}
