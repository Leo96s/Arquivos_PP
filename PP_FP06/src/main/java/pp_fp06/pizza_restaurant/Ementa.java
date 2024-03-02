/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.pizza_restaurant;

/**
 *
 * @author Leonardo
 */
public class Ementa {
    private static int nextid = 0;
    /**
     * 
     */
    private String designacao;
    
    /**
     * 
     */
    private String descricao;
    
    /**
     * 
     */
    private int id;

    /**
     * 
     */
    private String data_inic; //(data em que a ementa entra em vigor);
    
    /**
     * 
     */
    private String data_fim; //(não necessita de ser pré-estabelecida);
    
    /**
     * 
     */
    private final int NUM_PIZZA = 10;
    
    /**
     * 
     */
    private Pizza[] pizza;
    
    public Ementa(String tempdesignacao, String tempdescricao, String tempdataIni, String tempdatafim){
        
        pizza = new Pizza[NUM_PIZZA];
        designacao = tempdesignacao;
        descricao = tempdescricao;
        data_inic = tempdataIni;
        data_fim = tempdatafim;  
        id = nextid++;
    }
    
    public void setDesignacao(String designacao){
        this.designacao = designacao;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public void setDataInic(String datainic){
        this.data_inic = datainic;
    }
    
    public void setDataFim(String datafim){
        this.data_fim = datafim;
    }
    
    public void setPizzas(Pizza[] pizza){
        this.pizza = pizza;
    }
    
    public int getId(){
        return this.id;
    }
    
    public String getDesignacao(){
        return this.designacao;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    
    public String getDataInic(){
        return this.data_inic;
    }
    public String getDataFim(){
        return this.data_fim;
    }
    public Pizza[] getPizzas(){
        return this.pizza;
    }

}
