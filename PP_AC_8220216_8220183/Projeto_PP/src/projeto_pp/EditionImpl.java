/* 
* Nome: Joaquim Fontes Matos
* Número: 8220216
* Turma: LEI12T3
* 
* Nome: Leonardo Henrique Barbosa Da Silva
* Número: 8220183
* Turma: LEI12T3
 */
package projeto_pp;

import java.io.IOException;
import java.io.Serializable;
import java.text.ParseException;
import java.time.LocalDate;
import ma02_resources.project.Edition;
import ma02_resources.project.Project;
import ma02_resources.project.Status;
import ma02_resources.project.Task;
import projeto_pp.files.ProjectJsonSerializer;

/**
 * The EditionImpl class represents an implementation of the Edition interface
 * and provides functionality to manage a CBL edition.
 *
 * This class implements the Serializable interface, allowing instances of
 * EditionImpl to be serialized and deserialized.
 */
public class EditionImpl implements Edition, Serializable {

    /**
     * The name of the edition.
     */
    private String name;
    /**
     * The start date of the edition.
     */
    private LocalDate start;
    /**
     * The project template of the edition.
     */
    private String projectTemplate;
    /**
     * The status of the edition.
     */
    private Status status;
    /**
     * The number of projects in the edition.
     */
    private int numberOfProjects;
    /**
     * The array of projects in the edition.
     */
    private Project[] projects;
    /**
     * The initial size of the projects array.
     */
    private final int INITIAL_SIZE = 3;

    /**
     * Constructs a new EditionImpl object with the specified name, start date,
     * and project template.
     *
     * @param name the name of the edition
     * @param start the start date of the edition
     * @param project_template the project template of the edition
     * @throws IllegalArgumentException if any of the provided arguments is null
     * or an empty string
     */
    public EditionImpl(String name, LocalDate start, String project_template) throws IllegalArgumentException {
        if (name == null || name.equals("") || project_template == null || start == null) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.start = start;
        this.projectTemplate = project_template;
        this.status = Status.INACTIVE;
        this.projects = new Project[INITIAL_SIZE];
    }

    /**
     * Sets the name of the edition to the provided value.
     *
     * @param name the name of the edition
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the start date of the edition to the provided value.
     *
     * @param start the start date of the edition
     */
    public void setStart(LocalDate start) {
        this.start = start;
    }

    /**
     * Sets the project template of the edition to the provided value.
     *
     * @param projectTemplate the project template of the edition
     */
    public void setProjectTemplate(String projectTemplate) {
        this.projectTemplate = projectTemplate;
    }

    /**
     * Sets the projects array of the edition to the provided array.
     *
     * @param project the projects array of the edition
     */
    public void setProjects(Project[] project) {
        this.projects = project;
    }

    /**
     * Returns the name of the edition.
     *
     * @return The name of the edition.
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Returns the start date of the edition.
     *
     * @return The start date of the edition.
     */
    @Override
    public LocalDate getStart() {
        return start;
    }

    /**
     * Returns the project template of the edition.
     *
     * @return The project template of the edition.
     */
    @Override
    public String getProjectTemplate() {
        return projectTemplate;
    }

    /**
     * Returns the status of the edition.
     *
     * @return The status of the edition.
     */
    @Override
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the status of the edition.
     *
     * @param status the status of the edition
     * @throws IllegalArgumentException if the provided status is null
     */
    @Override
    public void setStatus(Status status) throws IllegalArgumentException {
        if (status == null) {
            throw new IllegalArgumentException();
        }
        this.status = status;
    }

    /**
     * Returns the number of projects in the edition.
     *
     * @return The number of projects in the edition.
     */
    @Override
    public int getNumberOfProjects() {
        return this.numberOfProjects;
    }

    /**
     * Returns the end date of the edition, that is the end date of the last
     * ending task.
     *
     * @return The end date of the edition.
     */
    @Override
    public LocalDate getEnd() {
        LocalDate lastDate = start;
        for (Project proj : projects) {
            if (proj != null) {
                for (Task task : proj.getTasks()) {
                    if (task != null) {
                        if (lastDate.compareTo(task.getEnd()) < 1) {
                            lastDate = task.getEnd();
                        }
                    }
                }
            }
        }
        return lastDate;
    }

    /**
     * Extends the projects array of the edition by doubling its size.
     *
     * This method is called when the current projects array is full and a new
     * project needs to be added.
     */
    private void extendsProject() {
        Project[] temp = new Project[INITIAL_SIZE * 2];

        for (int i = 0; i < this.numberOfProjects; i++) {
            temp[i] = this.projects[i];
        }

        this.projects = temp;
    }

    /**
     * Checks if a project is already present in the projects array of the
     * edition.
     *
     * @param p the project to check
     * @return true if the project is already in the projects array, false
     * otherwise
     */
    public boolean isProjectAlreadyInProject(Project p) {
        for (Project temp : this.projects) {
            if (temp != null && temp.equals(p)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Adds a new project to the edition.The method checks if projects is full,
     * if it is this method calls extendsProject. It also checks if the name,
     * description or tags are null. Then it assigns a project created by
     * reading the template to temp, the values of name, string, tags and
     * maximumNumberOfTasks are given to temp. Following that the temp project
     * is assigned to a new index in projects.
     *
     * @param name The name of the project.
     * @param description The description of the project.
     * @param tags The contributors of the project.
     *
     * @throws java.io.IOException If readProject can't read the template.
     * @throws ParseException If the readProject cannot be parsed.
     */
    @Override
    public void addProject(String name, String description, String[] tags) throws IOException, ParseException {
        try {
            if (this.numberOfProjects == this.projects.length) {
                extendsProject();
            }
            if (name == null || name.equals("") || description == null || tags == null) {
                throw new IllegalArgumentException("Illegal Arguments");
            }
            //assigning a Project created by reading the template to a temporary project.
            ProjectImpl temp = ProjectJsonSerializer.readProject(this.start, this.projectTemplate);

            temp.setDescription(description);
            temp.setName(name);
            temp.setTags(tags);
            temp.setMaximumNumberOfTasks();
            //checking if the project created is already in projects 
            if (!this.isProjectAlreadyInProject(temp)) {
                projects[numberOfProjects++] = (Project) temp;
            } else {
                throw new IllegalArgumentException("Project Already exists");
            }
        } catch (IllegalArgumentException exc) {
            System.out.println(exc.getMessage());
        }
    }

    /**
     * Removes a project from the edition.
     *
     * @param string The name of the project to be removed.
     */
    @Override
    public void removeProject(String string) {
        try {
            System.out.println(this.numberOfProjects);
            if (string == null || string.equals("")) {
                throw new IllegalArgumentException("");
            }
            int indexToRemove = -1, i;
            for (i = 0; i < this.numberOfProjects; i++) {
                if (this.projects[i].getName().equals(string)) {
                    indexToRemove = i;
                }
            }
            if (indexToRemove == -1) {
                throw new IllegalArgumentException("");
            }
            for (i = indexToRemove; i < this.numberOfProjects - 1; i++) {
                this.projects[i] = this.projects[i + 1];
            }
            this.projects[i] = null;
            this.numberOfProjects--;
            System.out.println("Project Removed");
        } catch (IllegalArgumentException exc) {
            System.out.println("Project Not Found");
        }
    }

    /**
     * Retrieves a project from the edition.
     *
     * @param string The name of the project to retrieve.
     *
     * @return The project with the specified name, or null if not found.
     */
    @Override
    public Project getProject(String string) {
        for (Project temp : this.projects) {
            if (temp != null && temp.getName().equals(string)) {
                return temp;
            }
        }
        System.out.println("Project not Found!");
        return null;
    }

    /**
     * Returns an array of all the projects in the edition.
     *
     * @return An array of all the projects in the edition.
     */
    @Override
    public Project[] getProjects() {
        return this.projects;
    }

    /**
     * Returns an array of projects that have a specific tag.
     *
     * @param tag The tag to filter the projects by.
     * @return An array of projects that have the specified tag.
     */
    @Override
    public Project[] getProjectsByTag(String tag) {
        int count = 0;

        for (Project project : this.projects) {
            if (project != null && project.hasTag(tag)) {
                count++;
            }
        }

        Project[] result = new Project[count];
        int index = 0;

        for (Project project : this.projects) {
            if (project != null && project.hasTag(tag)) {
                result[index] = project;
                index++;
            }
        }

        return result;
    }

    /**
     * Returns an array of projects that have a participant with the specified
     * email.
     *
     * @param email The email of the participant
     * @return An array of projects that have a participant with the specified
     * email.
     */
    @Override
    public Project[] getProjectsOf(String email) {
        int count = 0;

        for (Project project : this.projects) {
            ProjectImpl temp = (ProjectImpl) project;
            if (temp != null && temp.hasGivenEmail(email)) {
                count++;
            }
        }

        Project[] result = new Project[count];
        int index = 0;

        for (Project project : this.projects) {
            ProjectImpl temp = (ProjectImpl) project;
            if (temp != null && temp.hasGivenEmail(email)) {
                result[index] = project;
                index++;
            }
        }

        return result;
    }

    /**
     * Sets the provided project in the projects array.
     *
     * @param project the project to set
     */
    public void setProject(Project project) {
        for (int i = 0; i < this.numberOfProjects; i++) {
            if (this.projects[i].equals(project)) {
                this.projects[i] = project;
            }
        }
    }

    /**
     * Returns a string representation of the progress of the edition.
     *
     * @return A string representation of the progress of the edition.
     */
    public String progressOfEdition() {
        int num = this.projectsCompleted();
        float progress = num / (float) this.numberOfProjects;
        float percentage = progress * 100;
        StringBuilder sb = new StringBuilder();

        sb.append("Progress Of the Edition: ");
        sb.append(percentage).append("% (").append(num).append("/");
        sb.append(this.numberOfProjects).append(")\n");

        return sb.toString();
    }

    /**
     * Returns the number of projects that are completed in the edition.
     * Projects are completed if every task they have as at least a submission.
     *
     * @return The number of completed projects in the edition.
     */
    public int projectsCompleted() {
        int projectsCompleted = 0;
        for (Project project : projects) {
            if (project != null && project.isCompleted()) {
                projectsCompleted++;
            }
        }
        return projectsCompleted;
    }

    /**
     * Returns an array of projects in the edition that have no submissions.
     *
     * @return An array of projects with no submissions.
     */
    public Project[] projectWithNoSubmissions() {
        Project[] project = new Project[this.numberOfProjects];
        boolean temp = false;
        int i = 0;

        for (Project proj : this.projects) {
            ProjectImpl pro = (ProjectImpl) proj;
            if (pro != null) {
                temp = pro.verifyTasksWithNoSubmissions();
                if (temp == true) {
                    project[i++] = pro;
                }
            }
        }
        return project;
    }

    /**
     * Returns a string representation of the projects in the edition that have
     * no submissions.
     *
     * @return A string representation of projects with no submissions.
     */
    public String listProjectWithNoSubmissions() {
        StringBuilder sb = new StringBuilder();
        int temp = 0;
        try {
            Project[] project = projectWithNoSubmissions();
            for (Project proj : project) {
                if (proj != null) {
                    ProjectImpl pro = (ProjectImpl) proj;
                    sb.append(pro.toString()).append("\n");
                    temp = 1;
                }
            }
            if (temp == 0) {
                sb.append("Every tasks in Project have submissions").append("\n");
            }
            return sb.toString();
        } catch (NullPointerException exc) {
            System.out.println("Null Pointer exception");
        }
        return sb.toString();
    }

    /**
     * Checks if the provided object is equal to this edition. Two editions are
     * considered equal if they have the same name.
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
        final EditionImpl other = (EditionImpl) obj;
        if (this.name.equals(other.name)) {
            return true;
        }
        return false;
    }

    /**
     * Returns a string representation of the Edition object.
     *
     * @return A string representation of the Edition object.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\tName: ").append(name).append("\n");
        sb.append("\tStart date: ").append(start).append("\n");
        sb.append("\tProject template: ").append(projectTemplate).append("\n");
        sb.append("\tStatus: ").append(status).append("\n");
        sb.append("\tNumber of projects: ").append(numberOfProjects).append("\n");
        if (numberOfProjects > 0) {
            sb.append("\tEnd date: ").append(getEnd()).append("\n");
            sb.append(listProjectsName());
        } else {
            sb.append("\tEnd date: Edition still has no End Date\n");
            sb.append("\tProjects: Edition has no Projects\n");
        }
        return sb.toString();
    }

    /**
     * Returns a string representation of list of the projects in the edition.
     *
     * @return A string representation of list of the projects in the edition.
     */
    public String listProjects() {
        StringBuilder sb = new StringBuilder();
        try {
            if (this.numberOfProjects < 1) {
                throw new NullPointerException("Edition has no Projects");
            }
            sb.append("Projects{\n");

            for (int i = 0; i < numberOfProjects; i++) {
                sb.append(" --> Project ").append(i + 1).append(": \n");
                ProjectImpl proj = (ProjectImpl) this.projects[i];
                if (proj != null) {
                    sb.append(proj.toString()).append("\n");
                }
            }
            sb.append('}');
        } catch (NullPointerException exc) {
            System.out.println(exc.getMessage());
        }
        return sb.toString();
    }

    /**
     * Returns a string containing a list of the names of the projects in the
     * edition.
     *
     * @return A string containing a list of the names of the projects in the
     * edition.
     */
    public String listProjectsName() {
        StringBuilder sb = new StringBuilder();
        try {
            if (this.numberOfProjects < 1) {
                throw new NullPointerException("Edition has no Projects");
            }
            sb.append("\tProjects{\n");

            for (int i = 0; i < numberOfProjects; i++) {
                sb.append("\t>Project ").append(i + 1).append(": \n");
                ProjectImpl proj = (ProjectImpl) this.projects[i];
                if (proj != null) {
                    sb.append("\t Name: ").append(proj.getName()).append("\n");
                }
            }
            sb.append("\t}");
        } catch (NullPointerException exc) {
            System.out.println(exc.getMessage());
        }
        return sb.toString();
    }
}
