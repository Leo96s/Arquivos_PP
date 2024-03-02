/* 
* Nome: Joaquim Fontes Matos
* Número: 8220216
* Turma: LEI12T3
* 
* Nome: Leonardo Henrique Barbosa Da Silva
* Número: 8220183
* Turma: LEI12T3
 */
package projeto_pp;

import java.io.*;
import ma02_resources.participants.*;
import ma02_resources.project.Project;
import ma02_resources.project.Task;
import ma02_resources.project.exceptions.IllegalNumberOfParticipantType;
import ma02_resources.project.exceptions.IllegalNumberOfTasks;
import ma02_resources.project.exceptions.ParticipantAlreadyInProject;
import ma02_resources.project.exceptions.TaskAlreadyInProject;
import projeto_pp.Participants.FacilitatorImpl;
import projeto_pp.Participants.ParticipantImpl;
import projeto_pp.Participants.PartnerImpl;
import projeto_pp.Participants.StudentImpl;
import projeto_pp.files.ConsoleReader;

/**
 * The `ProjectImpl` class represents a project implementation in a project
 * management system. It implements the `Project` interface and provides
 * functionality for managing project details, including participants, tasks,
 * and project metadata.
 *
 * The class maintains information such as the project name, description, and
 * various counts related to participants, tasks, and their maximum limits. It
 * also provides methods for adding participants and tasks, as well as
 * retrieving information about the project and its components.
 *
 * The `ProjectImpl` class is designed to handle different types of
 * participants, such as students, partners, and facilitators, and allows the
 * addition of tasks to the project. It ensures that the number of participants
 * and tasks does not exceed the specified maximum limits.
 *
 * This class also supports serialization, allowing project objects to be
 * serialized and persisted to external storage or transmitted over a network.
 */
public class ProjectImpl implements Project, Serializable {

    /**
     * The name of project
     */
    private String name;

    /**
     * The description of project
     */
    private String description;

    /**
     * The number of participants in project
     */
    private int numberOfParticipants;

    /**
     * The number of students in project
     */
    private int numberOfStudents;

    /**
     * The number of partners in project
     */
    private int numberOfPartners;

    /**
     * The number of facilitators in project
     */
    private int numberOfFacilitators;

    /**
     * The number of tasks in project
     */
    private int numberOfTasks;

    /**
     * The maximum number of project
     */
    private int maximumNumberOfTasks;

    /**
     * The maximum number of participants in project
     */
    private long maximumNumberOfParticipants;

    /**
     * The maximum number of students in project
     */
    private int maximumNumberOfStudents;

    /**
     * The maximum number of partners in project
     */
    private int maximumNumberOfPartners;

    /**
     * The maximun number of facilitators in project
     */
    private int maximumNumberOfFacilitators;

    /**
     * The array of participants in project
     */
    private Participant[] participants;

    /**
     * The array of tasks in project
     */
    private Task[] tasks;

    /**
     * The array of tags in project
     */
    private String[] tags;

    /**
     * The initial number of participants
     */
    private final static int INITIAL_SIZE = 2;

    /**
     * Constructor for ProjectImpl class.
     */
    public ProjectImpl() {
    }

    /**
     * Constructor for ProjectImpl class.
     *
     * @param maximumNumberOfParticipants The maximum number of participants
     * allowed in the project.
     * @param maximumNumberOfStudents The maximum number of students allowed in
     * the project.
     * @param maximumNumberOfPartners The maximum number of partners allowed in
     * the project.
     * @param maximumNumberOfFacilitators The maximum number of facilitators
     * allowed in the project.
     * @param numberOfTasks The number of tasks in the project.
     * @param tasks An array of TaskImpl objects representing the tasks in the
     * project.
     * @throws IllegalArgumentException If the provided arguments are invalid.
     */
    public ProjectImpl(int maximumNumberOfParticipants, int maximumNumberOfStudents, int maximumNumberOfPartners, int maximumNumberOfFacilitators, int numberOfTasks, TaskImpl[] tasks) throws IllegalArgumentException {
        this.maximumNumberOfParticipants = maximumNumberOfParticipants;
        this.maximumNumberOfStudents = maximumNumberOfStudents;
        this.maximumNumberOfPartners = maximumNumberOfPartners;
        this.maximumNumberOfFacilitators = maximumNumberOfFacilitators;
        this.tasks = tasks;
        this.numberOfTasks = numberOfTasks;
        this.participants = new ParticipantImpl[INITIAL_SIZE];
        if (maximumNumberOfParticipants < 0 || numberOfTasks < 0) {
            throw new IllegalArgumentException("Illegal Arguments");
        }
    }

    /**
     * Retrieves the name of the project.
     *
     * @return the name of the project
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the project.
     *
     * @param name the name of the project
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the description of the project.
     *
     * @return the description of the project
     */
    @Override
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the project.
     *
     * @param description the description of the project
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Retrieves the number of participants in the project.
     *
     * @return the number of participants
     */
    @Override
    public int getNumberOfParticipants() {
        return numberOfParticipants;
    }

    /**
     * Sets the number of participants in the project.
     *
     * @param numberOfParticipants the number of participants
     */
    public void setNumberOfParticipants(int numberOfParticipants) {
        this.numberOfParticipants = numberOfParticipants;
    }

    /**
     * Retrieves the number of students in the project.
     *
     * @return the number of students
     */
    @Override
    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    /**
     * Sets the number of students in the project.
     *
     * @param numberOfStudents the number of students
     */
    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    /**
     * Retrieves the number of partners in the project.
     *
     * @return the number of partners
     */
    @Override
    public int getNumberOfPartners() {
        return numberOfPartners;
    }

    /**
     * Sets the number of partners in the project.
     *
     * @param numberOfPartners the number of partners
     */
    public void setNumberOfPartners(int numberOfPartners) {
        this.numberOfPartners = numberOfPartners;
    }

    /**
     * Retrieves the number of facilitators in the project.
     *
     * @return the number of facilitators
     */
    @Override
    public int getNumberOfFacilitators() {
        return numberOfFacilitators;
    }

    /**
     * Sets the number of facilitators in the project.
     *
     * @param numberOfFacilitators the number of facilitators
     */
    public void setNumberOfFacilitators(int numberOfFacilitators) {
        this.numberOfFacilitators = numberOfFacilitators;
    }

    /**
     * Retrieves the number of tasks in the project.
     *
     * @return the number of tasks
     */
    @Override
    public int getNumberOfTasks() {
        return numberOfTasks;
    }

    /**
     * Sets the number of tasks in the project.
     *
     * @param numberOfTasks the number of tasks
     */
    public void setNumberOfTasks(int numberOfTasks) {
        this.numberOfTasks = numberOfTasks;
    }

    /**
     * Retrieves the maximum number of tasks allowed in the project.
     *
     * @return the maximum number of tasks
     */
    @Override
    public int getMaximumNumberOfTasks() {
        return maximumNumberOfTasks;
    }

    /**
     * Sets the maximum number of tasks allowed in the project.
     */
    public void setMaximumNumberOfTasks() {
        boolean validNum;
        do {
            int maximumNumberOfTasksTemp = ConsoleReader.intReader("Enter the maximum number of Tasks: ");
            if (maximumNumberOfTasksTemp < this.numberOfTasks) {
                validNum = false;
                System.out.print("Enter a number greater or equal than the number of tasks: ");
                System.out.println(this.numberOfTasks);
            } else {
                validNum = true;
                this.maximumNumberOfTasks = maximumNumberOfTasksTemp;
            }
        } while (validNum == false);
    }

    /**
     * Retrieves the maximum number of participants allowed in the project.
     *
     * @return the maximum number of participants
     */
    @Override
    public long getMaximumNumberOfParticipants() {
        return maximumNumberOfParticipants;
    }

    /**
     * Sets the maximum number of participants allowed in the project.
     *
     * @param maximumNumberOfParticipants the maximum number of participants
     */
    public void setMaximumNumberOfParticipants(int maximumNumberOfParticipants) {
        this.maximumNumberOfParticipants = maximumNumberOfParticipants;
    }

    /**
     * Retrieves the maximum number of students allowed in the project.
     *
     * @return the maximum number of students
     */
    @Override
    public int getMaximumNumberOfStudents() {
        return maximumNumberOfStudents;
    }

    /**
     * Sets the maximum number of students allowed in the project.
     *
     * @param maximumNumberOfStudents the maximum number of students
     */
    public void setMaximumNumberOfStudents(int maximumNumberOfStudents) {
        this.maximumNumberOfStudents = maximumNumberOfStudents;
    }

    /**
     * Retrieves the maximum number of partners allowed in the project.
     *
     * @return the maximum number of partners
     */
    @Override
    public int getMaximumNumberOfPartners() {
        return maximumNumberOfPartners;
    }

    /**
     * Sets the maximum number of partners allowed in the project.
     *
     * @param maximumNumberOfPartners the maximum number of partners
     */
    public void setMaximumNumberOfPartners(int maximumNumberOfPartners) {
        this.maximumNumberOfPartners = maximumNumberOfPartners;
    }

    /**
     * Retrieves the maximum number of facilitators allowed in the project.
     *
     * @return the maximum number of facilitators
     */
    @Override
    public int getMaximumNumberOfFacilitators() {
        return maximumNumberOfFacilitators;
    }

    /**
     * Sets the maximum number of facilitators allowed in the project.
     *
     * @param maximumNumberOfFacilitators the maximum number of facilitators
     */
    public void setMaximumNumberOfFacilitators(int maximumNumberOfFacilitators) {
        this.maximumNumberOfFacilitators = maximumNumberOfFacilitators;
    }

    /**
     * Checks if the participant with the following email is in the project.
     *
     * @param email The email of the participant
     *
     * @return true if the participant is in the project, ortherwise false.
     */
    public boolean hasGivenEmail(String email) {
        for (Participant participant : participants) {
            if (participant != null) {
                if (participant.getEmail().equals(email)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Retrieves the tasks of the project.
     *
     * @return an array of tasks
     */
    @Override
    public Task[] getTasks() {
        return tasks;
    }

    /**
     * Sets the tasks of the project.
     *
     * @param tasks an array of tasks
     */
    public void setTasks(Task[] tasks) {
        this.tasks = tasks;
    }

    /**
     * Retrieves the tags of the project.
     *
     * @return an array of tags
     */
    @Override
    public String[] getTags() {
        return tags;
    }

    /**
     * Sets the tags of the project.
     *
     * @param tags an array of tags
     */
    public void setTags(String[] tags) {
        this.tags = tags;
    }

    /**
     * Checks if a participant is already in the project.
     *
     * @param p the participant to check
     * @return true if the participant is already in the project, false
     * otherwise
     */
    public boolean isParticipantAlreadyInProject(Participant p) {
        for (Participant temp : this.participants) {
            if (temp != null && temp.equals(p)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if adding a participant of a specific type would exceed the
     * maximum allowed number of participants of that type.
     *
     * @param p the participant to check
     * @return true if adding the participant would exceed the maximum allowed
     * number, false otherwise
     */
    private boolean isParticipantTypeMax(Participant p) {
        if (p instanceof Student) {

        } else if (p instanceof Facilitator) {
            if (this.numberOfFacilitators == this.maximumNumberOfFacilitators) {
                return true;
            }
        } else if (p instanceof Partner) {
            if (this.numberOfPartners == this.maximumNumberOfPartners) {
                return true;
            }
        } else if (p instanceof Student) {
            if (this.numberOfStudents == this.maximumNumberOfStudents) {
                return true;
            }
        } else if (this.numberOfParticipants == this.maximumNumberOfParticipants) {
            return true;
        }
        return false;
    }

    /**
     * Extends the participants array by doubling its size.
     */
    private void extendsParticipants() {
        Participant[] temp = new Participant[this.numberOfParticipants * 2];

        for (int i = 0; i < this.numberOfParticipants; i++) {
            temp[i] = participants[i];
        }

        this.participants = temp;
    }

    /**
     * Adds a participant to the project.
     *
     * @param p the participant to add
     * @throws IllegalNumberOfParticipantType if adding the participant exceeds
     * the maximum allowed number of participants of that type
     * @throws ParticipantAlreadyInProject if the participant is already in the
     * project
     */
    @Override
    public void addParticipant(Participant p) throws IllegalNumberOfParticipantType, ParticipantAlreadyInProject {
        try {
            if (this.isParticipantTypeMax(p)) {
                throw new IllegalNumberOfParticipantType("Illegal Number Of Participants Type");
            } else if (this.isParticipantAlreadyInProject(p)) {
                throw new ParticipantAlreadyInProject("Participant Already In Project");
            } else {
                if (this.numberOfParticipants == this.participants.length) {
                    extendsParticipants();
                }
                this.addTypeParticipant(p);
                this.participants[this.numberOfParticipants++] = p;
            }
        } catch (IllegalNumberOfParticipantType exc) {
            System.out.println(exc.getMessage());
        } catch (ParticipantAlreadyInProject exc) {
            System.out.println(exc.getMessage());
        }
    }

    /**
     * Increments the count of the participant type (student, partner, or
     * facilitator) when adding a participant.
     *
     * @param p the participant being added
     */
    private void addTypeParticipant(Participant p) {
        if (p instanceof Student) {
            this.numberOfStudents++;
        } else if (p instanceof Partner) {
            this.numberOfPartners++;
        } else if (p instanceof Facilitator) {
            this.numberOfFacilitators++;
        }
    }

    /**
     * Removes a participant from the project based on their email.
     *
     * @param email the email of the participant to remove
     * @return the removed participant, or null if the participant is not found
     */
    @Override
    public Participant removeParticipant(String email) {
        try {
            if (this.numberOfParticipants < 1) {
                throw new IllegalArgumentException("Project has no Participants");
            }

            int indexToRemove = -1, i;
            for (i = 0; i < this.numberOfParticipants; i++) {
                if (this.participants[i].getEmail().equals(email)) {
                    indexToRemove = i;
                    break;
                }
            }

            if (indexToRemove == -1) {
                throw new IllegalArgumentException("Participant not Found");
            } else {
                Participant temp = this.participants[indexToRemove];

                for (i = indexToRemove; i < this.numberOfParticipants - 1; i++) {
                    this.participants[i] = this.participants[i + 1];
                }
                this.participants[i] = null;
                this.numberOfParticipants--;
                return temp;
            }
        } catch (IllegalArgumentException exc) {
            System.out.println(exc.getMessage());
            return null;
        }
    }

    /**
     * Retrieves a participant from the project based on their email.
     *
     * @param string the email of the participant to retrieve
     * @return the participant with the specified email, or null if not found
     */
    @Override
    public Participant getParticipant(String string) {
        try {
            for (Participant temp : this.participants) {
                if (temp != null && temp.getEmail().equals(string)) {
                    return temp;
                }
            }
            throw new IllegalArgumentException("Illegal Argument Exception");
        } catch (IllegalArgumentException exc) {
            System.out.println("Participant not Found");
            return null;
        }
    }

    /**
     * Retrieves an array of all participants in the project.
     *
     * @return an array of participants
     */
    public Participant[] getParticipants() {
        return participants;
    }

    /**
     * Checks if a given tag is associated with the project.
     *
     * @param string the tag to check
     * @return true if the tag is associated with the project, false otherwise
     */
    @Override
    public boolean hasTag(String string) {
        if (tags != null) {
            for (String tag : tags) {
                if (tag != null && tag.equals(string)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Checks if a task is already present in the project.
     *
     * @param task the task to check
     * @return true if the task is already in the project, false otherwise
     */
    private boolean isTaskAlreadyInProject(Task task) {
        for (Task temp : this.tasks) {
            if (temp != null && temp.equals(task)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Extends the tasks array by doubling its size.
     */
    public void extendTasks() {
        Task[] temp = new Task[this.numberOfTasks * 2];

        for (int i = 0; i < this.numberOfTasks; i++) {
            temp[i] = this.tasks[i];
        }

        this.tasks = temp;
    }

    /**
     * Adds a task to the project.
     *
     * @param task the task to add
     * @throws IllegalNumberOfTasks if adding the task exceeds the maximum
     * allowed number of tasks
     * @throws TaskAlreadyInProject if the task is already in the project
     */
    @Override
    public void addTask(Task task) throws IllegalNumberOfTasks, TaskAlreadyInProject {
        try {
            if (this.isTaskAlreadyInProject(task)) {
                throw new TaskAlreadyInProject("");
            } else if (this.numberOfTasks == this.maximumNumberOfTasks) {
                throw new IllegalNumberOfTasks("");
            } else {
                if (this.numberOfTasks == this.tasks.length) {
                    extendTasks();
                }
                this.tasks[this.numberOfTasks++] = task;
                System.out.println("Task added successfully");
            }
        } catch (IllegalNumberOfTasks exc) {
            System.out.println("Tasks Full");
        } catch (TaskAlreadyInProject exc) {
            System.out.println("Task Already in Project");
        }
    }

    /**
     * Retrieves a task from the project based on its title.
     *
     * @param string the title of the task to retrieve
     * @return the task with the specified title, or null if not found
     */
    @Override
    public Task getTask(String string) {
        for (Task task : this.tasks) {
            if (task != null && task.getTitle().equals(string)) {
                return task;
            }
        }
        System.out.println("Task not Found!");
        return null;
    }

    /**
     * Checks if all tasks in the project have been completed.
     *
     * @return true if all tasks have been completed, false otherwise
     */
    @Override
    public boolean isCompleted() {
        boolean isCompleted = true;
        for (Task task : this.tasks) {
            if (task != null && task.getNumberOfSubmissions() < 1) {
                isCompleted = false;
            }
        }
        return isCompleted;
    }

    /**
     * Calculates and returns the progress of the project as a percentage.
     *
     * @return the progress of the project as a string representation
     */
    public String progressOfProject() {
        int num = this.tasksCompleted();
        float progress = num / (float) this.numberOfTasks;
        float percentage = progress * 100;
        StringBuilder sb = new StringBuilder();

        sb.append("Progress Of the Project: ");
        sb.append(percentage).append("% (").append(num).append("/");
        sb.append(this.numberOfTasks).append(")\n");

        return sb.toString();
    }

    /**
     * Retrieves the number of tasks that have been completed in the project.
     *
     * @return the number of completed tasks
     */
    public int tasksCompleted() {
        int tasksCompleted = 0;
        for (Task task : tasks) {
            if (task != null && task.getNumberOfSubmissions() > 0) {
                tasksCompleted++;
            }
        }
        return tasksCompleted;
    }

    /**
     * Checks if there are any tasks in the project that have no submissions.
     *
     * @return true if there are tasks without submissions, false otherwise
     */
    public boolean verifyTasksWithNoSubmissions() {
        for (Task task : this.getTasks()) {
            if (task != null) {
                if (task.getNumberOfSubmissions() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Checks if the project is equal to the given object.
     *
     * @param obj the object to compare
     * @return true if the project is equal to the object, false otherwise
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
        final ProjectImpl other = (ProjectImpl) obj;
        if (this.name.equals(other.name)) {
            return true;
        }
        return false;
    }

    /**
     * Returns a string representation of the project.
     *
     * @return a string representation of the project
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("  >> General Details: ").append("\n");
        sb.append("\tProject Name: ").append(name).append("\n");
        sb.append("\tDescription: ").append(description).append("\n");
        sb.append("\tNumber of Participants: ").append(numberOfParticipants).append("\n");
        sb.append("\tNumber of Students: ").append(numberOfStudents).append("\n");
        sb.append("\tNumber of Partners: ").append(numberOfPartners).append("\n");
        sb.append("\tNumber of Facilitators: ").append(numberOfFacilitators).append("\n");
        sb.append("\tNumber of Tasks: ").append(numberOfTasks).append("\n");

        sb.append(listTasks());

        sb.append(listParticipants());

        sb.append("  >> Tags: ");

        if (tags != null) {
            for (String tag : this.tags) {
                if (tag != null) {
                    sb.append(tag).append("; ");
                }
            }
        }

        return sb.toString();
    }

    /**
     * Returns a string representation of the tasks in the project.
     *
     * @return a string representation of the tasks
     */
    public String listTasks() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        try {
            if (this.numberOfTasks < 1) {
                throw new NullPointerException("Project has no Tasks");
            }
            sortDates(this.tasks, this.numberOfTasks);

            sb.append("\n  >> Tasks Details\n");
            for (Task task : this.tasks) {
                if (task != null) {
                    sb.append("   º Task ").append(++i).append(":\n");
                    TaskImpl temp = (TaskImpl) task;
                    sb.append(temp.toString()).append("\n");
                }
            }

        } catch (NullPointerException exc) {
            System.out.println(exc.getMessage());
        }
        return sb.toString();
    }

    /**
     * Sorts the tasks array based on the end date of the tasks.
     *
     * @param tasks the array of tasks to sort
     * @param numTasks the number of tasks in the array
     */
    private void sortDates(Task[] task, int number) {
        int n = number;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (task[j].getEnd().isBefore(task[minIndex].getEnd())) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                Task temp = task[i];
                task[i] = task[minIndex];
                task[minIndex] = temp;
            }
        }
    }

    /**
     * Returns a string representation of the participants in the project.
     *
     * @return a string representation of the participants
     */
    public String listParticipants() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        try {
            if (this.numberOfParticipants < 1) {
                throw new NullPointerException("Project has no Participants");
            }
            sb.append("\n  >> Participants Details: ").append("\n");
            for (Participant participant : this.participants) {
                sb.append("   º Participant ").append(++i).append(":\n");
                if (participant != null) {
                    if (participant instanceof Student) {
                        StudentImpl student = (StudentImpl) participant;
                        sb.append(student.toString()).append("\n");
                    } else if (participant instanceof Partner) {
                        PartnerImpl partner = (PartnerImpl) participant;
                        sb.append(partner.toString()).append("\n");
                    } else if (participant instanceof Facilitator) {
                        FacilitatorImpl facilitator = (FacilitatorImpl) participant;
                        sb.append(facilitator.toString()).append("\n");
                    }
                }
            }
        } catch (NullPointerException exc) {
            System.out.println(exc.getMessage());
        }
        return sb.toString();
    }

    /**
     * Returns a string representation of the names of the tasks in the project.
     *
     * @return a string representation of the task names
     */
    public String listTasksName() {
        StringBuilder sb = new StringBuilder();
        try {
            if (this.numberOfTasks < 1) {
                throw new NullPointerException("Project has no Tasks");
            }
            sb.append("\nTasks: ").append("\n");
            for (Task task : this.tasks) {
                if (task != null) {
                    sb.append(task.getTitle()).append("\n");
                }
            }
        } catch (NullPointerException exc) {
            System.out.println(exc.getMessage());
        }
        return sb.toString();
    }

    /**
     * Returns a string representation of the students participating in the
     * project.
     *
     * @return a string representation of the students
     */
    public String listStudents() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        try {
            if (this.numberOfParticipants < 1) {
                throw new NullPointerException("Project has no Participants");
            }
            sb.append("\nStudents{").append("\n");
            for (Participant participant : this.participants) {
                if (participant != null) {
                    if (participant instanceof Student) {
                        StudentImpl student = (StudentImpl) participant;
                        sb.append(">Student ").append(++i).append(":\n");
                        sb.append(" Name: ").append(student.getName()).append(", ").
                                append("Email: ").append(student.getEmail()).append("\n");
                    }
                }
            }
            sb.append("}");
        } catch (NullPointerException exc) {
            System.out.println(exc.getMessage());
        }
        return sb.toString();
    }
}
