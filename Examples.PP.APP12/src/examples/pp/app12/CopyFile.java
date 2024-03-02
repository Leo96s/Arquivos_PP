/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples.pp.app12;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
/**
 *
 * @author Leonardo
 */
public class CopyFile {
    public static void main(String args[]) throws IOException {
        int i;
        FileInputStream fin;
        FileOutputStream fout;
        try {
        // open input file
        try {
            fin = new FileInputStream(args[0]);
        } catch(FileNotFoundException exc) {
        System.out.println("Input File Not Found");
        return;
        }
        // open output file
        try {
            fout = new FileOutputStream(args[1]);
        } catch(FileNotFoundException exc) {
        System.out.println("Error Opening Output File");
        return;
        }
        } catch(ArrayIndexOutOfBoundsException exc) {
        System.out.println("Usage: CopyFile From To");
        return;
        }
        // Copy File
        try {
            do {
                i = fin.read();
                if(i != -1) fout.write(i);
            } while(i != -1);
        } catch(IOException exc) {
        System.out.println("File Error");
        }
        fin.close();
        fout.close();
    } 
}
