/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system.tester;

import java.io.IOException;
import system.menu.Menus;

public class Demo {
    
    public static void main(String[] args){
        Menus menu = new Menus();

        try {
            menu.menuPrincipal();
        } catch (IOException e) {
        }
    }
}
