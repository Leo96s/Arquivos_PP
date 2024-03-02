/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp09.programming;
import Enumerations.TipContrato;
import Enumerations.HabilitacoesLiterarias;


/**
 *
 * @author Leonardo
 */
public class Administrative extends Person{
    
    private String initials;
    
    private TipContrato contractType;
    
    private HabilitacoesLiterarias habilit;
    
    private String beginContract;
    
    private String endContract;

    public Administrative(String initials, TipContrato contractType, HabilitacoesLiterarias habilit, String beginContract, String endContract, String name, String birthDate, String address, int citizenCard, int vatNumber, double baseSalary) {
        super(name, birthDate, address, citizenCard, vatNumber, baseSalary);
        this.initials = initials;
        this.contractType = contractType;
        this.habilit = habilit;
        this.beginContract = beginContract;
        this.endContract = endContract;
    }

    public Administrative(String initials, TipContrato contracType, HabilitacoesLiterarias habilit, String beginContract, String name, String birthDate, String address, int citizenCard, int vatNumber, double baseSalary) {
        super(name, birthDate, address, citizenCard, vatNumber, baseSalary);
        this.initials = initials;
        this.habilit = habilit;
        this.beginContract = beginContract;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public TipContrato getContractType() {
        return contractType;
    }

    public void setContractType(TipContrato contractType) {
        this.contractType = contractType;
    }

    public HabilitacoesLiterarias getHabilit() {
        return habilit;
    }

    public void setHabilit(HabilitacoesLiterarias habilit) {
        this.habilit = habilit;
    }

    public String getBeginContract() {
        return beginContract;
    }

    public void setBeginContract(String beginContract) {
        this.beginContract = beginContract;
    }

    public String getEndContract() {
        return endContract;
    }

    public void setEndContract(String endContract) {
        this.endContract = endContract;
    }
    

    @Override
    public double getSalary(){
        double salario = this.getBaseSalary();                
        switch(this.getHabilit()){
            
            case LICENCIATURA:
                salario = salario * 1.10;
                return salario;
            case MESTRADO:
                salario = salario * 1.20;
                return salario;
            case DOUTORAMENTO:
                salario = salario * 1.30;
                return salario;
            default:
                return salario;
        }       
    }

    @Override
    public String toString() {
        
        String str = "";
        
        str += super.toString() + "Sigla: " + this.getInitials() + "\n" + "Tipo de Contrato: " + this.getContractType() +
                "\n" + "Habilitacoes literarias: " + this.getHabilit() + "\n" + "Data de Contratacao: " + this.getBeginContract() +
                "\n";
        if(this.getEndContract() != null){
            str+= "Data de fim da contratacao: " + this.getEndContract() + "\n";
        }
        
        return str;       
    }        
}
