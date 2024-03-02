package system.FileSystem;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import system.principal.AccountManager;

public class InfoSystemtxt {
    
    public static void writeAccounts(String filename, AccountManager accounts) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));
        out.writeObject(accounts);
        out.close();
    }

    
    public static AccountManager readAccounts(String filename) throws ClassNotFoundException, IOException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));
        AccountManager accounts = (AccountManager) in.readObject();
        in.close();
        return accounts;
    }
}
