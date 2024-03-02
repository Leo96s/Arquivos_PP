/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Music;

/**
 *
 * @author Leonardo
 */
public enum TypesEnumTrack {
    ByName, BySize, ByDuration;
    
    public static String typesenumtracktoString(TypesEnumTrack enumtrack){
        switch(enumtrack){
            case ByName:
                return "ByName";
            case BySize:
                return "BySize";
            case ByDuration:
                return "ByDuration";
            default:
                return "Enum Not Found";
        }
    }
}
