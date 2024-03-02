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
public class Track {

    private final int AUTHOR_SIZE = 5;

    public int nfaixa;
    
    public String nome;

    public int duracao;

    public Author[] autor;

    public Track(int tempnfaixa, String tempNome, int tempDuracao){
        autor = new Author[AUTHOR_SIZE];
        nfaixa = tempnfaixa;
        nome = tempNome;
        duracao = tempDuracao;       
    }
}
