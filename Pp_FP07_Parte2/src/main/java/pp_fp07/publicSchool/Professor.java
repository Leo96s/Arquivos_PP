/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp07.publicSchool;

import Enumerations.TipoContrato;

/**
 *
 * @author Leonardo
 */
public class Professor extends Pessoa {
    
    /**
     * Sigla que identifica o professor
     */
    private String sigla;

    /**
     * Tipo de contrato
     */
    private TipoContrato contrato;

    /**
     * Conjunto de unidades curriculares que leciona
     */
    private UnidadeCurricular[] uni_curricular;
    
    /**
     * Metodo construtor para obter os valores atribuidos as instancias de professor
     * @param nome
     * @param datanascimento
     * @param morada
     * @param n_cc
     * @param nif
     * @param newsigla
     * @param newcontrato
     * @param newuni_curricular
     */
    public Professor(String nome, String datanascimento, String morada, int n_cc, String nif, String newsigla, TipoContrato newcontrato,
    UnidadeCurricular[] newuni_curricular){

        super(nome, datanascimento, morada, n_cc, nif);
        sigla = newsigla;
        contrato = newcontrato;
        uni_curricular = newuni_curricular;
    }

    /**
     * Metodo de acesso para alterar o valor atribuido a sigla
     * @param sigla
     */
    public void setsigla(String sigla){
        this.sigla = sigla;
    }

    /**
     * Metodo de acesso para alterar o valor atribuido ao contrato
     * @param contrato
     */
    public void setcontrato(TipoContrato contrato){
        this.contrato = contrato;
    }

    /**
     * Metodo de acesso para alterar o valor atribuido a unidade curricular
     * @param uni_curricular
     */
    public void setuni_curricular(UnidadeCurricular[] uni_curricular){
        this.uni_curricular = uni_curricular;
    }

    /**
     * Metodo de acesso para obter o valor atribuido a sigla
     * @return
     */
    public String getsigla(){
        return this.sigla;
    }

    /**
     * Metodo de acesso para obter o valor atribuido ao tipo de contrato
     * @return
     */
    public TipoContrato getcontrato(){
        return this.contrato;
    }
    
    /**
     * Metodo de acesso para obter o valor atribuido a unidade curricular
     * @return
     */
    public UnidadeCurricular[] getuni_curricular(){
        return this.uni_curricular;
    }


}
