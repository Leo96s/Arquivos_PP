/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pp_fp01;

/**
 *
 * @author Leonardo
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        char[] arrayc = {'l', 'e', 'o', 'n', 'a', 'r', 'd'};
        
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println((array[2] + array[4]));
        System.out.print(arrayc[0]);
        System.out.print(arrayc[1]);
        System.out.print(arrayc[2]);
        System.out.print(arrayc[3]);
        System.out.print(arrayc[4]);
        System.out.print(arrayc[5]);
        System.out.println(arrayc[6]);      
        
        boolean canItakeHisMoney;
        int hisbalance = 5;
        long mybalance = 4;
        hisbalance -= 2 ;
        canItakeHisMoney = hisbalance > mybalance;
        canItakeHisMoney = canItakeHisMoney & (hisbalance >= 3);
        System.out.println(canItakeHisMoney);
        
        int v = 0;
        v++;
        int amount = v++;
        System.out.println(++v + " " + amount);
        System.out.println(v);
        
        long n = 0;
        System.out.println(n);
        n = 3;
        System.out.println(n);
        boolean a = false;
        System.out.println(a);
        int c = 3;
        double b = 1;
        System.out.println(c);
        System.out.println(b);
    }
    
}
