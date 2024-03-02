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
public class UnidadeCurricular {
    
    /**
     * Nome da unidade
     */
    private String nome_uni;

    /**
     * Sigla da unidade
     */
    private String sigla;

    /**
     * Nome do curso
     */
    private String nome_curso;

    /**
     * Ano letivo
     */
    private int ano;

    /**
     * Semestre
     */
    private int semestre;

    /**
     * Metodo construtor atribuido à unidade curricular
     * @param newnome_uni
     * @param newsigla
     * @param newnome_curso
     * @param newano
     * @param newsemestre
     */
    public UnidadeCurricular(String newnome_uni, String newsigla, String newnome_curso, int newano, int newsemestre){

        nome_uni = newnome_uni;
        sigla = newsigla;
        nome_curso = newnome_curso;
        ano = newano;
        semestre = newsemestre;

    }

    /**
     * Metodo de acesso para alterar o valor atribuido a nome da unidade
     * @param nome_uni
     */
    public void setnome_uni(String nome_uni){
        this.nome_uni = nome_uni;
    }

    /**
     * Metodo de acesso para alterar o valor atribuido à sigla
     * @param sigla
     */
    public void setsigla(String sigla){
        this.sigla = sigla;
    }

    /**
     * Metodo de acesso para alterar o valor atribuido ao nome do curso
     * @param nome_curso
     */
    public void setnome_curso(String nome_curso){
        this.nome_curso = nome_curso;
    }

    /**
     * Metodo de acesso para alterar o valor atribuido ao ano
     * @param ano
     */
    public void setano(int ano){
        this.ano = ano;
    }

    /**
     * Metodo de acesso para alterar o valor atribuido ao semestre
     * @param semestre
     */
    public void setsemestre(int semestre){
        this.semestre = semestre;
    }

    /**
     * Metodo de acesso para obter o valor atribuido ao nome da unidade
     * @return
     */
    public String getnome_uni(){
        return this.nome_uni;
    }

    /**
     * Metodo de acesso para obter o valor atribuido a sigla
     * @return
     */
    public String getsigla(){
        return this.sigla;
    }

    /**
     * Metodo de acesso para obter o valor atribuido ao nome do curso
     * @return
     */
    public String getnome_curso(){
        return this.nome_curso;
    }

    /**
     * Metodo de acesso para obter o valor atribuido ao ano
     * @return
     */
    public int getano(){
        return this.ano;
    }

    /**
     * Metodo de acesso para obter o valor atribuido ao semestre
     * @return
     */
    public int getsemestre(){
        return this.semestre;
    }
}
