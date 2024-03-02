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

import java.time.LocalDate;
import ma02_resources.project.Edition;
import ma02_resources.project.Task;
import projeto_pp.TaskImpl;
import projeto_pp.files.ConsoleReader;

/**
 * The ManageTasks class provides methods for managing tasks information.
 */
public class ManageTasks {

    /**
     * Retrieves submission information from the user and returns a Submission object.
     * 
     * @param edition The edition that contains the task.
     * 
     * @return The Task object with the entered information.
     */
    public static Task getTaskInfo(Edition edition) {
            String title=ConsoleReader.StringReader("Enter the title of the task: ");
            
            String description=ConsoleReader.StringReader("Enter the description of the task: ");

            int start_at=ConsoleReader.intReader("Enter the number of the days after the beggining of the Edition that the task starts: ");
            LocalDate startDate = edition.getStart().plusDays(start_at);

            int duration = ConsoleReader.intReader("Enter the duration of the task: ");

            LocalDate endDate = startDate.plusDays(duration);
            TaskImpl task = new TaskImpl(startDate, endDate, duration, title, description);

            return task;
    }
}
