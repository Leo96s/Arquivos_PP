/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.pizza_restaurant;
import pp_fp06.pizza_restaurant.enums.Origem;

/**
 *
 * @author Leonardo
 */
public class Ingredientes {
    private static int next_cod = 0;
    /**
     * 
     */
    private int codigo;
    
    /**
     * 
     */
    private String nome;
    
    /**
     * 
     */
    private Origem origem;
    
    /**
     * 
     */
    private int n_calorias;
    
    public Ingredientes(String tempnome, Origem temporigem, int tempcalorias){

        nome = tempnome;
        origem = temporigem;
        n_calorias = tempcalorias;
        codigo = next_cod++;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setOrigem(Origem origem){
        this.origem = origem;
    }
    
    public void setcalorias(int calorias){
        this.n_calorias = calorias;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public Origem getOrigem(){
        return this.origem;
    }
    
    public int getcalorias(){
        return this.n_calorias;
    }
    

}
