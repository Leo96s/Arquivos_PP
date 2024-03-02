/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system.principal;

import java.io.Serializable;

import system.consolereader.ConsoleReader;

/**
 *
 * @author Leonardo
 */
public class UserManage implements Serializable {
    private User[] userList;
    
    private int count;
    
    private final int INITIAL_SIZE = 10;
    
    public UserManage() {
        this.userList = new User[INITIAL_SIZE];
        
    }
    
    public User createUser() {
        ConsoleReader.StringReader("");
        String name = ConsoleReader.StringReader("Type your name: ");
        
        String email = ConsoleReader.StringReader("Type your email: ");
        
        String username = ConsoleReader.StringReader("Type your username: ");
        
        String password = ConsoleReader.StringReader("Type your password: ");
        
        
        User newUser = new User(name, email, username, password);
        
        this.userList[count++] = newUser;
        
        return newUser;
        
    }
    
    public boolean authenticateUser(User user_) {

        for (User user : userList) {
            if (user.getUsername().equals(user_.getUsername()) && user.getPassword().equals(user_.getPassword())) {
                return true; // Credenciais válidas
            }
        }
        return false; // Credenciais inválidas
    }

    public User UserOnline() {
        ConsoleReader.StringReader("");
        String username = ConsoleReader.StringReader("Type your username: ");

        String password = ConsoleReader.StringReader("Type your password: ");

        User temp = new User(username, password);

        return temp;
    }
    
    public User getUserByUsername(String username) {
        for (User user : userList) {
            if (user.getUsername().equals(username)) {
                return user; // Retorna o usuário correspondente ao nome de usuário fornecido
            }
        }
        return null; // Usuário não encontrado
    }
    
    // Outros métodos relevantes, como obter lista de usuários, atualizar informações do usuário, etc.
}

