
/**
 *
 * @author Leonardo
 */
public class StudentImpl extends ParticipantImpl implements Student{
    private int number;

    public StudentImpl(int number, String name, String email, Contact contact, Instituition institution) {
        super(name, email, contact, institution);
        this.number = number;
    }
    
    @Override
    public int getNumber() {
        return this.number;
    }
        
}
