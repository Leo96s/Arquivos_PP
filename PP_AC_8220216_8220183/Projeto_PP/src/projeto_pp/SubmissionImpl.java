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

import java.io.Serializable;
import java.time.LocalDateTime;
import ma02_resources.participants.Student;
import ma02_resources.project.Submission;
import projeto_pp.Participants.StudentImpl;

/**
 * This class represents an implementation of the Submission interface.
 *
 * Stores information about a submission, including the date, the student who
 * made the submission, and the content of the submission text.
 *
 * The class also implements the Serializable interface to allow the
 * serialization of objects of this class into a format that can be stored or
 * transmitted.
 *
 * @author Leonardo
 */
public class SubmissionImpl implements Submission, Serializable {
    
    /**
     * The date of submission
     */
    private LocalDateTime date;
    
    /**
     * The Student of submission
     */
    private Student student;
    
    /**
     * The text of Submission
     */
    private String text;

    /**
     * Creates a new instance of SubmissionImpl.
     *
     * @param date the date of the submission
     * @param student the student who made the submission
     * @param text the text content of the submission
     */
    public SubmissionImpl(LocalDateTime date, Student student, String text) {
        this.date = date;
        this.student = student;
        this.text = text;
    }

    /**
     * Sets the student who made the submission.
     *
     * @param student the student who made the submission
     */
    public void setStudent(Student student) {
        this.student = student;
    }

    /**
     * Sets the text content of the submission.
     *
     * @param text the text content of the submission
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Retrieves the date of the submission.
     *
     * @return the date of the submission
     */
    @Override
    public LocalDateTime getDate() {
        return this.date;
    }

    /**
     * Retrieves the student who made the submission.
     *
     * @return the student who made the submission
     */
    @Override
    public Student getStudent() {
        return this.student;
    }

    /**
     * Retrieves the text content of the submission.
     *
     * @return the text content of the submission
     */
    @Override
    public String getText() {
        return this.text;
    }

    /**
     * Compares this submission to another submission based on their dates.
     *
     * @param sbmsn the submission to compare to
     * @return the value 0 if the dates are equal, a value less than 0 if this
     * submission date is before the other submission date, or a value greater
     * than 0 if this submission date is after the other submission date
     */
    @Override
    public int compareTo(Submission sbmsn) {
        return this.date.compareTo(sbmsn.getDate());
    }

    /**
     * Retrieves the string representation of the submission.
     *
     * @return the string representation of the submission
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\tSubmission Details:\n");
        sb.append("\tDate: ").append(date.toString()).append("\n");
        StudentImpl temp = (StudentImpl) this.student;

        sb.append(temp.listParticipantImportantInfo()).append("\n");
        sb.append("\tText: ").append(text).append("\n");
        return sb.toString();
    }
}