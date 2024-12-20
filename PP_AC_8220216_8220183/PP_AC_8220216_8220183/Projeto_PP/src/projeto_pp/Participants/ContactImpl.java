/* 
* Nome: Joaquim Fontes Matos
* Número: 8220216
* Turma: LEI12T3
* 
* Nome: Leonardo Henrique Barbosa Da Silva
* Número: 8220183
* Turma: LEI12T3
 */
package projeto_pp.Participants;

import java.io.Serializable;
import ma02_resources.participants.Contact;

/**
 * The ContactImpl class represents a contact with various details such as
 * street, city, state, zip code, country, and phone number. It implements the
 * Contact interface.
 */
public class ContactImpl implements Contact, Serializable {

    /**
     * The name of the street.
     */
    private String street;
    /**
     * The name of the city.
     */
    private String city;
    /**
     * The name of the state.
     */
    private String state;
    /**
     * The zip code.
     */
    private String zipCode;
    /**
     * The name of the country.
     */
    private String country;
    /**
     * The phone number.
     */
    private String phone;

    /**
     * Constructs a ContactImpl object with the specified contact details.
     *
     * @param street The street address.
     * @param city The city name.
     * @param state The state name.
     * @param zipCode The zip code.
     * @param country The country name.
     * @param phone The phone number.
     */
    public ContactImpl(String street, String city, String state, String zipCode, String country, String phone) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
        this.phone = phone;
    }

    /**
     * Getter method for retrieving the street address.
     *
     * @return The street address.
     */
    @Override
    public String getStreet() {
        return this.street;
    }

    /**
     * Getter method for retrieving the city name.
     *
     * @return The city name.
     */
    @Override
    public String getCity() {
        return this.city;
    }

    /**
     * Getter method for retrieving the state name.
     *
     * @return The state name.
     */
    @Override
    public String getState() {
        return this.state;
    }

    /**
     * Getter method for retrieving the zip code.
     *
     * @return The zip code.
     */
    @Override
    public String getZipCode() {
        return this.zipCode;
    }

    /**
     * Getter method for retrieving the country name.
     *
     * @return The country name.
     */
    @Override
    public String getCountry() {
        return this.country;
    }

    /**
     * Getter method for retrieving the phone number.
     *
     * @return The phone number.
     */
    @Override
    public String getPhone() {
        return this.phone;
    }

    /**
     * Checks if the provided object is equal to this Contact. Two contacts are
     * considered equal if they have the same atributes.
     *
     * @param obj the object to compare
     * @return true if the object is equal to this Contact, false otherwise
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
        final ContactImpl other = (ContactImpl) obj;
        if (other.phone.equals(this.phone)) {
            if (other.city.equals(this.city)) {
                if (other.country.equals(this.country)) {
                    if (other.state.equals(this.state)) {
                        if (other.zipCode.equals(this.zipCode)) {
                            if (other.street.equals(this.street)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /**
     * Returns a string representation of the ContactImpl object.
     *
     * @return a string representation of the ContactImpl object
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\t>Contact Details:\n");
        sb.append("\t Street: ").append(street).append("\n");
        sb.append("\t City: ").append(city).append("\n");
        sb.append("\t State: ").append(state).append("\n");
        sb.append("\t Zip Code: ").append(zipCode).append("\n");
        sb.append("\t Country: ").append(country).append("\n");
        sb.append("\t Phone: ").append(phone);

        return sb.toString();
    }
}
