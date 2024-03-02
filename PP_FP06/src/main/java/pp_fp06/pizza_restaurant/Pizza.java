/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.pizza_restaurant;
import pp_fp06.pizza_restaurant.enums.Tamanho_P;

/**
 *
 * @author Leonardo
 */
public class Pizza {
    private static int nextcodigo = 0;
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
    private String descricao;
    
    /**
     * 
     */
    private float preco;
    
    /**
     * 
     */
    private Tamanho_P tamanho;
    
    /**
     * 
     */
    private final int NUM_INGREDIENTES = 5;
    
    /**
     * 
     */
    private Ingredientes[] ingrediente;
    
    public Pizza(String tempnome, String tempdescricao, float temppreco, Tamanho_P temptamanho){
        
        ingrediente = new Ingredientes[NUM_INGREDIENTES];
        nome = tempnome;
        descricao = tempdescricao;
        preco = temppreco; 
        codigo = nextcodigo++;
        tamanho = temptamanho;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public void setpreco(int preco){
        this.preco = preco;
    }
    
    public void setTamanho(Tamanho_P tamanho){
        this.tamanho = tamanho;
    }
    
    public void setIngrediente(Ingredientes[] ingrediente){
        this.ingrediente = ingrediente;
    }
    
    public int getcodigo(){
        return this.codigo;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    
    public float getpreco(){
        return this.preco;
    }
    
    public Tamanho_P getTamanho(){
        return this.tamanho;
    }
    
    public Ingredientes[] getIngredientes(){
        return this.ingrediente;
    }
}
