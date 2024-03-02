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
public enum Suspension_Type {
    SIMPLES, DUPLA, SEMSUSPENSAO;

        public static String suspensiontypeToString(Suspension_Type suspension){
            switch(suspension){

                case SIMPLES:
                    return "Suspensao simples";
                case DUPLA:
                    return "Suspensao dupla";
                default:
                    return "Sem suspensao";
                    
            }
        }
}
