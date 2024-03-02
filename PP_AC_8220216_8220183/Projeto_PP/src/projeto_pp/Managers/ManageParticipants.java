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
import ma02_resources.participants.Contact;
import ma02_resources.participants.Instituition;
import ma02_resources.participants.InstituitionType;
import ma02_resources.participants.Participant;
import projeto_pp.Participants.ContactImpl;
import projeto_pp.Participants.FacilitatorImpl;
import projeto_pp.Participants.InstituitionImpl;
import projeto_pp.Participants.PartnerImpl;
import projeto_pp.Participants.StudentImpl;
import projeto_pp.files.ConsoleReader;

/**
 * The ManageParticipants class provides methods for managing participant
 * information.
 */
public class ManageParticipants {

    /**
     * Retrieves participant information from the user and returns a Participant
     * object.
     *
     * @return The Participant object with the entered information.
     *
     * @throws IOException if there is an error reading user input.
     */
    public static Participant getParticipantsInfo() throws IOException {
        String type;
        boolean validType = false;
        boolean validEmail = false;
        boolean validWebsite = false;
        String email = null;
        String website = null;

        do {
            type = ConsoleReader.StringReader("What is the type of the participant? (Student/Partner/Facilitator): ");

            if (!type.equals("Student") && !type.equals("Partner") && !type.equals("Facilitator")) {
                System.out.println("This type of participant does not exist!");
            } else {
                validType = true;
            }
        } while (validType == false);

        String name = ConsoleReader.StringReader("Enter the name of the Participant: ");

        while (validEmail == false) {

            email = ConsoleReader.StringReader("Enter the email of the Participant: ");
            if (ConsoleReader.validateEmail(email)) {
                validEmail = true;
            }
            if (validEmail == false) {
                System.out.println("Enter the email in right format: ");
            }
        }

        Contact contact = addContact();

        Instituition instituition;
        do {
            instituition = addInstituition();
        } while (instituition == null);

        switch (type) {
            case "Student":
                int number = ConsoleReader.intReader("Enter the number of the Student: ");

                StudentImpl student = new StudentImpl(number, name, email, contact, instituition);

                System.out.println("Participant added successfully");

                return student;

            case "Partner":
                String vat = ConsoleReader.StringReader("Enter the vat number of the partner: ");

                while (validWebsite == false) {
                    website = ConsoleReader.StringReader("Enter the Website of the partner: ");
                    if (ConsoleReader.validateWebsite(website)) {
                        validWebsite = true;
                    }
                    if (validWebsite == false) {
                        System.out.println("Enter the website in right format: (http(s)://)");
                    }
                }
                PartnerImpl partner = new PartnerImpl(vat, website, name, email, contact, instituition);

                System.out.println("Participant added successfully");

                return partner;
            case "Facilitator":
                String areaOfExpertise = ConsoleReader.StringReader("Enter the Area of Expertise of the Facilitator: ");

                FacilitatorImpl facilitator = new FacilitatorImpl(name, email, contact, instituition, areaOfExpertise);

                System.out.println("Participant added successfully");

                return facilitator;
            default:
                System.out.println("This participant does not exist!");
                return null;
        }

    }

    /**
     * Retrieves contact information from the user and returns a Contact object.
     *
     * @return The Contact object with the entered information.
     *
     * @throws IOException if there is an error reading user input.
     */
    public static Contact addContact() throws IOException {
        boolean phonenumber = false;
        boolean breakLoop = false;

        String phone = null;
        String street = ConsoleReader.StringReader("Enter the name of the street: ");

        String city = ConsoleReader.StringReader("Enter the name of the City: ");

        String state = ConsoleReader.StringReader("Enter the name of the State: ");

        String zipcode = ConsoleReader.StringReader("Enter the Zip Code: ");

        String country = ConsoleReader.StringReader("Enter the name of the Country: ");

        while (phonenumber == false && breakLoop == false) {

            phone = ConsoleReader.StringReader("Enter the phone number: ");
            if (!phone.equals("")) {
                if (ConsoleReader.validateNum(phone)) {
                    phonenumber = true;
                }
                if (phonenumber == false) {
                    System.out.println("Enter the phone number with 9 digits");
                }
            } else {
                breakLoop = true;
            }
        }

        ContactImpl contact = new ContactImpl(street, city, state, zipcode, country, phone);

        return contact;
    }

    /**
     * Retrieves the instituition information from the user and returns a Instituition object.
     *
     * @return The Instituition object with the entered information.
     *
     * @throws IOException if there is an error reading user input.
     */
    public static Instituition addInstituition() throws IOException {
        boolean validemail = false;
        boolean validWebsite = false;
        String emailInstituition = null;
        String website = null;

        String nameInstituition = ConsoleReader.StringReader("Enter the name of the Instituition: ");

        while (validemail == false) {
            emailInstituition = ConsoleReader.StringReader("Enter the email of the Instituition: ");
            if (ConsoleReader.validateEmail(emailInstituition)) {
                validemail = true;
            }
            if (validemail == false) {
                System.out.println("Enter the email in right format: ");
            }
        }
        InstituitionType instituitionType = ConsoleReader.InstituitionTypeReader("Enter the instituition type: (UNIVERSITY/COMPANY/NGO/OTHER): ");

        Contact contact = addContact();

        while (validWebsite == false) {
            website = ConsoleReader.StringReader("Enter the website of the Instituition: ");
            if (ConsoleReader.validateWebsite(website)) {
                validWebsite = true;
            }
            if (validWebsite == false) {
                System.out.println("Enter the website in right format: (http(s)://)");
            }
        }
        String description = ConsoleReader.StringReader("Enter the description of the Instituition: ");
        InstituitionImpl instituition = null;
        try {
            instituition = new InstituitionImpl(nameInstituition, emailInstituition, instituitionType, contact, website, description);
        } catch (IllegalArgumentException exc) {
            System.out.println("Illegal Arguments");

        }
        return instituition;
    }
}
