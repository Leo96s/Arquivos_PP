/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pp_fp03;


/**
 *
 * @author Leonardo
 */
public class pp_fp03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Exercicio 1:");
        int[][] matriz = new int[3][3];

        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;
        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;
        System.out.println("Matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.print("\n");
        }

        System.out.println("Matriz Transposta: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[j][i] + "\t");
            }
            System.out.print("\n");
        }
        System.out.println("Exercicio 2: ");
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        System.out.print("Numeros primos: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 2 || array[i] == 3) {
                System.out.print(array[i] + ",");
            } else if (array[i] > 3 && array[i] % 2 != 0 && array[i] % 3 != 0) {
                System.out.print(array[i] + ",");
            }
        }
        System.out.print("\n");
        System.out.println("Exercicio 3: ");
        int[][] matriza = new int [4][3];
        int nrepetido = 0, nmaior = 0, nmenor = 0, k = 0;
        
        matriza[0][0] = 1;
        matriza[0][1] = 2;
        matriza[0][2] = 3;
        matriza[1][0] = 4;
        matriza[1][1] = 5;
        matriza[1][2] = 6;
        matriza[2][0] = 7;
        matriza[2][1] = 8;
        matriza[2][2] = 9;
        matriza[3][0] = 1;
        matriza[3][1] = 4;
        matriza[3][2] = 1;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriza[i][j] + "\t");
            }
            System.out.print("\n");
        }
        for(int i = 0; i < 4; i++){
            nmaior = 0;
            nmenor = 10;
            for (int j = 0; j < 3; j++) {                       
               if(matriza[i][j] > nmaior){
                   nmaior = matriza[i][j];
            }
               if(matriza[i][j] < nmenor){
                   nmenor = matriza[i][j];
               }
        }
            System.out.println("Linha: " + k++);
            System.out.println("Maior numero da linha: " + nmaior);
            System.out.println("Menor numero da linha: " + nmenor);
        }
        
    }
}