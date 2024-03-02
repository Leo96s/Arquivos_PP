/* 
* Nome: Joaquim Fontes Matos
* Número: 8220216
* Turma: LEI12T3
* 
* Nome: Leonardo Henrique Barbosa Da Silva
* Número: 8220183
* Turma: LEI12T3
 */
package projeto_pp.Menus;

import java.io.IOException;
import java.text.ParseException;
import ma02_resources.participants.Participant;
import ma02_resources.project.*;
import ma02_resources.project.exceptions.*;
import projeto_pp.EditionImpl;
import projeto_pp.Managers.*;
import projeto_pp.Participants.ParticipantImpl;
import projeto_pp.ProjectImpl;
import projeto_pp.Reports.*;
import projeto_pp.TaskImpl;
import projeto_pp.files.*;
import static projeto_pp.files.ConsoleReader.*;

/**
 * The `Menus` class represents the menu system for the project management
 * application. It provides a set of menus and options for managing editions,
 * projects, tasks, and participants.
 */
public class Menus {

    private ManageEditions editions;
    private String EditionName;
    private String ProjectName;
    private String TaskName;
    private Edition edition;
    private Project project;
    private Task task;

    /**
     * Initializes the Menus object and creates a new instance of
     * ManageEditions.
     */
    public Menus() {
        ManageEditions temp = new ManageEditions();
        this.editions = temp;
    }

    /**
     * Displays the main menu and handles user input to perform various actions.
     *
     * @throws IOException if an I/O error occurs
     * @throws IllegalNumberOfTasks if the number of tasks exceeds the maximum
     * limit
     * @throws TaskAlreadyInProject if the task is already added to the project
     * @throws IllegalNumberOfParticipantType if the number of participants of a
     * certain type exceeds the maximum limit
     * @throws ParticipantAlreadyInProject if the participant is already added
     * to the project
     * @throws ParseException if an error occurs while parsing a date
     */
    public void menuPrincipal() throws java.io.IOException, IllegalNumberOfTasks,
            TaskAlreadyInProject, IllegalNumberOfParticipantType, ParticipantAlreadyInProject, ParseException {
        char choice;

        do {
            System.out.println("---------------------------------------------");
            System.out.println("Menu");
            System.out.println("1. Save");
            System.out.println("2. Add Edition");
            System.out.println("3. Manage Edition");
            System.out.println("4. List Editions");
            System.out.println("5. Reports");
            System.out.println("6. List Editions with a lack of Submissions");
            System.out.println("7. Get number Of CBL Editions");
            System.out.println("8. Remove Edition");
            System.out.println("9. Search Edition");
            System.out.println("a. Load");
            System.out.println("0. Exit");
            System.out.println("---------------------------------------------");
            System.out.print("Escolha uma opção: ");

            choice = (char) System.in.read();

            System.in.read();

            switch (choice) {
                case '1':
                    saveEditions();
                    break;
                case '2':
                    editions.addEdition();
                    break;
                case '3':
                    menuEdition();
                    break;
                case '4':
                    System.out.println(editions.toString());
                    break;
                case '5':
                    menuReports();
                    break;
                case '6':
                    if (editions.getCount() != 0) {
                        System.out.println(editions.listLackOfSubmissions());
                    } else {
                        System.out.println("Dont have editions to verify!");
                    }
                    break;
                case '7':
                    StringBuilder sb = new StringBuilder();
                    sb.append("There is ").append(editions.getCount()).append(" editions");
                    System.out.println(sb);
                    break;
                case '8':
                    String editionNameRemove = ConsoleReader.StringReader("Type the name of the Edition: ");
                    editions.removeEdition(editionNameRemove);
                    break;
                case '9':
                    if (editions.getCount() > 0) {
                        String editionName = ConsoleReader.StringReader("Type the name of the Edition: ");
                        try {
                            String st = editions.getEdition(editionName).toString();
                            System.out.println(st);
                        } catch (NullPointerException exc) {
                        }
                    } else {
                        System.out.println("Manage Edition has no Editions");
                    }
                    break;

                case 'a':
                    loadEditions();
                    break;
                case '0':
                    System.out.println("Leaving...");
                    break;
                default:
                    System.out.println("Option invalid");
                    break;
            }
        } while (choice != '0');
    }

    /**
     * Saves the editions to a file named "editions.txt" using
     * EditionJsonSerializer. Displays a success message if the save operation
     * is successful. Displays an error message if an IOException occurs.
     */
    private void saveEditions() {
        try {
            EditionJsonSerializer.writeEditions("editions.txt", editions);
            System.out.println("Editions saved successfully.");
        } catch (IOException e) {
            System.out.println("File corrupted");
        }
    }

    /**
     * Loads the editions from a file named "editions.txt" using
     * EditionJsonSerializer. Displays a success message if the load operation
     * is successful. Displays an error message if an IOException occurs or the
     * class is not found.
     */
    private void loadEditions() {
        try {
            editions = EditionJsonSerializer.readEditions("editions.txt");
            System.out.println("Editions loaded successfully.");
        } catch (IOException e) {
            System.out.println("File corrupted");
        } catch (ClassNotFoundException e) {
            System.out.println("The class was not found");
        }
    }

    /**
     * Displays the menu for managing tasks and handles user input to perform
     * various actions. Allows adding submissions, listing submissions, and
     * editing a task.
     *
     * @throws IOException if an I/O error occurs
     */
    private void menuTasks() throws java.io.IOException {
        char choice;

        ProjectImpl temp = (ProjectImpl) project;
        System.out.println(temp.listTasksName());

        this.TaskName = StringReader("Type the name of task: ");

        this.task = project.getTask(TaskName);
        if (this.task == null) {
            return;
        }
        if (this.edition.getStatus().equals(Status.INACTIVE)) {
            System.out.println("Not Available. Edition Inactive");
            return;
        }
        do {
            System.out.println("---------------------------------------------");
            System.out.println("Menu");
            System.out.println("1. Add Submission");
            System.out.println("2. List Submissions");
            System.out.println("3. Edit Task");
            System.out.println("0. Exit");
            System.out.println("---------------------------------------------");
            System.out.print("Escolha uma opção: ");

            choice = (char) System.in.read();

            System.in.read();

            switch (choice) {
                case '1':
                    if (project.getNumberOfStudents() > 0) {
                        ProjectImpl tempProj = (ProjectImpl) this.project;
                        System.out.println(tempProj.listStudents());
                        task.addSubmission(ManageSubmissions.getSubmissionsInfo(project, task));
                    } else {
                        System.out.println("Project has no Students");
                    }
                    break;
                case '2':
                    TaskImpl task_ = (TaskImpl) this.task;

                    System.out.println(task_.listSubmissions());
                    break;
                case '3':
                    menuEditTask();
                    break;
                case '0':
                    System.out.println("Leaving...");
                    break;
                default:
                    System.out.println("Option invalid");
                    break;
            }
        } while (choice != '0');
    }

    /**
     * Displays the menu for managing projects and handles user input to perform
     * various actions. Allows managing tasks, adding tasks, adding
     * participants, removing participants, searching participants, searching
     * tasks, listing participants, listing tasks, editing projects, and
     * visualizing project progress.
     *
     * @throws IOException if an I/O error occurs
     * @throws IllegalNumberOfTasks if the number of tasks exceeds the maximum
     * limit
     * @throws TaskAlreadyInProject if the task is already added to the project
     * @throws IllegalNumberOfParticipantType if the number of participants of a
     * certain type exceeds the maximum limit
     * @throws ParticipantAlreadyInProject if the participant is already added
     * to the project
     */
    private void menuProjects() throws java.io.IOException, IllegalNumberOfTasks,
            TaskAlreadyInProject, IllegalNumberOfParticipantType, ParticipantAlreadyInProject {
        char choice;
        EditionImpl edit = (EditionImpl) edition;
        System.out.println(edit.listProjectsName());

        this.ProjectName = StringReader("Type the name of project: ");

        this.project = edition.getProject(ProjectName);
        if (this.project == null) {
            return;
        }

        ProjectImpl proj = (ProjectImpl) this.project;

        do {
            System.out.println("---------------------------------------------");
            System.out.println("Menu");
            System.out.println("1. Manage Tasks");
            System.out.println("2. Add Task");
            System.out.println("3. Add Participants");
            System.out.println("4. Remove Participants");
            System.out.println("5. Search Participant");
            System.out.println("6. Search Task");
            System.out.println("7. List Participants");
            System.out.println("8. List Tasks");
            System.out.println("9. Edit Project");
            System.out.println("a. Visualize the progress of the Project");
            System.out.println("0. Exit");
            System.out.println("---------------------------------------------");
            System.out.print("Escolha uma opção: ");

            choice = (char) System.in.read();

            System.in.read();

            switch (choice) {
                case '1':
                    menuTasks();
                    break;
                case '2':
                    this.project.addTask(ManageTasks.getTaskInfo(edition));
                    break;
                case '3':
                    this.project.addParticipant(ManageParticipants.getParticipantsInfo());
                    break;
                case '4':
                    ParticipantImpl participantRemoved = (ParticipantImpl) this.project.removeParticipant(StringReader("Type the email of the participant: "));
                    if (participantRemoved != null) {
                        System.out.println("The following Participant was removed:\n" + participantRemoved.listParticipantImportantInfo());
                    }
                    break;
                case '5':
                    Participant tempParticipant = this.project.getParticipant(StringReader("Type the email of participant: "));
                    if (tempParticipant != null) {
                        System.out.println(tempParticipant.toString());
                    }
                    break;
                case '6':
                    Task tempTask = this.project.getTask(StringReader("Type the title of the task: "));
                    if (tempTask != null) {
                        System.out.println(tempTask.toString());
                    }
                    break;
                case '7':
                    System.out.println(proj.listParticipants());
                    break;
                case '8':
                    System.out.println(proj.listTasks());
                    break;
                case '9':
                    menuEditProject();
                    break;
                case 'a':
                    if (proj.getNumberOfTasks() > 0) {
                        System.out.println(proj.progressOfProject());
                    } else {
                        System.out.println("Edition has no Projects");
                    }
                    break;
                case '0':
                    EditionImpl temp = (EditionImpl) edition;
                    temp.setProject(project);
                    edition = temp;
                    System.out.println("Leaving...");
                    break;
                default:
                    System.out.println("Option invalid");
                    break;
            }

        } while (choice
                != '0');
    }

    /**
     * Displays the menu for managing editions and handles user input to perform
     * various actions. Allows managing projects, adding projects, removing
     * projects, searching projects, searching projects by tag, editing
     * editions, listing projects, visualizing edition progress, listing
     * projects with no submissions, getting the number of projects, and
     * searching projects of a participant.
     *
     * @throws IOException if an I/O error occurs
     * @throws IllegalNumberOfTasks if the number of tasks exceeds the maximum
     * limit
     * @throws TaskAlreadyInProject if the task is already added to the project
     * @throws IllegalNumberOfParticipantType if the number of participants of a
     * certain type exceeds the maximum limit
     * @throws ParticipantAlreadyInProject if the participant is already added
     * to the project
     * @throws ParseException if an error occurs while parsing a date
     */
    private void menuEdition() throws java.io.IOException, IllegalNumberOfTasks,
            TaskAlreadyInProject, IllegalNumberOfParticipantType, ParticipantAlreadyInProject, ParseException {
        char choice;
        String name;
        String description;
        String[] strings;

        System.out.println(editions.editionsNameToString());

        this.EditionName = StringReader("Type the name of edition to manage: ");
        this.edition = editions.getEdition(EditionName);
        if (this.edition == null) {
            return;
        }
        if (this.edition.getStatus().equals(Status.CANCELED)) {
            System.out.println("Not Available. Edition Canceled");
            return;
        } else if (this.edition.getStatus().equals(Status.CLOSED)) {
            System.out.println("Not Available. Edition Closed");
            return;
        }

        EditionImpl edit = (EditionImpl) edition;
        do {
            System.out.println("---------------------------------------------");
            System.out.println("Menu");
            System.out.println("1. Manage Project");
            System.out.println("2. Add Project");
            System.out.println("3. Remove Project");
            System.out.println("4. Search Project");
            System.out.println("5. Search Project by Tag");
            System.out.println("6. Edit Edition");
            System.out.println("7. List Projects");
            System.out.println("8. Visualize the progress of the Edition");
            System.out.println("9. List Projects with no Submissions");
            System.out.println("a. Get number of projets");
            System.out.println("b. Search Projects of");
            System.out.println("0. Exit");
            System.out.println("---------------------------------------------");
            System.out.print("Escolha uma opção: ");

            choice = (char) System.in.read();

            // Consumir o caractere de nova linha
            System.in.read();

            switch (choice) {
                case '1':
                    menuProjects();
                    break;
                case '2':
                    name = StringReader("Type the name of project: ");
                    description = StringReader("Type the description of project: ");
                    System.out.println("Write \"end\" to stop");
                    strings = StringReaderArray("Type the tag: ");
                    edition.addProject(name, description, strings);
                    break;
                case '3':
                    name = StringReader("Type the name of project: ");
                    edition.removeProject(name);
                    break;
                case '4':
                    name = StringReader("Type the name of project: ");
                    Project tempProject = edition.getProject(name);
                    if (tempProject != null) {
                        System.out.println(tempProject.toString());
                    }
                    break;
                case '5':
                    String tag = StringReader("Type the name of tag: ");

                    if (tag != null) {
                        Project[] projects = edition.getProjectsByTag(tag);

                        if (projects.length > 0) {
                            for (Project project : projects) {
                                System.out.println(project.toString());
                            }
                        } else {
                            System.out.println("No projects found with the specified tag.");
                        }
                    } else {
                        System.out.println("Invalid tag input.");
                    }
                    break;
                case '6':
                    menuEdit();
                    break;
                case '7':
                    System.out.println(edit.listProjects());
                    break;
                case '8':
                    if (edition.getNumberOfProjects() > 0) {
                        System.out.println(edit.progressOfEdition());
                    } else {
                        System.out.println("Edition has no Projects");
                    }
                    break;
                case '9':
                    if (edition.getNumberOfProjects() != 0) {
                        System.out.println(edit.listProjectWithNoSubmissions());
                    } else {
                        System.out.println("There is no projects to verify!");
                    }
                    break;
                case 'a':
                    StringBuilder sb = new StringBuilder();
                    sb.append("The edition has ").append(edition.getNumberOfProjects()).append(" projects");
                    System.out.println(sb);
                    break;
                case 'b':
                    String email = StringReader("Type the email of the participant: ");

                    if (email != null) {
                        Project[] projects = edition.getProjectsOf(email);

                        if (projects != null && projects.length > 0) {
                            for (Project temp : projects) {
                                System.out.println(temp.toString());
                            }
                        } else {
                            System.out.println("No projects found with the specified email.");
                        }
                    } else {
                        System.out.println("Invalid email input.");
                    }
                    break;
                case '0':
                    editions.setEdition(edition);
                    System.out.println("Leaving...");
                    break;
                default:

                    System.out.println("Option invalid");
                    break;
            }
        } while (choice != '0');
    }

    /**
     * This method allows the user to edit various aspects of the current
     * edition. It provides a menu with options to edit the status and project
     * template. The user can choose an option by entering the corresponding
     * number. The method validates the user input and performs the requested
     * edits. If the user chooses to exit (0), the method terminates.
     *
     * @throws java.io.IOException if there is an I/O error while reading user
     * input.
     * @throws IllegalNumberOfTasks if an illegal number of tasks is encountered
     * during the edition edit.
     * @throws TaskAlreadyInProject if a task is already assigned to a project
     * during the edition edit.
     * @throws IllegalNumberOfParticipantType if an illegal number of
     * participant types is encountered during the edition edit.
     * @throws ParticipantAlreadyInProject if a participant is already assigned
     * to a project during the edition edit.
     */
    private void menuEdit() throws java.io.IOException, IllegalNumberOfTasks,
            TaskAlreadyInProject, IllegalNumberOfParticipantType, ParticipantAlreadyInProject {
        char choice;
        EditionImpl edit = (EditionImpl) this.edition;
        do {
            System.out.println("---------------------------------------------");
            System.out.println("Menu");
            System.out.println("1. Edit Status");
            System.out.println("2. Edit Project Template");
            System.out.println("0. Exit");
            System.out.println("---------------------------------------------");
            System.out.print("Escolha uma opção: ");

            choice = (char) System.in.read();

            // Consumir o caractere de nova linha
            System.in.read();

            switch (choice) {
                case '1':
                    try {
                    Status status = ConsoleReader.StatusReader("Type the new Status (ACTIVE, INACTIVE, CANCELED, CLOSED): ");
                    if (!editions.isAnEditionAlreadyActive(status)) {
                        edit.setStatus(status);
                    }

                } catch (IllegalArgumentException exc) {
                    System.out.println("Invalid Format");
                }
                break;
                case '2':
                    edit.setProjectTemplate(ManageTemplates.chooseTemplate());
                    break;
                case '0':
                    System.out.println("Leaving...");
                    break;
                default:
                    System.out.println("Option invalid");
                    break;
            }
        } while (choice != '0');
    }

    /**
     * This method allows the user to edit various aspects of the current
     * project. It provides a menu with options to edit the description and
     * maximum number of tasks. The user can choose an option by entering the
     * corresponding number. The method validates the user input and performs
     * the requested edits. If the user chooses to exit (0), the method
     * terminates.
     *
     * @throws java.io.IOException if there is an I/O error while reading user
     * input.
     * @throws IllegalNumberOfTasks if an illegal number of tasks is encountered
     * during the project edit.
     * @throws TaskAlreadyInProject if a task is already assigned to the project
     * during the project edit.
     * @throws IllegalNumberOfParticipantType if an illegal number of
     * participant types is encountered during the project edit.
     * @throws ParticipantAlreadyInProject if a participant is already assigned
     * to the project during the project edit.
     */
    private void menuEditProject() throws java.io.IOException, IllegalNumberOfTasks,
            TaskAlreadyInProject, IllegalNumberOfParticipantType, ParticipantAlreadyInProject {
        char choice;

        ProjectImpl proj = (ProjectImpl) this.project;

        do {
            System.out.println("---------------------------------------------");
            System.out.println("Menu");
            System.out.println("1. Edit Description");
            System.out.println("2. Edit Maximum Number Of Tasks");
            System.out.println("0. Exit");
            System.out.println("---------------------------------------------");
            System.out.print("Escolha uma opção: ");

            choice = (char) System.in.read();

            // Consumir o caractere de nova linha
            System.in.read();

            switch (choice) {
                case '1':
                    proj.setDescription(ConsoleReader.StringReader("Enter the new description: "));
                    break;
                case '2':
                    proj.setMaximumNumberOfTasks();
                    break;
                case '0':
                    System.out.println("Leaving...");
                    break;
                default:
                    System.out.println("Option invalid");
                    break;
            }
        } while (choice != '0');
    }

    /**
     * This method allows the user to edit various aspects of the current task.
     * It provides a menu with options to extend the deadline and edit the
     * description. The user can choose an option by entering the corresponding
     * number. The method validates the user input and performs the requested
     * edits. If the user chooses to exit (0), the method terminates.
     *
     * @throws java.io.IOException if there is an I/O error while reading user
     * input.
     */
    private void menuEditTask() throws java.io.IOException {
        char choice;
        TaskImpl t = (TaskImpl) task;

        do {
            System.out.println("---------------------------------------------");
            System.out.println("Menu");
            System.out.println("1. Extend Deadline");
            System.out.println("2. Edit Description");
            System.out.println("0. Exit");
            System.out.println("---------------------------------------------");
            System.out.print("Escolha uma opção: ");

            choice = (char) System.in.read();

            // Consumir o caractere de nova linha
            System.in.read();

            switch (choice) {
                case '1':
                    t.extendDeadline(ConsoleReader.intReader("Enter the number of Days you want to extend the deadline by: "));
                    break;
                case '2':
                    t.setDescription(ConsoleReader.StringReader("Enter the new description: "));
                    break;
                case '0':
                    System.out.println("Leaving...");
                    break;
                default:
                    System.out.println("Option invalid");
                    break;
            }
        } while (choice != '0');
    }

    /**
     * This method provides a menu for generating reports. It allows the user to
     * choose between different types of reports. The user can choose an option
     * by entering the corresponding number. The method validates the user input
     * and generates the requested report. If the user chooses to exit (0), the
     * method terminates.
     *
     * @throws java.io.IOException if there is an I/O error while reading user
     * input.
     * @throws IllegalNumberOfTasks if an illegal number of tasks is encountered
     * during the report generation.
     * @throws TaskAlreadyInProject if a task is already assigned to a project
     * during the report generation.
     * @throws IllegalNumberOfParticipantType if an illegal number of
     * participant types is encountered during the report generation.
     * @throws ParticipantAlreadyInProject if a participant is already assigned
     * to a project during the report generation.
     * @throws ParseException if there is an error while parsing the report
     * data.
     */
    public void menuReports() throws java.io.IOException, IllegalNumberOfTasks,
            TaskAlreadyInProject, IllegalNumberOfParticipantType, ParticipantAlreadyInProject, ParseException {
        char choice;

        do {
            System.out.println("---------------------------------------------");
            System.out.println("Menu");
            System.out.println("1. List Tasks with no submissions");
            System.out.println("2. List the Number Of Participants Per Edition");
            System.out.println("3. Total Number Of Tasks");
            System.out.println("0. Exit");
            System.out.println("---------------------------------------------");
            System.out.print("Escolha uma opção: ");

            choice = (char) System.in.read();

            // Consumir o caractere de nova linha
            System.in.read();

            switch (choice) {
                case '1':
                    if (editions.getCount() > 0) {
                        System.out.println(editions.editionsNameToString());
                        String nameEdition = StringReader("Type the name of the Edition: ");
                        EditionImpl tempEdition = (EditionImpl) editions.getEdition(nameEdition);
                        if (tempEdition == null) {
                            break;
                        } else if (tempEdition.getNumberOfProjects() > 0) {
                            System.out.println(tempEdition.listProjectsName());
                            String nameProject = StringReader("Type the name of the Project: ");
                            Project tempProject = tempEdition.getProject(nameProject);
                            if (tempProject != null) {
                                String string = ListTasksNoSubmission.ListTasksNoSubmissionToString(tempProject);
                                if (string != null) {
                                    System.out.println(string);
                                }
                            }
                        } else {
                            System.out.println("Edition has no Projects");
                        }
                    } else {
                        System.out.println("Manage Editions has no Editions");
                    }
                    break;

                case '2':
                    if (editions.getCount() > 0) {
                        String string = ListNumberOfParticipantsPerEdition.listNumberOfParticipantsPerEditionToString(editions);
                        if (string != null) {
                            System.out.println(string);
                        }
                    } else {
                        System.out.println("Manage Editions has no Editions");
                    }
                    break;
                case '3':
                    if (editions.getCount() > 0) {
                        String string = TotalOfTasksCalculator.totalOfTasksToString(editions);
                        if (string != null) {
                            System.out.println(string);
                        }
                    } else {
                        System.out.println("Manage Editions has no Editions");
                    }
                    break;
                case '0':
                    System.out.println("Leaving...");
                    break;
                default:
                    System.out.println("Option invalid");
                    break;
            }

        } while (choice != '0');
    }
}
