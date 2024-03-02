/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp07.bikeStore;

import pp_fp07.enumerations.BikeTools;
import pp_fp07.enumerations.Brakes_Type;
import pp_fp07.enumerations.Material_Type;

/**
 *
 * @author Leonardo
 */
public class Bicycle {
    /**
     * Proximo id
     */
    private static int nextid = 0;

    /**
     * Id da bicicleta
     */
    private int id;

    /**
     * Numero de velocidades
     */
    private int numberofGears;

    /**
     * Principal cor da bicicleta
     */
    private String mainColor;

    /**
     * Diametro da roda
     */
    private int wheelSize;

    /**
     * Tipo de travoes da bicicleta
     */
    private Brakes_Type brakes;

    /**
     * Material de que é feita a bicicleta
     */
    private Material_Type material;

    /**
     * Preço da bicicleta
     */
    private float price;

    /**
     * Anos de garantia
     */
    private int guarantee;

    public Bicycle(int newnumberofGears, String newmainColor, int newwheelSize, Brakes_Type newbrakes, Material_Type newmaterial, 
                    float newprice, int newguarantee){

                        id = nextid++;
                        numberofGears = newnumberofGears;
                        mainColor = newmainColor;
                        wheelSize = newwheelSize;
                        brakes = newbrakes;
                        material = newmaterial;
                        price = newprice;
                        guarantee = newguarantee;
                        
    }

                    public void setnumberOfGears(int numberofGears){
                        this.numberofGears = numberofGears;
                    }
                    public void setmainColor(String mainColor){
                        this.mainColor = mainColor;
                    }
                    public void setwheelSize(int wheelSize){
                        this.wheelSize = wheelSize;
                    }
                    public void setbrakes(Brakes_Type brakes){
                        this.brakes = brakes;
                    }
                    public void setmaterial(Material_Type material){
                        this.material = material;
                    }
                    public void setprice(float price){
                        this.price = price;
                    }
                    public void setguarantee(int guarantee){
                        this.guarantee = guarantee;
                    }

                    public int getId(){
                        return this.id;
                    }
                    public int getnumberOfGears(){
                        return this.numberofGears;
                    }
                    public String getmainColor(){
                        return this.mainColor;
                    }
                    public int getwheelSize(){
                        return this.wheelSize;
                    }
                    public Brakes_Type getbrakes(){
                        return this.brakes;
                    }
                    public Material_Type getmaterial(){
                        return this.material;
                    }
                    public float getprice(){
                        return this.price;
                    }
                    public int getguarantee(){
                        return this.guarantee;
                    }

}
