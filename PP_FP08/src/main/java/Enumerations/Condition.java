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
public enum Condition {
    NEW, USED;
    
    public static String conditionToString(Condition condition){
        switch(condition){
            case NEW:
                return "Novo em folha";
                
            default:
                return "Usado";
        }
    }
}
