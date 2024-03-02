/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.pizza_restaurant.enums;

/**
 *
 * @author Leonardo
 */
public enum Origem {
    ANIMAL, VEGETAL, MINERAL;
    
    public static String origemToString(Origem origem){
        switch(origem){
            case VEGETAL:
                return "Origem Vegetal";
            case MINERAL:
                return "Origem Mineral";
            default:
                return "Origem Animal";
        }
    }
}
