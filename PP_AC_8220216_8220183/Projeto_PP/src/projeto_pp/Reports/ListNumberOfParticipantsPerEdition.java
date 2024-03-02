/* 
* Nome: Joaquim Fontes Matos
* Número: 8220216
* Turma: LEI12T3
* 
* Nome: Leonardo Henrique Barbosa Da Silva
* Número: 8220183
* Turma: LEI12T3
 */
package projeto_pp.Reports;

import ma02_resources.project.Edition;
import ma02_resources.project.Project;
import projeto_pp.Managers.ManageEditions;

/**
 * The ListNumberOfParticipantsPerEdition class provides a method for generating
 * a string representation of the number of participants per edition in a
 * ManageEditions object.
 */
public class ListNumberOfParticipantsPerEdition {

    /**
     * Generates a string representation of the number of participants per
     * edition in the given ManageEditions object.
     *
     * @param me The ManageEditions object to retrieve the editions from.
     *
     * @return A string representation of the number of participants per
     * edition.
     */
    public static String listNumberOfParticipantsPerEditionToString(ManageEditions me) {
        StringBuilder sb = new StringBuilder();

        for (Edition edition : me.getEditions()) {
            if (edition != null) {
                sb.append("\nNumber Of Participants in Edition: ").append(edition.getName()).append("{\n");
                sb.append(listNumberOfParticipantsPerEditionByTipe(edition));
                sb.append("\n}\n");
            }
        }
        return sb.toString();
    }

    /**
     * Generates a string representation of the number of participants per
     * edition and by type (students, facilitators, partners) in the given Edition
     * object.
     *
     * @param edition The Edition object to retrieve the projects from.
     *
     * @return A string representation of the number of participants per edition
     * by type.
     */
    private static String listNumberOfParticipantsPerEditionByTipe(Edition edition) {
        StringBuilder sb = new StringBuilder();

        int numberOfParticipants = 0;
        int numberOfStudents = 0;
        int numberOfFacilitators = 0;
        int numberOfPartners = 0;

        for (Project project : edition.getProjects()) {
            if (project != null) {
                numberOfParticipants += project.getNumberOfParticipants();
                numberOfStudents += project.getNumberOfStudents();
                numberOfFacilitators += project.getNumberOfFacilitators();
                numberOfPartners += project.getNumberOfPartners();
            }
        }

        sb.append(" Number Of Participants: ").append(numberOfParticipants);
        sb.append("\n Number Of Students: ").append(numberOfStudents);
        sb.append("\n Number Of Facilitators: ").append(numberOfFacilitators);
        sb.append("\n Number Of Partners: ").append(numberOfPartners);

        return sb.toString();
    }
}
