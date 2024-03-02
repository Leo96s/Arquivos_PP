/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp08.stand;
import Enumerations.TrailerType;

/**
 *
 * @author Leonardo
 */
public class Reboque extends Trailer {
    
    private TrailerType trailertype;
    
    public Reboque(int axesNumber, int load, TrailerType newtrailerType){
        
        super(axesNumber, load);
        
        trailertype = newtrailerType;
        
    }

    public TrailerType getTrailertype() {
        return trailertype;
    }

    public void setTrailertype(TrailerType trailertype) {
        this.trailertype = trailertype;
    }
    
    @Override
    public String toString(){
        
        String str = "";
        
        str += "Numero de eixos: "+ this.getAxesNumber() + "\n" + "Capacidade: " + this.getLoad() + "\n";
        str += "Tipo de Trailer: " + this.getTrailertype();
        
        return str;
    }
    
}
