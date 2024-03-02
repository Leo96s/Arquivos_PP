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
public enum Origin {
    NATIONAL, IMPORTED;
    
    public static String originToString(Origin origin){
        switch(origin){
            case IMPORTED:
                return "Importado";
                
            default:
                return "Nacional";                
        }
    }
}
