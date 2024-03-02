/* 
* Nome: Joaquim Fontes Matos
* Número: 8220216
* Turma: LEI12T3
* 
* Nome: Leonardo Henrique Barbosa Da Silva
* Número: 8220183
* Turma: LEI12T3
*/
package projeto_pp.files;

import projeto_pp.ProjectImpl;
import projeto_pp.TaskImpl;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;

/**
 * The ProjectJsonSerializer class is responsible for reading project data from
 * a JSON template and creating a ProjectImpl object based on the data.
 */
public class ProjectJsonSerializer {

    /**
     * The field to extract the number_of_facilitors value from.
     */
    private static final String NUMBER_FACILITORS_PROJECT = "\"number_of_facilitors\":";
    /**
     * The field to extract the number_of_students value from.
     */
    private static final String NUMBER_STUDENTS_PROJECT = "\"number_of_students\":";
    /**
     * The field to extract the number_of_partners value from.
     */
    private static final String NUMBER_PARTNERS_PROJECT = "\"number_of_partners\":";
    /**
     * The field to extract the title value from.
     */
    private static final String TITLE_TASK = "\"title\":";
    /**
     * The field to extract the description value from.
     */
    private static final String DESCRIPTION_TASK = "\"description\":";
    /**
     * The field to extract the start_at value from.
     */
    private static final String START_TASK = "\"start_at\":";
    /**
     * The field to extract the duration value from.
     */
    private static final String DURATION_TASK = "\"duration\":";

    /**
     * Reads project data from the specified project template file and creates a
     * ProjectImpl object.
     *
     * @param start The start date of the project.
     * @param projectTemplate The path to the project template file.
     *
     * @return The created ProjectImpl object.
     *
     * @throws FileNotFoundException If the project template file is not found.
     * @throws IOException If an I/O error occurs while reading the file.
     */
    public static ProjectImpl readProject(LocalDate start, String projectTemplate) throws FileNotFoundException, IOException {
        String[] titleTask = new String[50];
        String[] descriptionTask = new String[50];
        int[] duration = new int[50];
        int[] startAt = new int[50];
        int index = 0;
        int maximumNumberOfFacilitors = 0;
        int maximumNumberOfStudents = 0;
        int maximumNumberOfPartners = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(projectTemplate))) {
            String line;

            while ((line = br.readLine()) != null) {
                if (line.contains(NUMBER_FACILITORS_PROJECT)) {
                    maximumNumberOfFacilitors = Integer.parseInt(getProperty(line, NUMBER_FACILITORS_PROJECT));
                } else if (line.contains(NUMBER_STUDENTS_PROJECT)) {
                    maximumNumberOfStudents = Integer.parseInt(getProperty(line, NUMBER_STUDENTS_PROJECT));
                } else if (line.contains(NUMBER_PARTNERS_PROJECT)) {
                    maximumNumberOfPartners = Integer.parseInt(getProperty(line, NUMBER_PARTNERS_PROJECT));
                } else if (line.contains(TITLE_TASK)) {
                    titleTask[index] = getProperty(line, TITLE_TASK);
                } else if (line.contains(DESCRIPTION_TASK)) {
                    descriptionTask[index] = getProperty(line, DESCRIPTION_TASK);
                } else if (line.contains(START_TASK)) {
                    startAt[index] = Integer.parseInt(getProperty(line, START_TASK));
                } else if (line.contains(DURATION_TASK)) {
                    duration[index++] = Integer.parseInt(getProperty(line, DURATION_TASK));
                }
            }
        } catch (IOException exc) {
            System.out.println("IO Exception");
            return null;
        }

        TaskImpl[] tasks = new TaskImpl[index];
        for (int i = 0; i < tasks.length; i++) {
            tasks[i] = new TaskImpl();
            tasks[i].setTitle(titleTask[i]);
            tasks[i].setDuration(duration[i]);
            tasks[i].setDescription(descriptionTask[i]);
            LocalDate startDate = start.plusDays(startAt[i]);
            LocalDate endDate = startDate.plusDays(duration[i]);
            tasks[i].setStartDate(startDate);
            tasks[i].setEndDate(endDate);
        }
        int maximumNumberOfParticipants = maximumNumberOfPartners + maximumNumberOfStudents + maximumNumberOfFacilitors;
        int numberOfTasks = index;
        ProjectImpl project = new ProjectImpl(maximumNumberOfParticipants,
                maximumNumberOfStudents, maximumNumberOfPartners, maximumNumberOfFacilitors, numberOfTasks, tasks);

        return project;
    }

    /**
     * Extracts the property value from a JSON line based on the specified
     * field.
     *
     * @param line The JSON line.
     * @param field The field to extract the value from.
     * @return The extracted property value.
     */
    private static String getProperty(String line, String field) {
        int startIndex = line.indexOf(field) + field.length();
        int endIndex = line.indexOf(',', startIndex);
        if (endIndex == -1) {
            endIndex = line.length();
        }
        return line.substring(startIndex, endIndex).replace("\"", "").trim();
    }
}
