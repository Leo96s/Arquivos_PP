/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp09.programming;

import Enumerations.ProgrammerType;

/**
 *
 * @author Leonardo
 */
public class JavaProgrammer extends Person {
    
    private int code;
    
    private int programmingYears;
    
    private String projectName;
    
    private ProgrammerType programmertype;

    public JavaProgrammer(int code, int programmingYears, String projectName, ProgrammerType programmertype, 
            String name, String birthDate, String address, int citizenCard, int vatNumber, double baseSalary) {
        
        super(name, birthDate, address, citizenCard, vatNumber, baseSalary);
        this.code = code;
        this.programmingYears = programmingYears;
        this.projectName = projectName;
        this.programmertype = programmertype;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getProgrammingYears() {
        return programmingYears;
    }

    public void setProgrammingYears(int programmingYears) {
        this.programmingYears = programmingYears;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public ProgrammerType getProgrammertype() {
        return programmertype;
    }

    public void setProgrammertype(ProgrammerType programmertype) {
        this.programmertype = programmertype;
    }
    
    @Override
    public double getSalary(){
        double salario = this.getBaseSalary() * 1.05;
        
        switch(this.getProgrammertype()){
            
            case JUNIOR:               
                salario += this.getBaseSalary() * 1.05;
                return salario;
            case SENIOR:
                salario += this.getBaseSalary() * 1.15;  
                return salario;
                     
        }
        double bonussalario = 0.5 * this.getProgrammingYears();
            salario += bonussalario;
            
            return salario;
    }
    
    @Override
    public String toString() {
        
        String str = "";
        
        str += super.toString() + "Codigo: " + this.getCode() + "\n" + "Numero de anos de programacao: " + this.getProgrammingYears() +
                "\n" + "Nome do projeto: " + this.getProjectName() + "\n" + "Tipo de programador: " + this.getProgrammertype() +
                "\n";
        
        return str;       
    } 
}
