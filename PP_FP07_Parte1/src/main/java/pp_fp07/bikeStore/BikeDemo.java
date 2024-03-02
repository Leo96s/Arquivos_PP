/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp07.bikeStore;

import pp_fp07.enumerations.BikeTools;
import pp_fp07.enumerations.Brakes_Type;
import pp_fp07.enumerations.Material_Type;
import pp_fp07.enumerations.Suspension_Type;

/**
 *
 * @author Leonardo
 */
public class BikeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Bicycle mbike = new MountainBike(6, "Vermelho", 5, Brakes_Type.HIDRAULICOS, Material_Type.CARBONO,
        500, 2, 2, Suspension_Type.SIMPLES);

        MountainBike mybike = (MountainBike)mbike;

        BikeTools[] toolsArray = {BikeTools.ALFORJE, BikeTools.CONTA_QUILOMETROS};
        mybike.setbiketools(toolsArray); 

        Bicycle mbike1 = new MountainBike(5, "Verde", 6, Brakes_Type.HIDRAULICOS, Material_Type.CARBONO,
        500, 2, 2, Suspension_Type.SIMPLES);

        MountainBike mybike1 = (MountainBike)mbike1;

        BikeTools[] toolsArray1 = {BikeTools.ALFORJE, BikeTools.GARRAFA_DE_AGUA};
        mybike1.setbiketools(toolsArray1); 

        Bicycle rbike = new RoadBike(6, "Amarela", 5, Brakes_Type.PINCAS, Material_Type.CARBONO, 650, 
        2, "5x5", "Ate anda sozinha");

        RoadBike mybike2 = (RoadBike)rbike;

        Bicycle rbike1 = new RoadBike(6, "Azul", 5, Brakes_Type.PINCAS, Material_Type.CARBONO, 700, 
        1, "3x3", "Bicicleta perfeita, nao existe melhor, se existe esta enganado");

        RoadBike mybike3 = (RoadBike)rbike1;

         /**Object[] bikeArgs = {mbike.getnumberOfGears(), mbike.getmainColor(), mbike.getwheelSize(), 
                                                    mbike.getbrakes(), mbike.getmaterial(), mbike.getprice(), mbike.getwheelSize(), 
                                                    mbike.getnumbroflights(), mbike.getsuspension()};
        for(Object _mbike: bikeArgs){
            System.out.println(_mbike);
        }
        */
        
        RoadBike[] biker = {mybike2, mybike3};
        MountainBike[] bikem = {mybike, mybike1};
        
    System.out.println("Moutain Bike: ");
        for(MountainBike _bikem: bikem){
            System.out.println("id: " + _bikem.getId());
            System.out.println("NumberofGears: " + _bikem.getnumberOfGears());
            System.out.println("MainColor: " + _bikem.getmainColor());
            System.out.println("WheelSize: " + _bikem.getwheelSize());
            System.out.println("Brakes: " + _bikem.getbrakes());
            System.out.println("Material: " + _bikem.getmaterial());
            System.out.println("Price: " + _bikem.getprice());
            System.out.println("Guarantee: " + _bikem.getguarantee() + " " + "anos");

            for(BikeTools _biketoo: _bikem.getbiketools()){
                System.out.println("Tools: " + BikeTools.biketoolsToString(_biketoo));
            }
        }
    System.out.println("RoadBike: ");
        for(RoadBike _biker: biker){
            System.out.println("id: " + _biker.getId());
            System.out.println("NumberofGears: " + _biker.getnumberOfGears());
            System.out.println("MainColor: " + _biker.getmainColor());
            System.out.println("WheelSize: " + _biker.getwheelSize());
            System.out.println("Brakes: " + _biker.getbrakes());
            System.out.println("Material: " + _biker.getmaterial());
            System.out.println("Price: " + _biker.getprice());
            System.out.println("Guarantee: " + _biker.getguarantee() + " " + "anos");
            System.out.println("Obeservations: " + _biker.getobservations());
            }

            BicycleManagement manager = new BicycleManagement();
            manager.addMountainBike(mybike);
            manager.addMountainBike(mybike1);
            manager.addRoadBike(mybike2);
            manager.addRoadBike(mybike3);

            System.out.println("---------------------");
            manager.list();
            System.out.println("---------------------");


            System.out.println("Apenas MoutainBike:");
            manager.listMountainBike();

           
        }
    }
    
    

