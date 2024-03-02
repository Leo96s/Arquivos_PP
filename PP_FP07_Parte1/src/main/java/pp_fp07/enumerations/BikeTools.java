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
public enum BikeTools {
    GARRAFA_DE_AGUA, KIT_REPARACAO_PNEU, CONTA_QUILOMETROS, ALFORJE, SUPORTE_PARA_TELEMOVEL; 

    public static String biketoolsToString(BikeTools bikeTools){
        switch(bikeTools){
            default:
            return "Garrafa de agua";

            case KIT_REPARACAO_PNEU:
            return "Kit de reparacao de pneu";

            case CONTA_QUILOMETROS:
            return "Conta quilometro";

            case ALFORJE:
            return "Alforje";

            case SUPORTE_PARA_TELEMOVEL:           
            return "Suporte para telemovel";
        }
        }

    }

