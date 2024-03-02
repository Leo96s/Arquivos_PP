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
public enum Material_Type {
    ALUMINIO, CARBONO;

        public static String materialtypeToString(Material_Type material){
            switch(material){
                case CARBONO:
                    return "Feita de carbono";
                default:
                    return "Feita de aluminio";
            }
        }
}
