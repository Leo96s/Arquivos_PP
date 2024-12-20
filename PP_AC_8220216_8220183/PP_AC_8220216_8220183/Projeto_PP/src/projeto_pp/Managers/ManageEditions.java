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

import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDate;
import ma02_resources.project.Edition;
import ma02_resources.project.Project;
import ma02_resources.project.Status;
import projeto_pp.EditionImpl;
import projeto_pp.ProjectImpl;
import projeto_pp.files.ConsoleReader;

/**
 * The ManageTasks class provides methods for managing tasks information. This
 * class implements the Serializable interface, allowing instances of
 * ManageEditions to be serialized and deserialized.
 */
public class ManageEditions implements Serializable {

    /**
     * The CBL editions
     */
    private Edition[] editions;
    /**
     * The number of CBL editions
     */
    private int numberOfEditions;
    /**
     * The initial size of the editons
     */
    private final int INITIAL_SIZE = 3;

    /**
     * Constructor for the ManageEditions class. Initializes the editions array
     * with a initial capacity of INITIAL_SIZE.
     */
    public ManageEditions() {
        this.editions = new Edition[INITIAL_SIZE];
    }

    /**
     * Extends the capacity of the editions array by doubling its size.
     */
    public void extendEditions() {
        Edition[] temp = new Edition[INITIAL_SIZE * 2];

        for (int i = 0; i < this.numberOfEditions; i++) {
            temp[i] = this.editions[i];
        }

        this.editions = temp;
    }

    /**
     * Checks if a given edition already exists in the ManageEditions.
     *
     * @param p the edition to check
     * @return true if the edition already exists, false otherwise
     */
    public boolean isEditionAlreadyInManageEditions(Edition p) {
        for (Edition temp : this.editions) {
            if (temp != null && temp.equals(p)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Adds a new edition to the ManageEditions.
     *
     * @throws IOException if an I/O error occurs
     */
    public void addEdition() throws IOException {
        if (this.numberOfEditions == this.editions.length) {
            extendEditions();
        }

        String name = ConsoleReader.StringReader("Enter the name of the edition: ");

        LocalDate start;
        boolean validDate = false;
        do {
            start = ConsoleReader.LocalDateReader("Enter the start date of the edition (yyyy-mm-dd): ");
            if (start.compareTo(LocalDate.now()) >= 0) {
                validDate = true;
            } else {
                System.out.println("Date is in the Past");
            }
        } while (!validDate);

        String projectTemplate = ManageTemplates.chooseTemplate();
        EditionImpl edition;
        try {
            edition = new EditionImpl(name, start, projectTemplate);
        } catch (IllegalArgumentException exc) {
            System.out.println("Can't add Edition. Invalid Arguments");
            return;
        }
        if (!this.isEditionAlreadyInManageEditions(edition)) {
            editions[numberOfEditions++] = edition;

            System.out.println("Edition added successfully.");
        } else {
            System.out.println("Edition Already exists");
        }
    }

    /**
     * Removes an edition from the ManageEditions based on its name.
     *
     * @param string the name of the edition to remove
     */
    public void removeEdition(String string) {
        try {
            System.out.println(this.numberOfEditions);
            if (string == null || string.equals("")) {
                throw new IllegalArgumentException("");
            }
            int indexToRemove = -1, i;
            for (i = 0; i < this.numberOfEditions; i++) {
                if (this.editions[i].getName().equals(string)) {
                    indexToRemove = i;
                }
            }
            if (indexToRemove == -1) {
                throw new IllegalArgumentException("");
            }
            for (i = indexToRemove; i < this.numberOfEditions - 1; i++) {
                this.editions[i] = this.editions[i + 1];
            }
            this.editions[i] = null;
            this.numberOfEditions--;
            System.out.println("Edition Removed");
        } catch (IllegalArgumentException exc) {
            System.out.println("Edition Not Found");
        }
    }

    /**
     * Returns the numberOfEditions of editions in the ManageEditions.
     *
     * @return the count of editions
     */
    public int getCount() {
        return numberOfEditions;
    }

    /**
     * Returns the edition with the specified name from the ManageEditions.
     *
     * @param name the name of the edition to retrieve
     *
     * @return the edition with the specified name, or null if not found
     */
    public Edition getEdition(String name) {
        for (Edition temp : this.editions) {
            if (temp != null && temp.getName().equals(name)) {
                return temp;
            }
        }
        System.out.println("Edition not Found!");
        return null;
    }

    /**
     * Checks if a given status is ACTIVE and if so checks if it already exists
     * in an edition in the ManageEditions.
     *
     * @param status The status value to check
     * @return true if the edition ACTIVE already exists, false otherwise
     */
    public boolean isAnEditionAlreadyActive(Status status) {
        if (status.equals(Status.ACTIVE)) {
            for (Edition edition : editions) {
                if (edition != null) {
                    if (edition.getStatus().equals(status)) {
                        System.out.println("There is already an Edition Active");
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /**
     * Returns an array of editions that have projects with lack of submissions.
     *
     * @return an array of editions with lack of submissions
     */
    public Edition[] lackOfSubmissions() {
        Edition[] edit = new Edition[this.numberOfEditions];
        int i = 0;
        boolean temp = false;
        for (Edition edition : this.editions) {
            if (edition != null) {
                for (Project proj : edition.getProjects()) {
                    ProjectImpl pro = (ProjectImpl) proj;
                    if (pro != null) {
                        temp = pro.verifyTasksWithNoSubmissions();
                        if (temp == true) {
                            edit[i++] = edition;
                        }
                    }
                }
            }
        }
        return edit;
    }

    /**
     * Returns a string representation of editions that have tasks with no
     * submissions.
     *
     * @return a string representation of editions that have tasks with no
     * submissions.
     */
    public String listLackOfSubmissions() {
        int i = 0;
        int temp = 0;
        StringBuilder sb = new StringBuilder();
        Edition[] edition = lackOfSubmissions();
        for (Edition edit : edition) {
            if (edit != null) {
                sb.append("\tEditions ").append(i + 1).append(":\n");
                EditionImpl edi = (EditionImpl) edit;
                sb.append(edi.toString());
                temp = 1;
            }
        }
        if (temp == 0) {
            sb.append("Every tasks in Editions have submissions").append("\n");
        }

        return sb.toString();
    }

    /**
     * Returns a string representation of the ManageEdition object.
     *
     * @return a string representation of the ManageEdition object
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        try {
            if (this.numberOfEditions < 1) {
                throw new NullPointerException("Manage Editions has no Editions");
            }
            sb.append("ManageEdition{").append("\n");
            for (Edition edition : this.editions) {
                if (edition != null) {
                    sb.append(" --> Edition ").append(i = i + 1).append(":\n");
                    EditionImpl edit = (EditionImpl) edition;
                    sb.append(edit.toString()).append("\n");
                }
            }
            sb.append('}');
        } catch (NullPointerException exc) {
            System.out.println(exc.getMessage());
        }
        return sb.toString();
    }

    /**
     * Returns a string representation of the edition names in the ManageEdition
     * object.
     *
     * @return a string representation of the edition names
     */
    public String editionsNameToString() {
        StringBuilder sb = new StringBuilder();
        try {
            int i = 0;
            sb.append("ManageEdition {").append("\n");
            for (Edition edition : this.editions) {
                if (edition != null) {
                    sb.append(">Edition ").append(i + 1).append(":\n");
                    sb.append(" Name: ").append(edition.getName()).append("\n");
                    i++;
                }
            }
            sb.append("}\n");
        } catch (NullPointerException exc) {
            System.out.println("Manage Editions has no Editions");
        }
        return sb.toString();
    }

    /**
     * Gets the array of editions in the ManageEdition object.
     *
     * @return the array of editions
     */
    public Edition[] getEditions() {
        return editions;
    }

    /**
     * Sets the specified edition in the ManageEdition object.
     *
     * @param edition the edition to set
     */
    public void setEdition(Edition edition) {
        for (int i = 0; i < this.numberOfEditions; i++) {
            if (this.editions[i].equals(edition)) {
                this.editions[i] = edition;
            }
        }
    }
}
