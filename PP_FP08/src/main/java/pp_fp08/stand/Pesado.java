/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp08.stand;
import Enumerations.Condition;
import Enumerations.Origin;
import Enumerations.Tipologia;

/**
 *
 * @author Leonardo
 */
public class Pesado extends Veiculo {
    
    private int length;
    
    private int load;
    
    private Tipologia truckType;
    
    private Trailer trailer;
    
    public Pesado(int vin, String brand, String model, String manufacturingDate, Origin origin, int kms,
            Condition condition, int price, int newlength, int newload, Tipologia newtrucktype, Trailer newtrailer){
        
        super(vin, brand, model, manufacturingDate, origin, kms, condition, price);
        
        length = newlength;
        load = newload;
        truckType = newtrucktype;
        trailer = newtrailer;
    }
    
    public Pesado(int vin, String brand, String model, String manufacturingDate, Origin origin, int kms,
            Condition condition, int price, int newlength, int newload, Tipologia newtrucktype){
        
        super(vin, brand, model, manufacturingDate, origin, kms, condition, price);
        
        length = newlength;
        load = newload;
        truckType = newtrucktype;
        trailer = null;
    }
    
    @Override
    public int getprice(){
        if(this.getcondition() == Condition.NEW && this.trailer != null){
            super.setprice( (int) (super.getprice() * 0.95));
            return super.getprice();
        }else if (this.trailer == null && this.getcondition() == Condition.NEW){
                    return super.getprice();   
        
        }else{
            super.setprice( (int) (super.getprice() * 0.85));
            return super.getprice();
        }
    }
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    public Tipologia getTruckType() {
        return truckType;
    }

    public void setTruckType(Tipologia truckType) {
        this.truckType = truckType;
    }

    public Trailer getTrailer() {
        return this.trailer;
    }

    public void setTrailer(Trailer trailer) {
        this.trailer = trailer;
    }
    
    @Override
    public String toString(){
        
        String str = 
                
                super.toString() + "\n" + "Cumprimento: " + this.getLength() +
                "\n" + "Carga util: " + this.getLoad() + "\n" + "Tipologia: " + this.getTruckType() +
                "\n";
        
        if(this.trailer != null){
            str += "Trailer: " + "\n" + this.trailer.toString();
        }
        
        return str;
    }
        
}
