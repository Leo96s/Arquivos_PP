/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enumerations;

/**
 *
 * @author Leonardo
 */
public enum Tipologia {
    TRUCK, TIR;
    
    public static String tipologiaToString(Tipologia tipologia){
        switch(tipologia){
            case TIR:
                return "Tir";
                
            default:
                return "TRUCK";
        }
    }
    
}
