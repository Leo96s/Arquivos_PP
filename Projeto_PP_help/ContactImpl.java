
/**
 *
 * @author Joaquim Matos
 */
public class ContactImpl implements Contact {

    private String street;

    private String city;

    private String state;

    private String zipCode;

    private String country;

    private String phone;

    @Override
    public String getStreet() {
        return this.street;
    }

    @Override
    public String getCity() {
        return this.city;   
    }

    @Override
    public String getState() {
       return this.state;  
    }

    @Override
    public String getZipCode() {
        return this.zipCode;  
    }

    @Override
    public String getCountry() {
        return this.country;  
    }

    @Override
    public String getPhone() {
        return this.phone;  
    }
}
