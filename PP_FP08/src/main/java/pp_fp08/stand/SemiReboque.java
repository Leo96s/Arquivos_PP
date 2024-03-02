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
public class SemiReboque extends Trailer {
    
    private int spareTyreNumber; //numero de pneus sobressalentes
    
    public SemiReboque(int axesNumber, int load, int newspareTyreNumber){
        
        super(axesNumber, load);
        spareTyreNumber = newspareTyreNumber;
    }

    public int getSpareTyreNumber() {
        return spareTyreNumber;
    }

    public void setSpareTyreNumber(int spareTyreNumber) {
        this.spareTyreNumber = spareTyreNumber;
    }
    
    @Override
    public String toString(){
        
        String str = "";
        
        str += "Numero de eixos: "+ this.getAxesNumber() + "\n" + "Capacidade: " + this.getLoad() + "\n";
        str += "Numero de pneus sobressalentes: " + this.getSpareTyreNumber() + "\n";
        
        return str;
    }
    
}
