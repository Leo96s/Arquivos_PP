/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grupoiii;

import grupoiii.enums.*;

/**
 *
 * @author Joaquim Matos
 */
public class DEmo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double[] heheh = {2, 3, 4, 5};
        Dog d1 = new Dog(SizeType.LARGE, "helo", "2-2-2", true);
        d1.setWeight(heheh);

        Cat c1 = new Cat(CatType.HOMEBOY, "hhehe", "", false);
        c1.setWeight(heheh);
        

        Reservation r1 = new Reservation("2-2-2", c1, ServiceType.PAPARAZZI, false, ReservationState.ACTIVE);
        Reservation r2 = new Reservation("2-2-3", d1, ServiceType.BATH, true, ReservationState.CANCELLED);

        ReservationManagement rm = new ReservationManagement();

        rm.addReservation(r1);
        rm.addReservation(r2);
        
        System.out.println(rm.getreservationsnotconclued());
    }
}
