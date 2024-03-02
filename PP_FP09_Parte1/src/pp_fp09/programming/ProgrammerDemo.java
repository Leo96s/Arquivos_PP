/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp09.programming;

import Enumerations.HabilitacoesLiterarias;
import Enumerations.ProgrammerType;
import Enumerations.TipContrato;

/**
 *
 * @author Leonardo
 */
public class ProgrammerDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Administrative admin = new Administrative("ABC", TipContrato.INTEGRAL, HabilitacoesLiterarias.LICENCIATURA, "22-03-1982", "23-07-1982",
        "David", "12-03-1977", "rua da cobica", 123456789, 1234, 721);
        
        JavaProgrammer programmer = new JavaProgrammer(1, 3, "Project X", ProgrammerType.JUNIOR, "LEO", "24-07-2004", "rua de cunha", 123456789, 
        123, 845);
        
        String[] conjproject = {"Project X", "Project Y"}; 
        
        ProjectManager manager = new ProjectManager(2, conjproject, "01-03-2006", 3, "Monteiro", "23-04-1986", "rua da luz", 123456789, 12,
        900);
        
        ProgrammingManagement progmanagement = new ProgrammingManagement();
        
        progmanagement.addPerson(admin);
        progmanagement.addPerson(programmer);
        progmanagement.addPerson(manager);
        progmanagement.removePerson(programmer);
        System.out.println(progmanagement.listGestorProj());
        System.out.println(progmanagement.toString());
        
    }
    
}
