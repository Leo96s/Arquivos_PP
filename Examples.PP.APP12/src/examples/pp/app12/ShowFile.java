/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples.pp.app12;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
/**
 *
 * @author Leonardo
 */
public class ShowFile {
    public static void main(String args[]) throws IOException {
        int i;
        FileInputStream fin;
        try {
            fin = new FileInputStream(args[0]);
        } catch(FileNotFoundException exc) {
        System.out.println("File Not Found");
        return;
        } catch(ArrayIndexOutOfBoundsException exc) {
        System.out.println("Usage: ShowFile File");
        return;
        }
        // read bytes until EOF is encountered
        do {
        i = fin.read();
        if(i != -1) System.out.print((char) i);
        } while(i != -1);
        fin.close();
    } 
}
