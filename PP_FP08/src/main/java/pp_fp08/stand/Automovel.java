/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp08.stand;
import Enumerations.Condition;
import Enumerations.Origin;

/**
 *
 * @author Leonardo
 */
public class Automovel extends Veiculo {
    
    private int occupantsNumber;
    
    private int doorsNumber = 3;
    
    public Automovel(int vin, String brand, String model, String manufacturingDate, Origin origin, int kms,
            Condition condition, int price, int newoccupantsNumber, int newdoorsNumber){
        
        super(vin, brand, model, manufacturingDate, origin, kms, condition, price);
        
        this.occupantsNumber = newoccupantsNumber;
        this.doorsNumber = newdoorsNumber;
        
        
    }
    
    public Automovel(int vin, String brand, String model, String manufacturingDate, Origin origin, int kms,
            Condition condition, int price, int newoccupantsNumber){
        
        super(vin, brand, model, manufacturingDate, origin, kms, condition, price);
        this.occupantsNumber = newoccupantsNumber;        
    }
    
    @Override
    public int getprice(){
        if(this.getcondition() != Condition.NEW){
            super.setprice((int) (super.getprice() * 0.7));
        }
        return super.getprice();
    }

    public int getOccupantsNumber() {
        return occupantsNumber;
    }

    public void setOccupantsNumber(int occupantsNumber) {
        this.occupantsNumber = occupantsNumber;
    }

    public int getDoorsNumber() {
        return doorsNumber;
    }

    public void setDoorsNumber(int doorsNumber) {
        this.doorsNumber = doorsNumber;
    }
    
    @Override
    public String toString(){
        

        String str = super.toString() + "\n" + "Numero de ocupantes: " + this.getOccupantsNumber()
                    + "\n" + "Numero de portas: " + this.getDoorsNumber();
        
        return str;
    }
    
}
