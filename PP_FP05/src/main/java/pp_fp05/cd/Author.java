/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp05.cd;

/**
 *
 * @author Leonardo
 */
public class Author {
    
    /**
     * Nome do autor
     */
    public String nome;
    
    /**
     * Idade do autor
     */
    public int idade;
    
    /**
     * Morada do autor
     */
    public String morada;
    
    /**
     * Nif do autor
     */
    public int nif;
    
    /**Nib para o qual vai cair o dinheiro
     * 
     */
    public int nib;

    public Author(String tempnome, int tempidade, String tempmorada, int tempnif, int tempnib){

        nome = tempnome;
        idade = tempidade;
        morada = tempmorada;
        nif = tempnif;
        nib = tempnib;
    }
    public Author(String tempnome, int tempidade){
        nome = tempnome;
        idade = tempidade;
    }
}
