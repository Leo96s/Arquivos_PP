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

import ma02_resources.project.Project;
import ma02_resources.project.Task;

/**
 * The ListTasksNoSubmission class provides a method for generating a string
 * representation of tasks within a project that have no submissions.
 */
public class ListTasksNoSubmission {

    /**
     * Generates a string representation of tasks within the given project that
     * have no submissions.
     *
     * @param project The project to retrieve the tasks from.
     *
     * @return A string representation of tasks with no submissions, or null if
     * all tasks have submissions.
     */
    public static String ListTasksNoSubmissionToString(Project project) {
        int countCompleted=0;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Task task : project.getTasks()) {
            if (task != null && task.getNumberOfSubmissions() < 1) {
                sb.append(" º Task ").append(++i).append(":\n");
                sb.append(task.toString()).append("\n");
            } else {
                countCompleted++;
            }
        }
        if (countCompleted==project.getNumberOfTasks()) {
            System.out.println("Every task has Submissions");
            return null;
        } else {
            return sb.toString();
        }
    }
}
