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
public class Aluno extends Pessoa {
    
    private static int nextcodigo = 0;

    private int codigo;

    private UnidadeCurricular[] uni_curricular;

    public Aluno (String nome, String datanascimento, String morada, int n_cc, String nif, UnidadeCurricular[] newuni_curricular){

        super(nome, datanascimento, morada, n_cc, nif);

        codigo = nextcodigo++;
        uni_curricular = newuni_curricular;
    }

    public void setuni_curricular(UnidadeCurricular[] uni_curricular){
        this.uni_curricular = uni_curricular;
    }

    public int getcodigo(){
        return this.codigo;
    }

    public UnidadeCurricular[] getuni_curricular(){
        return this.uni_curricular;
    }
}
