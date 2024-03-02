/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package grupoiii.enums;

/**
 *
 * @author Joaquim Matos
 */
public enum ReservationState {
    ACTIVE, CANCELLED, REMARKED, CONCLUDED;

    public static ReservationState reservationtoString(ReservationState string){
        switch(string){
            case ACTIVE:
            System.out.println("Active");
            break;
            case CANCELLED:
            System.out.println("Cancelled");
            break;
            case REMARKED:
            System.out.println("Remarked");
            case CONCLUDED:
            System.out.println("Concluded");
            break;
        }
        return string;
    }
}
