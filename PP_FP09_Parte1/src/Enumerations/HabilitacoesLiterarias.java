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
public enum HabilitacoesLiterarias {
    LICENCIATURA, MESTRADO, DOUTORAMENTO;
    
    public static String habilitacoesliterariastoString(HabilitacoesLiterarias habilitacoes){
        switch(habilitacoes){
            case LICENCIATURA:
                return "Licenciatura";
            case MESTRADO:
                return "Mestrado";
            case DOUTORAMENTO:
                return "Doutoramento";
            default:
                return "Value not found.";
        }
    }
}
