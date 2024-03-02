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
public enum TrailerType {
    TIPPER, OPEN, CLOSED, FRIDGE;
    
    public static String trailertypeToString(TrailerType trailertype){
        switch(trailertype){
            case TIPPER:
                return "basculante";
            case CLOSED:
                return "closed";
            case FRIDGE:
                return "fridged";
            default:
                return "open";
        }
    }
}
