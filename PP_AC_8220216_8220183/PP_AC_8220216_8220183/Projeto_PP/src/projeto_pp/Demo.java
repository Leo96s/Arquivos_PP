/* 
* Nome: Joaquim Fontes Matos
* Número: 8220216
* Turma: LEI12T3
* 
* Nome: Leonardo Henrique Barbosa Da Silva
* Número: 8220183
* Turma: LEI12T3
*/
package projeto_pp;

import java.io.*;
import java.text.ParseException;
import ma02_resources.project.exceptions.IllegalNumberOfParticipantType;
import ma02_resources.project.exceptions.IllegalNumberOfTasks;
import ma02_resources.project.exceptions.ParticipantAlreadyInProject;
import ma02_resources.project.exceptions.TaskAlreadyInProject;
import projeto_pp.Menus.Menus;


/**
 * The Demo class is the entry point of the program and invokes the menuPrincipal method.
 * present in the Class Menus.
 */
public class Demo {
    
    /**
     * The main method is the entry point of the program.
     * 
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        
        Menus menu = new Menus();
        
        try {
            menu.menuPrincipal();
        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        } catch (ParseException exc) {
            System.out.println(exc.getMessage());
        } catch (IllegalNumberOfTasks exc) {
            System.out.println(exc.getMessage());
        } catch (TaskAlreadyInProject exc) {
            System.out.println(exc.getMessage());
        } catch (IllegalNumberOfParticipantType exc) {
            System.out.println(exc.getMessage());
        } catch (ParticipantAlreadyInProject exc) {
            System.out.println(exc.getMessage());
        }
    }
}