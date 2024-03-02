/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupoiii;

import grupoiii.enums.*;

/**
 *
 * @author Joaquim Matos
 */
public class Reservation {

    private String date;
    private Animal animal;
    private ServiceType serviceType;
    private boolean groupService;
    private ReservationState reservationState;

    public Reservation(String date, Animal animal, ServiceType serviceType, boolean groupService, ReservationState temp) {
        this.date = date;
        this.animal = animal;
        this.serviceType = serviceType;
        this.groupService = groupService;
        this.reservationState = temp;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public ReservationState getState() {
        return reservationState;
    }

    public void setServiceType(ReservationState reservationState) {
        this.reservationState = reservationState;
    }

    public boolean isGroupService() {
        return groupService;
    }

    public void setGroupService(boolean groupService) {
        this.groupService = groupService;
    }

    public ReservationState getReservationState() {
        return reservationState;
    }

    public void setReservationState(ReservationState reservationState) {
        this.reservationState = reservationState;
    }

    @Override
    public String toString() {
        return "Reservation{" + "date=" + date + ", serviceType=" + serviceType + ", groupService=" + groupService + ", reservationState=" + reservationState + ", animal=\n " + animal +'}';
    }
}