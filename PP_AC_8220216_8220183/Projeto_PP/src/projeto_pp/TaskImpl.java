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

import java.time.LocalDate;
import java.io.Serializable;
import ma02_resources.project.Submission;
import ma02_resources.project.Task;

/**
 * The TaskImpl class represents a task implementation with a title,
 * description, start date, and duration. It implements the Task interface.
 */
public class TaskImpl implements Task, Serializable {
    
    /**
     * The initial date of task
     */
    private LocalDate startDate;
    
    /**
     * The final date of task
     */
    private LocalDate endDate;
    
    /**
     * The duration of task
     */
    private int duration;
    
    /**
     * The title of task
     */
    private String title;
    
    /**
     * The description of task
     */
    private String description;
    
    /**
     * The array submissions of task
     */
    private Submission[] submissions;
    
    /**
     * The number of submissions
     */
    private int numberOfSubmissions;
    
    /**
     * Initial size of Submissions
     */
    private final int INITIAL_SIZE = 5;

    /**
     *
     * Creates a new instance of TaskImpl with default values. The submissions
     * array is initialized with an initial size.
     */
    public TaskImpl() {
        this.submissions = new Submission[INITIAL_SIZE];
    }

    /**
     * /**
     *
     * Creates a new instance of TaskImpl with the specified values. The
     * submissions array is initialized with an initial size.
     *
     * @param startDate the start date of the task
     * @param endDate the end date of the task
     * @param duration the duration of the task
     * @param title the title of the task
     * @param description the description of the task
     */
    public TaskImpl(LocalDate startDate, LocalDate endDate, int duration, String title, String description) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.duration = duration;
        this.title = title;
        this.description = description;
        this.submissions = new Submission[INITIAL_SIZE];
    }

    /**
     *
     * Sets the start date of the task.
     *
     * @param startDate the start date to be set
     */
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    /**
     *
     * Sets the end date of the task.
     *
     * @param endDate the end date to be set
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /**
     *
     * Sets the duration of the task.
     *
     * @param duration the duration to be set
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     *
     * Sets the title of the task.
     *
     * @param title the title to be set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * Sets the description of the task.
     *
     * @param description the description to be set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * Sets the submissions array of the task.
     *
     * @param submissions the submissions array to be set
     */
    public void setSubmissions(Submission[] submissions) {
        this.submissions = submissions;
    }

    /**
     *
     * Sets the number of submissions for the task.
     *
     * @param numberOfSubmissions the number of submissions to be set
     */
    public void setNumberOfSubmissions(int numberOfSubmissions) {
        this.numberOfSubmissions = numberOfSubmissions;
    }

    /**
     *
     * Returns the start date of the task.
     *
     * @return the start date of the task
     */
    @Override
    public LocalDate getStart() {
        return this.startDate;
    }

    /**
     *
     * Returns the end date of the task.
     *
     * @return the end date of the task
     */
    @Override
    public LocalDate getEnd() {
        return this.endDate;
    }

    /**
     *
     * Returns the duration of the task.
     *
     * @return the duration of the task
     */
    @Override
    public int getDuration() {
        return this.duration;
    }

    /**
     *
     * Returns the title of the task.
     *
     * @return the title of the task
     */
    @Override
    public String getTitle() {
        return this.title;
    }

    /**
     *
     * Returns the description of the task.
     *
     * @return the description of the task
     */
    @Override
    public String getDescription() {
        return this.description;
    }

    /**
     *
     * Returns the submissions array of the task.
     *
     * @return the submissions array of the task
     */
    @Override
    public Submission[] getSubmissions() {
        return this.submissions;
    }

    /**
     *
     * Returns the number of submissions for the task.
     *
     * @return the number of submissions for the task
     */
    @Override
    public int getNumberOfSubmissions() {
        return this.numberOfSubmissions;
    }

    /**
     *
     * Extends the submissions array by creating a new array with a larger size
     * and copying the existing submissions into the new array.
     */
    private void extendSubmissions() {
        Submission[] temp = new Submission[this.numberOfSubmissions + 2];

        for (int i = 0; i < this.numberOfSubmissions; i++) {
            temp[i] = this.submissions[i];
        }

        this.submissions = temp;
    }

    /**
     *
     * Adds a submission to the task.
     *
     * If the submissions array is full, it extends the array before adding the
     * submission.
     *
     * @param sbmsn the submission to be added
     */
    @Override
    public void addSubmission(Submission sbmsn) {
        try {
            if (sbmsn == null) {
                throw new IllegalArgumentException("Illegal Argument Exception");
            }

            if (this.numberOfSubmissions == this.submissions.length) {
                this.extendSubmissions();
            }

            this.submissions[this.numberOfSubmissions++] = sbmsn;
            System.out.println("Submission was added successfully");
        } catch (IllegalArgumentException exc) {
            System.out.println(exc.getMessage());
        }
    }

    /**
     *
     * Extends the deadline of the task by adding a specified number of days to
     * the end date and duration.
     *
     * @param i the number of days to extend the deadline by
     */
    @Override
    public void extendDeadline(int i) {
        try {
            if (i < 0) {
                throw new IllegalArgumentException("Illegal Argument Exception");
            } else {
                this.endDate = this.endDate.plusDays(i);
                this.duration += i;
                System.out.println("Deadline extended to: " + endDate.toString());
            }
        } catch (IllegalArgumentException exc) {
            System.out.println(exc.getMessage());
        }
    }

    /**
     *
     * Compares this task's start date with another task's start date.
     *
     * @param task the task to compare with
     * @return the result of the comparison
     */
    @Override
    public int compareTo(Task task) {
        return this.startDate.compareTo(task.getStart());
    }

    /**
     *
     * Checks if this task is equal to another object.
     *
     * @param obj the object to compare with
     * @return true if the objects are equal, false otherwise
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
        final TaskImpl other = (TaskImpl) obj;
        if (this.title.equals(other.title)) {
            return true;
        }
        return false;
    }

    /**
     *
     * Returns a string representation of the task.
     *
     * @return a string representation of the task
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\tTitle: ").append(title).append("\n");
        sb.append("\tDescription: ").append(descriptionToString());
        sb.append("\tStart Date: ").append(startDate).append("\n");
        sb.append("\tEnd Date: ").append(endDate).append("\n");
        sb.append("\tDuration: ").append(duration).append("\n");
        sb.append("\tNumber of Submissions: ").append(numberOfSubmissions);

        return sb.toString();
    }

    /**
     *
     * Converts the description of the task to a formatted string.
     *
     * @return the formatted string representation of the description
     */
    private String descriptionToString() {
        StringBuilder sb = new StringBuilder();
        String[] splitedDescription = description.split("\\. ");

        int lineNum = 0;
        for (String line : splitedDescription) {
            if (lineNum++ > 0) {
                sb.append("\t");
            }
            sb.append(line).append(".\n");
        }
        return sb.toString();
    }

    /**
     *
     * Returns a string representation of the submissions for the task.
     *
     * @return a string representation of the submissions
     */
    public String listSubmissions() {
        StringBuilder sb = new StringBuilder();
        try {
            if (this.numberOfSubmissions < 1) {
                throw new NullPointerException("Task has no Submissions");
            }
            sortDates( this.numberOfSubmissions);
            int i = 0;
            sb.append("Submissions{\n");
            for (Submission temp : this.submissions) {
                if (temp != null) {
                    SubmissionImpl submission = (SubmissionImpl) temp;

                    sb.append("  >> Submission").append(++i).append(":\n");
                    sb.append(submission.toString());
                }
            }
            sb.append("}\n");
        } catch (NullPointerException exc) {
            System.out.println(exc.getMessage());
        }
        return sb.toString();
    }

    /**
     *
     * Sorts the submissions array by the date of the submissions.
     *
     * @param number the number of submissions in the array
     */
    private void sortDates(int number) {
        int n = number;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (submissions[j].getDate().isBefore(submissions[minIndex].getDate())) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                Submission temp = submissions[i];
                submissions[i] = submissions[minIndex];
                submissions[minIndex] = temp;
            }
        }
    }
}