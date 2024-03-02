/* 
* Nome: Joaquim Fontes Matos
* Número: 8220216
* Turma: LEI12T3
* 
* Nome: Leonardo Henrique Barbosa Da Silva
* Número: 8220183
* Turma: LEI12T3
 */
package projeto_pp.files;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import ma02_resources.participants.InstituitionType;
import ma02_resources.project.Status;

/**
 * The ConsoleReader class provides utility methods for reading different types
 * of input from the console.
 */
public class ConsoleReader {

    /**
     * Reads an integer from the console.
     *
     * @param message The message to display before reading the input.
     *
     * @return The integer value entered by the user.
     */
    public static int intReader(String message) {
        int num = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                System.out.print(message);
                num = Integer.parseInt(reader.readLine());
                validInput = true;
            } catch (IOException exc) {
                System.out.println("IO Exception\nIntroduce a new value");
            } catch (NumberFormatException exc) {
                System.out.println("Invalid Format\nIntroduce a new value");
            }
        }
        return num;
    }

    /**
     * Reads a string from the console.
     *
     * @param message The message to display before reading the input.
     *
     * @return The string entered by the user.
     */
    public static String StringReader(String message) {
        String string = null;
        boolean validInput = false;

        while (!validInput) {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                System.out.print(message);
                string = reader.readLine();
                validInput = true;
            } catch (IOException exc) {
                System.out.println("IO Exception\nIntroduce a new value");
            }
        }
        return string;
    }

    /**
     * Reads a LocalDate object from the console.
     *
     * @param message The message to display before reading the input.
     *
     * @return The LocalDate object entered by the user.
     */
    public static LocalDate LocalDateReader(String message) {
        LocalDate date = null;
        boolean validInput = false;

        while (!validInput) {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                System.out.print(message);
                date = LocalDate.parse(reader.readLine());
                validInput = true;
            } catch (IOException exc) {
                System.out.println("IO Exception\nIntroduce a new date");
            } catch (DateTimeParseException exc) {
                System.out.println("Invalid Format\nIntroduce a new date");
            }
        }
        return date;
    }

    /**
     * Reads a LocalDateTime object from the console.
     *
     * @param message The message to display before reading the input.
     *
     * @return The LocalDateTime object entered by the user.
     */
    public static LocalDateTime LocalDateTimeReader(String message) {
        LocalDateTime date = null;
        boolean validInput = false;

        while (!validInput) {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                System.out.print(message);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                date = LocalDateTime.parse(reader.readLine(), formatter);
                validInput = true;
            } catch (IOException exc) {
                System.out.println("IO Exception\nIntroduce a new date");
            } catch (DateTimeParseException exc) {
                System.out.println("Invalid Format\nIntroduce a new date");
            }
        }
        return date;
    }

    /**
     * Reads a Status enum value from the console.
     *
     * @param message The message to display before reading the input.
     *
     * @return The Status enum value entered by the user.
     */
    public static Status StatusReader(String message) {
        Status status = null;

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print(message);
            status = Status.valueOf(reader.readLine().toUpperCase());
        } catch (IOException exc) {
            return null;
        } catch (IllegalArgumentException exc) {
            return null;
        }
        return status;
    }

    /**
     * Reads a InstituitionType enum value from the console.
     *
     * @param message The message to display before reading the input.
     *
     * @return The InstituitionType enum value entered by the user.
     */
    public static InstituitionType InstituitionTypeReader(String message) {
        InstituitionType instituitionType = null;
        boolean validInput = false;

        while (!validInput) {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                System.out.print(message);
                instituitionType = InstituitionType.valueOf(reader.readLine().toUpperCase());
                validInput = true;
            } catch (IOException exc) {
                System.out.println("IO Exception\nIntroduce a status");
                return null;
            } catch (IllegalArgumentException exc) {
                System.out.println("Invalid Format\nIntroduce a status");
            }
        }
        return instituitionType;
    }

    /**
     * Reads an array of strings from the console.
     *
     * @param message The message to display before reading each input.
     *
     * @return The array of strings entered by the user.
     */
    public static String[] StringReaderArray(String message) {
        String[] strings = new String[1];
        int index = 0;
        String input;
        do {
            if (index == strings.length) {
                strings = resizeArray(strings);
            }

            System.out.println(message);
            input = StringReader("");
            if (!input.equalsIgnoreCase("end")) {
                strings[index++] = input;
            }
        } while (!input.equalsIgnoreCase("end"));

        return strings;
    }

    /**
     * Resizes the given string array to the specified size.
     *
     * @param array The string array to resize.
     * @param size The new size of the array.
     * @return The resized array.
     */
    private static String[] resizeArray(String[] array) {
        String[] newArray = new String[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
        return array;
    }

    /**
     * Validates an email address.
     *
     * @param email The email address to validate.
     *
     * @return true if the email address is valid, false otherwise.
     */
    public static boolean validateEmail(String email) {
        int atPos = email.indexOf('@');
        int dotPos = email.lastIndexOf('.');

        if (atPos == -1 || atPos == 0 || dotPos == -1 || dotPos == email.length() - 1 || dotPos - atPos <= 1) {
            return false;
        }

        int dotCount = 0;
        for (int i = atPos + 1; i < dotPos; i++) {
            if (email.charAt(i) == '.') {
                dotCount++;
            }
        }

        if (dotCount < 0) {
            return false;
        }
        return true;
    }

    /**
     * Validates a phone number.
     *
     * @param number The phone number to validate.
     *
     * @return true if the phone number is valid, false otherwise.
     */
    public static boolean validateNum(String number) {
        try {
            int num = Integer.parseInt(number);
            if (number.length() == 9) {
                return true;
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: This number not has only numbers!");
        }
        return false;
    }

    /**
     * Validates a website.
     *
     * @param website The website to validate.
     *
     * @return true if the website is valid, false otherwise.
     */
    public static boolean validateWebsite(String website) {
        String regex = "^(http(s)?://)?([\\w-]+\\.)+[\\w-]+(/[\\w- ;,./?%&=]*)?$";
        return website.matches(regex);
    }
}
