/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp08.stand;
import Enumerations.Origin;
import Enumerations.Condition;

/**
 *
 * @author Leonardo
 */
public class Veiculo {
    
    private static int nextid = 0;
    
    private int id;
    
    private int vin; // numero chassis
    
    private String brand; // marca
    
    private String model; // modelo
    
    private String manufacturingDate; //data de fabrico
    
    private Origin origin;
    
    private int kms; // numero de kilometros
    
    private Condition condition;
    
    private int price; //preco do carro
    
    
    public Veiculo(int newvin, String newbrand, String newmodel, String newmanufacturingDate, Origin neworigin, int newkms,
            Condition newcondition, int newprice){
        
        this.id = nextid++;
        this.vin = newvin;
        this.brand = newbrand;
        this.model = newmodel;
        this.manufacturingDate = newmanufacturingDate;
        this.origin = neworigin;
        this.kms = newkms;
        condition = newcondition;
        price = newprice;
    }
    
    public void setvin(int vin){
        this.vin = vin;
    }
    
    public void setbrand(String brand){
        this.brand = brand;
    }
    
    public void setmodel(String model){
        this.model = model;
    }
    
    public void setmanufacturingDate(String manufacturingDate){
        this.manufacturingDate = manufacturingDate;
    }
    
    public void setorigin(Origin origin){
        this.origin = origin;
    }
    
    public void setkms(int kms){
        this.kms = kms;
    }
    
    public void setcondition(Condition condition){
        this.condition = condition;
    }
    
    public void setprice(int price){
        this.price = price;
    }
    
    public int getvin(){
        return this.vin;
    }
    
    public String getbrand(){
        return this.brand;
    }
    
    public String getmodel(){
        return this.model;
    }
    
    public String getmanufacturingDate(){
        return this.manufacturingDate;
    }
    
    public Origin getorigin(){
        return this.origin;
    }
    
    public int getkms(){
        return this.kms;
    }
    
    public Condition getcondition(){
        return this.condition;
    }
    
    public int getprice(){
        return this.price;
    }
    
    public int getid(){
        return this.id;
    }
    

    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(!(obj instanceof Veiculo)){
            return false;
        }
        Veiculo temp = (Veiculo) obj;
        
        if(this.vin == temp.vin){
            return false;
        }
        /**
        if(!this.brand.equals(temp.brand)){
            return false;
        }
        if(!this.model.equals(temp.model)){
            return false;
        }
        if(!this.manufacturingDate.equals(temp.manufacturingDate)){
            return false;
        }
        if(!this.origin.equals(temp.origin)){
            return false;
        }
        if(this.kms != temp.kms){
            return false;
        }
        if(!this.condition.equals(temp.condition)){
            return false;
        }
        if(this.price != temp.price){
            return false;
        }
        if(this instanceof Automovel){
            Automovel auto = (Automovel) this;
            Automovel tempAuto = (Automovel) temp;
            if(auto.getOccupantsNumber() != tempAuto.getOccupantsNumber()){
                return false;
            }
            if(auto.getDoorsNumber() != tempAuto.getDoorsNumber()){
                return false;
            }
        }
        else if(this instanceof Motociclo){
            Motociclo moto = (Motociclo) this;
            Motociclo tempMoto = (Motociclo) temp;
            if(moto.getCubicCapacity() != tempMoto.getCubicCapacity()){
                return false;
            }
            if(moto.getWheelSize() != tempMoto.getWheelSize()){
                return false;
            }
        }
        else if(this instanceof Pesado){
            Pesado pesado = (Pesado) this;
            Pesado tempPesado = (Pesado) temp;
            if(pesado.getLength() != tempPesado.getLength()){
                return false;
            }
            if(pesado.getLoad() != tempPesado.getLoad()){
                return false;
            }
            if(!pesado.getTruckType().equals(tempPesado.getTruckType())){
                return false;
            }
            if(pesado.getTrailer() != null && tempPesado.getTrailer() != null){
                if(pesado.getTrailer().getAxesNumber() != tempPesado.getTrailer().getAxesNumber()){
                    return false;
                }
                if(pesado.getTrailer().getLoad() != tempPesado.getTrailer().getLoad()){
                    return false;
                }
                if(pesado.getTrailer() instanceof Reboque && tempPesado.getTrailer() instanceof Reboque){
                    Reboque reboque = (Reboque) pesado.getTrailer();
                    Reboque tempReboque = (Reboque) tempPesado.getTrailer();
                    if(!reboque.getTrailertype().equals(tempReboque.getTrailertype())){
                        return false;
                    }
                }else if(pesado.getTrailer() instanceof SemiReboque && tempPesado.getTrailer() instanceof SemiReboque){
                    SemiReboque semiReboque = (SemiReboque) pesado.getTrailer();
                    SemiReboque tempsemiReboque = (SemiReboque) tempPesado.getTrailer();
                    if(semiReboque.getSpareTyreNumber() == tempsemiReboque.getSpareTyreNumber()){
                        return false;
                    }
                }
        
            }
        }
        */
        return true;
    }
    
    
    @Override
    public String toString(){
        
        String str = "id: " + this.getid() + "\n" +
                 "Numero de chassis: " + this.getvin() + "\n" +
                 "Marca do veiculo: " + this.getbrand() + "\n" +
                 "Modelo do veiculo: " + this.getmodel() + "\n" +
                 "Data de fabrico: " + this.getmanufacturingDate() + "\n" +
                 "Origem: " + Origin.originToString(this.getorigin()) + "\n" +
                 "kms: " + this.getkms() + "\n" +
                 "Condicao do veiculo: " + Condition.conditionToString(this.getcondition()) + "\n" +
                 "Preco: " + this.getprice();             
                 
                 
                 return str;
                
    }

}
