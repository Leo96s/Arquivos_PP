/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupoiii;

import java.util.Arrays;

/**
 *
 * @author Joaquim Matos
 */
public abstract  class Animal {

    private String name;
    private String birthdate;
    private boolean vacination;
    private double[] weight;
    private static int SIZE = 5;

    protected Animal(String name, String birthdate, boolean vacination) {
        this.name = name;
        this.birthdate = birthdate;
        this.vacination = vacination;
        this.weight = new double[SIZE];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public boolean isVacination() {
        return vacination;
    }

    public void setVacination(boolean vacination) {
        this.vacination = vacination;
    }

    public double[] getWeight() {
        return weight;
    }

    public void setWeight(double[] weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", birthdate=" + birthdate + ", vacination=" + vacination + 
        ", weight=" + Arrays.toString(weight) + '}';
    }
}
