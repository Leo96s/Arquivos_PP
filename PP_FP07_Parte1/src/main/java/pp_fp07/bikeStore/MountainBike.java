/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp07.bikeStore;

import pp_fp07.enumerations.BikeTools;
import pp_fp07.enumerations.Suspension_Type;
import pp_fp07.enumerations.Brakes_Type;
import pp_fp07.enumerations.Material_Type;

/**
 *
 * @author Leonardo
 */
public class MountainBike extends Bicycle {
    
    /**
     * Numero de luzes
     */
    private int numberofLights;

    /**
     * Tipo de suspensao
     */
    private Suspension_Type suspension;

    /**
     * Conjunto maximo de utensilios
     */
    private final int MAX_BIKE_TOOLS = 5;
    /**
     * Conjunto de utensilios
     */
    private BikeTools[] bikeTools;

    public MountainBike (int numberOfGears, String mainColor, int wheelSize, Brakes_Type brakes, Material_Type material, 
                        float price, int guarantee, int newnumberOfLights, Suspension_Type newsuspension){

        super(numberOfGears, mainColor, wheelSize, brakes, material, price, guarantee);
        numberofLights = newnumberOfLights;
        suspension = newsuspension;
        bikeTools = new BikeTools[MAX_BIKE_TOOLS];

    }

    public void setnumberoflights(int numberofLights){
        this.numberofLights = numberofLights;
    }
    public void setsuspension(Suspension_Type suspension){
        this.suspension = suspension;
    }
    public void setbiketools(BikeTools[] bikeTools){
        this.bikeTools = bikeTools;
    }

    public int getnumbroflights(){
        return this.numberofLights;
    }
    public Suspension_Type getsuspension(){
        return this.suspension;
    }
    public BikeTools[] getbiketools(){
        return this.bikeTools;
    }

}
