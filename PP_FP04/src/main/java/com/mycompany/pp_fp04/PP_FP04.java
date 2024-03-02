/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pp_fp04;
import pp_fp04.exchange.CurrancyRates;

/**
 *
 * @author Leonardo
 */
public class PP_FP04 {

    /**
     * @param args the command line arguments
     */
    
static User user1, user2;

    public static void main(String[] args) {
        user1.id[0] = 'A';
        user1.id[1] = 'B';
        user1.id[2] = 'C';
        user1.name = new char[]{'B', 'R', 'U', 'N', 'O'};
        user1.email = new char[]{'b', 'm', 'o', '@', 'e', 's', 't', 'g', '.',
            'i', 'p', 'p', '.', 'p', 't'};

        user2.id[0] = 'D';
        user2.id[1] = 'F';
        user2.id[2] = 'G';
        user2.name = new char[]{'L', 'E', 'O', 'N', 'A', 'R', 'D', 'O'};
        user2.email = new char[]{'l', 'e', 'o', '@', 'e', 's', 't', 'g', '.',
            'i', 'p', 'p', '.', 'p', 't'};

        System.out.println("Exercicio 1: ");
        System.out.println("--------User1------");
        System.out.print("ID:");
        System.out.println(user1.id);
        System.out.print("Name: ");
        System.out.println(user1.name);
        System.out.print("Email: ");
        System.out.println(user1.email);

        System.out.println("--------User2------");
        System.out.print("ID:");
        System.out.println(user2.id);
        System.out.print("Name: ");
        System.out.println(user2.name);
        System.out.print("Email: ");
        System.out.println(user2.email);

        System.out.println("Exercicio 2: ");
        user1.despesas.number1 = 0;
        user1.despesas.CarValues[0] = 109.6;
        user1.despesas.CarValues[1] = 34.6;
        user1.despesas.CarValues[2] = 56.6;
        user1.despesas.CarValues[3] = 200.6;
        user1.despesas.CarValues[4] = 145.6;

        System.out.println("Despesa no. " + user1.despesas.number1);

        for (int i = 0; i < user1.despesas.CarValues.length; i++) {

            System.out.println(user1.despesas.CarValues[i]);
        }

        user1.despesas.number2 = 1;
        user1.despesas.foodValues[0] = 300.4;
        user1.despesas.foodValues[1] = 450.4;
        user1.despesas.foodValues[2] = 267.4;
        user1.despesas.foodValues[3] = 125.4;
        user1.despesas.foodValues[4] = 367.4;

        System.out.println("Despesa no. " + user1.despesas.number2);

        for (int i = 0; i < user1.despesas.foodValues.length; i++) {
            System.out.println(user1.despesas.foodValues[i]);
        }
        
        double ndespesa1 = 0, ndespesa2 = 0, despesatotal = 0, mediadespesa = 0;
        
        for (int i = 0; i < user1.despesas.CarValues.length; i++) {
            
            ndespesa1 = ndespesa1 + user1.despesas.CarValues[i];              
        }
        System.out.println("Total da despesa: " + ndespesa1); 

        for (int i = 0; i < user1.despesas.foodValues.length; i++) {
            
            ndespesa2 = ndespesa2 + user1.despesas.foodValues[i];              
        }
        System.out.println("Total da despesa: " + ndespesa2); 
        
        despesatotal = ndespesa1 + ndespesa2;
        System.out.println("Total de todas as despesas: " + despesatotal);
        
        mediadespesa = despesatotal / 31;
        System.out.println("Media das despesas: " + mediadespesa);
        
        System.out.println("Exercicio 3: ");
        double totaldolar = 0, mediadolar = 0;
        double totaliene = 0, mediaiene = 0;
        double totallibras = 0, medialibras = 0;

        totaldolar = despesatotal * CurrancyRates.EurotoDolar;
        mediadolar = mediadespesa * CurrancyRates.EurotoDolar;

        totaliene = despesatotal * CurrancyRates.Eurotoiene;
        mediaiene = mediadespesa * CurrancyRates.Eurotoiene;

        totallibras = despesatotal * CurrancyRates.EurotoGBP;
        medialibras = mediadespesa * CurrancyRates.EurotoGBP;

        System.out.println("Total em dolar: " + totaldolar + "\n" + 
        "Media em dolar: " + mediadolar);
        
        System.out.println("Total em iene: " + totaliene + "\n" +
        "Media em iene: " + mediaiene);

        System.out.println("Total em libras: " + totallibras + "\n" +
        "Media em libras: " + medialibras);

        System.out.println("Exercicio 4: ");

    }
}
