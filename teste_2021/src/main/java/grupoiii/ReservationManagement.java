/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupoiii;

import grupoiii.enums.ReservationState;

/**
 *
 * @author Joaquim Matos
 */
public class ReservationManagement {

    private Reservation[] reservation;
    private final int SIZE = 5;
    private int count;

    public ReservationManagement() {
        this.reservation = new Reservation[SIZE];
    }

    public void extendSize() {
        Reservation[] temp = new Reservation[this.count + 2];

        for (int i = 0; i < this.count; i++) {
            temp[i] = this.reservation[i];
        }

        this.reservation = temp;
    }

    public boolean isEqual(Reservation value) {
        for (Reservation temp : this.reservation) {
            if (temp != null && temp.equals(value)) {
                return true;
            }
        }
        return false;
    }

    public void addReservation(Reservation reservation) {
        if (this.count >= this.reservation.length) {
            this.extendSize();
        }

        if (!this.isEqual(reservation)) {
            this.reservation[count++] = reservation;
        }
    }

    public ReservationManagement(Reservation[] reservation) {
        this.reservation = reservation;
    }

    @Override
    public String toString() {
        String s = "ReservationManagement{";
        for (Reservation temp : this.reservation) {
            if (temp != null) {
                s += "\nreservation=" + temp;
            }
        }
        return s + '}';
    
    }

    public String getreservationsnotconclued() {
        String s = "ReservationManagement{";
        for (Reservation temp : this.reservation) {
            if (temp != null) {
                temp.getReservationState();
                if(temp.getReservationState() == ReservationState.CANCELLED){
                s += "\nreservation=" + temp;
            }
        }
    }
        return s + '}';
    
    }
}
