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
public enum ProgrammerType {
    JUNIOR, SENIOR;
    
    public static String programmertypetoString(ProgrammerType programmertype){
        switch(programmertype){
            case JUNIOR:
                return "Junior";
            case SENIOR:
                return "Senior";
            default:
                return "Value not found.";
        }
    }
}
