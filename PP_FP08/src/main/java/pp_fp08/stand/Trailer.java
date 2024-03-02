/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp08.stand;

/**
 *
 * @author Leonardo
 */
public class Trailer {
    
    private int axesNumber = 2; // numero de eixos
    
    private int load; //capacidade
    
    public Trailer(int newaxesNumber, int newload){
        
        axesNumber = newaxesNumber;
        load = newload;
    }

    public Trailer(int load) {
        this.load = load;
    }

    public int getAxesNumber() {
        return axesNumber;
    }

    public void setAxesNumber(int axesNumber) {
        this.axesNumber = axesNumber;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }
    
    @Override
    public String toString(){
        
        String str = "";
        
        if(this instanceof SemiReboque){
        
        SemiReboque s = (SemiReboque) this;
        str += s.toString();
                
        }else if (this instanceof Reboque){
        
        Reboque r = (Reboque) this;
        str += r.toString();
                        
        }
        return str;
    }
}
