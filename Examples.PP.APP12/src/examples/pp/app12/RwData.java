/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples.pp.app12;
import java.io.IOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
/**
 *
 * @author Leonardo
 */
public class RwData {
    public static void main(String args[]) throws IOException {
        DataOutputStream dataOut;
        DataInputStream dataIn;
        int i = 10;
        double d = 1023.56;
        boolean b = true;
        try {
            dataOut = new DataOutputStream(new FileOutputStream("testdata"));}
            catch(IOException exc) {
            System.out.println("Cannot open file.");
            return;
            }
        // Continuação da classe RWData
        try {
            System.out.println("Writing " + i);
            dataOut.writeInt(i);
            System.out.println("Writing " + d);
            dataOut.writeDouble(d);
            System.out.println("Writing " + b);
            dataOut.writeBoolean(b);
            System.out.println("Writing " + 12.2 * 7.4);
            dataOut.writeDouble(12.2 * 7.4);
        }
        catch(IOException exc) {
        System.out.println("Write error.");
        }
        dataOut.close();
        System.out.println();
    // Now, read them back.
        try {
            dataIn = new DataInputStream(new FileInputStream("testdata"));}
            catch(IOException exc) {
                System.out.println("Cannot open file.");
                return;
            }
        try {
            i = dataIn.readInt();
            System.out.println("Reading " + i);
            d = dataIn.readDouble();
            System.out.println("Reading " + d);
            b = dataIn.readBoolean();
            System.out.println("Reading " + b);
            d = dataIn.readDouble();
            System.out.println("Reading " + d);
        }
        catch(IOException exc) {
            System.out.println("Read error.");
        }
        dataIn.close();
    } 
}
