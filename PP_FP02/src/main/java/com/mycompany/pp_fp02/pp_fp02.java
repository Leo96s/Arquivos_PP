/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pp_fp02;
import java.util.Arrays;

/**
 *
 * @author Leonardo
 */
public class pp_fp02 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Exercicio 1:");
        char[] frase = {'e', 'u', ' ', 's', 'o', 'u', ' ', 'a', 'l', 'u', 'n', 'o', 
            ' ','d', 'a', ' ', 'E', 'S', 'T', 'G', '.', '\n'};
        
        for(int i = 0; i < frase.length; i++){
            System.out.print(frase[i]);
        }
        
        System.out.println("Exercicio 2:");
        //Declaracao de variaveis
        int[] array = {11, 7, 333, -20, -23, 63, -22, 501, 10000};
        int soma = 0;
        float media = 0;
        
        //procedimento
        System.out.println("Soma dos valores da matriz:");
        for(int i = 0; i < array.length; i++){           
            soma += array[i];
        }
        System.out.println(soma);
        System.out.println("Media dos valores da matriz:");
        media = soma / array.length;
        System.out.println(media);
        
        System.out.println("Exercicio 3:");
        int [] lista = {12, 5, -21, 10, -325, 22, 50, -125, 80, -1};
        int somapositivos = 1, contarnegativos = 0, maiornumero = 0;
        
        for(int i = 0; i < lista.length; i++){
            if(lista[i] > 0){
                somapositivos *= lista[i];
            }else {
                contarnegativos++;
            }
            if(maiornumero < lista[i]){
                maiornumero = lista[i];
            }
        }

        System.out.println("Soma de numeros positivos:");
        System.out.println(somapositivos);
        System.out.println("Contagem de numeros negativos:");
        System.out.println(contarnegativos);
        System.out.println("Maior numero:");
        System.out.println(maiornumero);
        
        System.out.println("Exercicio 4:");
        
        char[] nome = {'A', 'n', 'a', ' ', 'S', 'a', 'n', 't', 'o', 's', '\n'};
        char[] apelido;
        char[] nome_;
        int flag = 0, vogais = 0, consoantes = 0;
        nome_ = new char [3];
        apelido = new char [nome.length];
        
        for(int i = 0; i < nome.length; i++){
            
            if(nome[i] == ' '){
                flag = 1;
            }
            if(nome[i] == 'A' || nome[i] == 'a' || nome[i] == 'o'){
                vogais++;
            }else{
                if(nome[i] != ' ' && nome[i] != '\n'){
                    consoantes++;
                }
            }
           if(flag == 0){
               nome_[i] = nome[i];
           }else {
               if(nome[i] == '\n'){
                   break;
               }
               apelido[i] = nome[i];               
           }
        }
        System.out.print("Nome no formato certo: ");
            System.out.print(apelido);  
            System.out.print(","); 
            System.out.println(nome_); 
            System.out.println("Numero de vogais: " + vogais);
            System.out.println("Numero de consoantes: " + consoantes);

        System.out.println("Exercicio 5: ");
        
        System.out.println("Exercicio 6: ");
        int[] listaA = {2, -5, -121, 102, -35, -2, 0, -125, 802, -10};
        int[] listaB = {6, 99, -1, 12, 1, -2};
        int[] listaC;
        int[] listaD;
        int[] listaE;
        int cont = 0, repetidos = 0, valid = 0;

        listaC = new int [listaA.length + listaB.length];
        for(int i = 0; i < listaA.length; i++){
            listaC[i] = listaA[i];
            cont++;
        }
        for(int i = 0; i < listaB.length; i++){
            listaC[cont] = listaB[i];
            cont++;
        }
        
        System.out.println("Imprimir uniao de listas: " + Arrays.toString(listaC) + ";");
        
        for(int i = 0; i < listaC.length - 1; i++){
            for(int j = i + 1; j < listaC.length; j++){
                if(listaC[i] == listaC[j]){
                    repetidos++;
                }
            }
        }
        System.out.println("Quantidade de numeros repeditos: " + repetidos);
        
        listaD = new int [listaA.length];
        
        for(int i = 0; i < listaA.length; i++){
            valid = 0;
            for(int j = 0; j < listaB.length; j++){
                if(listaA[i] == listaB[j]){
                    valid = 1;
            }
        }
            if(valid == 0){
                listaD[i] = listaA[i];
            }
        }
        System.out.println("Novo array: " + Arrays.toString(listaD) + ";");
        
        listaE = new int [listaB.length];
        
        for(int i = 0; i < listaA.length; i++){
            valid = 0;
            for(int j = 0; j < listaB.length; j++){
                if(listaA[i] == listaB[j]){
                    valid = 1;
            }
        }
            if(valid == 1){
                listaE[i] = listaA[i];
            }
        }
        System.out.println("Novo array: " + Arrays.toString(listaE) + ";"); 
    }  
}
