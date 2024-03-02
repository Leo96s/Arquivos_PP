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
public enum TipoContrato {
    PARCIAL, INTEGRAL;
    /**
     * Obter o tipo de contrato
     * @param contrato
     * @return
     */
    public static String tipocontratoToString(TipoContrato contrato){
        switch(contrato){
            case INTEGRAL:
                return "Contrato integral";
            default:
                return "Contrato parcial";
        }
    }
}
