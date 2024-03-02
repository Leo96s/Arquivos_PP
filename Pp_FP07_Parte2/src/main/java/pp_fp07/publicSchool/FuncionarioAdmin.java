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
public class FuncionarioAdmin extends Pessoa {
    
    private static int nextcod = 0;

    private int codigo;

    private TipoContrato contrato;

    public FuncionarioAdmin (String nome, String datanascimento, String morada, int n_cc, String nif, TipoContrato newcontrato){

        super(nome, datanascimento, morada, n_cc, nif);
        codigo = nextcod++;
        contrato = newcontrato;

    }

    public void setcontrato(TipoContrato contrato){
        this.contrato = contrato;
    }

    public int getcodigo(){
        return this.codigo;
    }

    public TipoContrato getcontrato(){
        return this.contrato;
    }
}
