/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp05.expenses;

/**
 *
 * @author Leonardo
 */
public class ExpensesDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User user1 = new User("Leonardo", "8220183@estg.ipp.pt", "2004-07-24");
        User user2 = new User("Mateus", "8220134@estg.ipp.tp", "2004-05-23");

        user1.expenses[0] = new Expenses("Alimentacao", 2000, "2023-02-12");
        user1.expenses[1] = new Expenses("Outros", 500, "2023-03-05");

        user2.expenses[0]= new Expenses("Roupas", 250, "2023-02-03");
        user2.expenses[1] = new Expenses("Automovel", 2300, "2023-03-12");

        System.out.println("----------------------------");

        System.out.println(user1.id);
        System.out.println(user1.nome);
        System.out.print(user1.email);
        System.out.println(user1.datanascimento);
        System.out.println("Despesas:");
        for (int i = 0; i < 2; i++) {
            System.out.println(user1.expenses[i].id);
            System.out.println(user1.expenses[i].tipo);
            System.out.println(user1.expenses[i].montante);
            System.out.println(user1.expenses[i].data);
        }
        
        System.out.println("----------------------------");

        System.out.println(user2.id);
        System.out.println(user2.nome);
        System.out.print(user2.email);
        System.out.println(user2.datanascimento);
        System.out.println("Despesas:");

        for (int j = 0; j < 2; j++) {
            System.out.println(user2.expenses[j].id);
            System.out.println(user2.expenses[j].tipo);
            System.out.println(user2.expenses[j].montante);
            System.out.println(user2.expenses[j].data);
        }

        System.out.println("----------------------------");
    }
}
    

