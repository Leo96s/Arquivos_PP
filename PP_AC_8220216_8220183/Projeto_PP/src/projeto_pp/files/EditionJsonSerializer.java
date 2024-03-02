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

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import projeto_pp.Managers.ManageEditions;

/**
 * The EditionJsonSerializer class is responsible for serializing and
 * deserializing ManageEditions objects to/from a file.
 */
public class EditionJsonSerializer {

    /**
     * Writes the ManageEditions object to the specified file.
     *
     * @param filename The name of the file to write to.
     * @param editions The ManageEditions object to serialize.
     * 
     * @throws IOException If an I/O error occurs while writing the file.
     */
    public static void writeEditions(String filename, ManageEditions editions) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream(filename));
        out.writeObject(editions);
        out.close();
    }

    /**
     * Reads the ManageEditions object from the specified file.
     *
     * @param filename The name of the file to write to.
     * 
     * @return The created ManageEditions object.
     * 
     * @throws java.lang.ClassNotFoundException If the ManageEdition class is not found
     * @throws IOException If an I/O error occurs while writing the file.
     */
    public static ManageEditions readEditions(String filename) throws ClassNotFoundException, IOException {
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(filename));
        ManageEditions editions = (ManageEditions) in.readObject();
        in.close();
        return editions;
    }
}
