/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp08.stand;

import Enumerations.Condition;
import Enumerations.Origin;
import Enumerations.Tipologia;
import Enumerations.TrailerType;

/**
 *
 * @author Leonardo
 */
public class VehicleDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Automovel carro = new Automovel(1, "asas", "model", "adasd", Origin.NATIONAL, 23, Condition.USED, 123, 4, 5);
        
        Motociclo mota = new Motociclo(2, "Yamaha", "RTX", "23-04-1997", Origin.IMPORTED, 0, Condition.NEW, 4500, 23, 6);
        
        SemiReboque sreboque = new SemiReboque(2, 1000, 2);
        
        Reboque reboque = new Reboque(2, 1500, TrailerType.CLOSED);
        
        Trailer trailer1 = (Trailer)sreboque;
        Trailer trailer2 = (Trailer)reboque;
              
        Pesado camiao = new Pesado(4, "Mercedes", "AZ", "26-06-2000", Origin.NATIONAL, 22000, Condition.USED, 17000, 24, 34, 
                Tipologia.TRUCK, trailer1);

        Pesado camiao2 = new Pesado(1, "Mercedes", "AZ", "26-06-2002", Origin.NATIONAL, 0, Condition.NEW, 20000, 24, 34, 
                Tipologia.TIR, trailer2);

        Pesado camiao3 = new Pesado(6, "Mercedes", "AZ", "26-06-2001", Origin.NATIONAL, 220, Condition.USED, 18000, 24, 34, 
                Tipologia.TRUCK);
        
        Pesado camiao4 = new Pesado(3, "Mercedes", "AZ", "26-06-2000", Origin.NATIONAL, 22000, Condition.USED, 17000, 24, 34, 
                Tipologia.TRUCK, trailer1);
        

        VehicleManagement veiculos = new VehicleManagement();

        veiculos.addVehicle(camiao);
        veiculos.addVehicle(camiao4);
        veiculos.addVehicle(camiao2);
        veiculos.addVehicle(camiao3);
        veiculos.addVehicle(carro);
        veiculos.addVehicle(mota);
        System.out.println(veiculos.toString());
        System.out.print(veiculos.typeCounter());
    }   
    
}
