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
public class Motociclo extends Veiculo {
    
    private int cubicCapacity;
    
    private int wheelSize;
    
    public Motociclo(int vin, String brand, String model, String manufacturingDate, Origin origin, int kms,
            Condition condition, int price, int newcubicCapacity, int newwheelSize){
        
        super(vin, brand, model, manufacturingDate, origin, kms, condition, price);
        
        cubicCapacity = newcubicCapacity;
        wheelSize = newwheelSize;
    }

    public int getCubicCapacity() {
        return cubicCapacity;
    }

    public void setCubicCapacity(int cubicCapacity) {
        this.cubicCapacity = cubicCapacity;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }
    
    @Override
    public String toString(){
        
        String str = super.toString() + "\n" + "Cilindrada: " + this.getCubicCapacity() +
                "\n" + "Diametro das rodas: " + this.getWheelSize();
        
        return str;
    }
}
