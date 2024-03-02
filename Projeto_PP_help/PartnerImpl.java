
/**
 *
 * @author Leonardo
 */
public class PartnerImpl extends ParticipantImpl implements Partner {
    private String vat;
    
    private String website;

    public PartnerImpl(String vat, String website, String name, String email, Contact contact, Instituition institution) {
        super(name, email, contact, institution);
        this.vat = vat;
        this.website = website;
    }


    @Override
    public String getVat() {
        return this.vat; 
    }

    @Override
    public String getWebsite() {
        return this.website;
    }
    
}
