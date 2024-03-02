/* 
* Nome: Joaquim Fontes Matos
* Número: 8220216
* Turma: LEI12T3
* 
* Nome: Leonardo Henrique Barbosa Da Silva
* Número: 8220183
* Turma: LEI12T3
 */
package projeto_pp.Managers;

import java.io.*;
import java.time.LocalDateTime;
import ma02_resources.participants.Participant;
import ma02_resources.participants.Student;
import ma02_resources.project.Project;
import ma02_resources.project.Submission;
import ma02_resources.project.Task;
import projeto_pp.SubmissionImpl;
import projeto_pp.files.ConsoleReader;

/**
 * The ManageSubmissions class provides methods for managing submissions information.
 */
public class ManageSubmissions {

    /**
     * Retrieves submission information from the user and returns a Submission object.
     *
     * @param project The project from which the student is added to the submission.
     * @param task The task that contains the submission.
     * 
     * @return The Submission object with the entered information.
     *
     * @throws IOException if there is an error reading user input.
     */
    public static Submission getSubmissionsInfo(Project project, Task task) throws IOException {
        boolean validDate;
        LocalDateTime date;
        do {
            date = ConsoleReader.LocalDateTimeReader("Enter the date of the submission (yyyy-MM-dd HH:mm:ss): ");

            if (date.toLocalDate().isBefore(task.getStart()) || date.toLocalDate().isAfter(task.getEnd())) {
                System.out.println("Invalid Date, the Submission Date has to be in the interval ("
                        + task.getStart() + " and " + task.getEnd() + ")");
                validDate = false;
            } else {
                validDate = true;
            }
        } while (!validDate);

        Participant temp = null;

        do {
            String email = ConsoleReader.StringReader("Enter the email of the Student: ");

            temp = project.getParticipant(email);
        } while (temp == null);

        Student student = (Student) temp;

        String text = ConsoleReader.StringReader("Enter the text of submission: ");

        SubmissionImpl submission = new SubmissionImpl(date, student, text);

        return submission;
    }
}
