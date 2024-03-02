/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp07.publicSchool;

/**
 *
 * @author Leonardo
 */
public class Pessoa {
    
    /**
     * Nome da pessoa
     */
    private String nome;

    /**
     * Data de nascimento
     */
    private String datanascimento;

    /**
     * Morada
     */
    private String morada;

    /**
     * Numero de cartao de cidadao
     */
    private int n_cc;

    /**
     * Numero de identificacao fiscal
     */
    private String nif;

    /**
     * Metodo construtor atribuido a uma pessoa
     * @param newnome
     * @param newdatanascimento
     * @param newmorada
     * @param newn_cc
     * @param newnif
     */
    public Pessoa (String newnome, String newdatanascimento, String newmorada, int newn_cc, String newnif){

        nome = newnome;
        datanascimento = newdatanascimento;
        morada = newmorada;
        n_cc = newn_cc;
        nif = newnif;
    }

    /**
     * Alterar o valor do nome
     * @param nome
     */
    public void setnome(String nome){
        this.nome = nome;
    }

    /**
     * Alterar a data de nascimento
     * @param datanascimento
     */
    public void setdatanascimento(String datanascimento){
        this.datanascimento = datanascimento;
    }

    /**
     * Alterar a morada
     * @param morada
     */
    public void setmorada(String morada){
        this.morada = morada;
    }

    /**
     * Alterar o numero do cartao de cidadao
     * @param n_cc
     */
    public void setn_cc(int n_cc){
        this.n_cc = n_cc;
    }
    
    /**
     * Alterar o numero de identificacao fiscal
     * @param nif
     */
    public void setnif(String nif){
        this.nif = nif;
    }

    /**
     * Obter o nome
     * @return
     */
    public String getnome(){
        return this.nome;
    }
    
    /**
     * Obter a data de nascimento
     * @return
     */
    public String getdatanascimento(){
        return this.datanascimento;
    }

    /**
     * Obter a morada
     * @return
     */
    public String getmorada(){
        return this.morada;
    }

    /**
     * Obter o numero de cartao de cidadao
     * @return
     */
    public int getn_cc(){
        return this.n_cc;
    }

    /**
     * Obter o numero de identificacao fiscal
     * @return
     */
    public String getnif(){
        return this.nif;
    }

}