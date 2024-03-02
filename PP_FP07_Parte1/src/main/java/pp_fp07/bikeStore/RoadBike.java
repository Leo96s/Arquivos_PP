/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp07.bikeStore;
import pp_fp07.enumerations.Brakes_Type;
import pp_fp07.enumerations.Material_Type;

/**
 *
 * @author Leonardo
 */
public class RoadBike extends Bicycle {

    /**
     * Proxima identificacao
     */
    private static int nexthandlebelt = 0;
    /**
     * Identificacao das fitas no guiador
     */
    private int handlebelt;

    /**
     * Tamanho do quadrado
     */
    private String frameSize;

    /**
     * Limite de caracteres para observations
     */
    private final int LIMITE_TEXT = 50;

    /**
     * Conjunto de observacoes
     */
    private String observations;

    public RoadBike(int numberOfGears, String mainColor, int wheelSize, Brakes_Type brakes, Material_Type material, 
                    float price, int guarantee, String newframeSize, String newobservations){

        super(numberOfGears, mainColor, wheelSize, brakes, material, price, guarantee);
        handlebelt = nexthandlebelt++;
        frameSize = newframeSize;
        
        String limitedString = newobservations.substring(0, Math.min(newobservations.length(), LIMITE_TEXT));
        observations = limitedString;
    }

    public void setframeSize(String frameSize){
        this.frameSize = frameSize;
    }
    public void setobservations(String observations){
        this.observations = observations;
    }
    public int gethandlebelt(){
        return this.handlebelt;
    }
    public String getframeSize(){
        return this.frameSize;
    }
    public String getobservations(){
        return this.observations;
    }
}
