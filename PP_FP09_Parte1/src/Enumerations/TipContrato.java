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
public enum TipContrato {
    PARTIAL, INTEGRAL;
    
    public static String tipocontratotoString(TipContrato contrato){
        switch(contrato){
            case PARTIAL:
                return "Partial";
            case INTEGRAL:
                return "Integral";
            default:
                return "Value not found.";               
        }
    }
}
