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
public class ProjectManager extends Person {
    
    private int code;
    
    private String[] projects;
            
    private String contractDate;
    
    private int contractyears;

    public ProjectManager(int code, String[] projects, String contractDate, int contractyears, String name, String birthDate, String address, int citizenCard, int vatNumber, double baseSalary) {
        super(name, birthDate, address, citizenCard, vatNumber, baseSalary);
        this.code = code;
        this.projects = projects;
        this.contractDate = contractDate;
        this.contractyears = contractyears;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String[] getProjects() {
        return projects;
    }

    public void setProjects(String[] projects) {
        this.projects = projects;
    }

    public String getContractDate() {
        return contractDate;
    }

    public void setContractDate(String contractDate) {
        this.contractDate = contractDate;
    }

    public int getContractyears() {
        return contractyears;
    }

    public void setContractyears(int contractyears) {
        this.contractyears = contractyears;
    }
    
    @Override
    public double getSalary(){
        double salario = this.getBaseSalary() + (1.15 * this.getBaseSalary());
                
        double bonusyear = this.getContractyears() + (0.015 * this.getContractyears());
        double bonusproject = this.getProjects().length + (0.01 * this.getProjects().length);
            salario += bonusyear + bonusproject;
            
            return salario;
    }
    
    @Override
    public String toString() {
        
        String str = "";
        
        str += super.toString() + "Codigo: " + this.getCode() + "\n" +
                "\n" + "Data de Contratacao: " + this.getContractDate() +
                "\n" + "Conjunto de projetos: ";
        for(String _conjproj: this.getProjects()){
            
            str+= _conjproj;
            str+= ", ";
        }
        return str;       
    } 
    
    
}
