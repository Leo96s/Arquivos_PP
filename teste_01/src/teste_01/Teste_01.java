/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste_01;

/**
 *
 * @author Leonardo
 */
public class Teste_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Teste teste = new Teste("leo", "2-2-2", "Portugues");
        
        Teste teste2 = new Teste("leo", "3-3-3", "Port");
        
        Teste teste3 = new Teste("leo3");
        
        TesteManagement managteste = new TesteManagement();
        
        managteste.addtest(teste);
        managteste.addtest(teste2);
        managteste.addtest(teste3);
        
        System.out.println(managteste.toString());
    }
    
}
