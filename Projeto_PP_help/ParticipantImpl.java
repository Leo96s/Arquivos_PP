/**
 *
 * @author Joaquim Matos
 */
public class ParticipantImpl implements Participant {

    private String name;
    
    private String email;

    private Contact contact;

    private Instituition institution;

    public ParticipantImpl(String name, String email, Contact contact, Instituition institution) {
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.institution = institution;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public Contact getContact() {
        return this.contact;
    }

    @Override
    public Instituition getInstituition() {
        return this.institution;
    }

    @Override
    public void setInstituition(Instituition instn) {
        this.institution = instn;
    }

    @Override
    public void setContact(Contact cntct) {
        this.contact = cntct;
    }
}
