/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp09.programming;

/**
 *
 * @author Leonardo
 */
abstract class Person {
    
    private String name;
    
    private String birthDate;
    
    private String address;
    
    private int citizenCard;
    
    private int vatNumber;
    
    private double baseSalary;

    public Person(String name, String birthDate, String address, int citizenCard, int vatNumber, double baseSalary) {
        this.name = name;
        this.birthDate = birthDate;
        this.address = address;
        this.citizenCard = citizenCard;
        this.vatNumber = vatNumber;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCitizenCard() {
        return citizenCard;
    }

    public void setCitizenCard(int citizenCard) {
        this.citizenCard = citizenCard;
    }

    public int getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(int vatNumber) {
        this.vatNumber = vatNumber;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    abstract double getSalary();
    
    @Override
    public String toString(){
        
        String str = "";
        
        str+= "Nome: " + this.getName() + "\n" + "Data de Nascimento: " + this.getBirthDate()
                + "\n" + "Morada: " + this.getAddress() + "\n" + "Numero de cartao de cidadao: " + 
                this.getCitizenCard() + "\n" + "NIF: " + this.getVatNumber() + "\n" + "Salario base: "
                + this.getBaseSalary() + "\n" + "Salario: " + this.getSalary() + "\n";
        
        return str;
    }
}
