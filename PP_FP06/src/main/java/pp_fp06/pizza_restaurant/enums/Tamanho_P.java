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
public enum Tamanho_P {
    SMALL, MEDIUM, BIG;
    
    public static String pizzaToString(Tamanho_P tamanho){
        switch(tamanho){
            case SMALL:
                return "A pizza é pequena";
            case BIG:
                return "A pizza é grande";
            default:
                return "A pizza é média";
        }
    }
    
    
}
