/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp07.enumerations;

/**
 *
 * @author Leonardo
 */
public enum Brakes_Type {
    PINCAS, HIDRAULICOS;

        public static String brakestypeToString(Brakes_Type brakes){
            switch(brakes){
                case HIDRAULICOS:
                    return "Travoes hidraulicos";
                default:
                    return "Travoes de pincas";
            }
        }
}
