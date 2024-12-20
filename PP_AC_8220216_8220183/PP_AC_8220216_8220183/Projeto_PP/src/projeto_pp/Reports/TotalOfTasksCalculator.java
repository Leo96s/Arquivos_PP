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
 * The TotalOfTasksCalculator class provides methods for calculating the total
 * number of tasks in a collection of editions.
 */
public class TotalOfTasksCalculator {

    /**
     * Returns the total number of tasks in the given ManageEditions object as a formatted string.
     *
     * @param editions The ManageEditions object containing the editions.
     *
     * @return A string representation of the total number of tasks.
     */
    public static String totalOfTasksToString(ManageEditions editions) {
        StringBuilder sb = new StringBuilder();

        sb.append("\nNumber Of Tasks in Total: ").append(tasksTotalCounter(editions)).append("\n");

        return sb.toString();
    }

    /**
     *
     * Calculates the total number of tasks in the given ManageEditions object.
     *
     * @param editions The ManageEditions object containing the editions.
     *
     * @return The total number of tasks in the collection of editions.
     */
    public static int tasksTotalCounter(ManageEditions editions) {

        int tasksCount = 0;

        for (Edition edition : editions.getEditions()) {
            if (edition != null) {
                for (Project project : edition.getProjects()) {
                    if (project != null) {
                        tasksCount += project.getNumberOfTasks();
                    }
                }
            }
        }

        return tasksCount;
    }
}
