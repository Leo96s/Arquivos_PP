/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Music;

/**
 *
 * @author Leonardo
 */
public class File {
    
    private static int nextid;
    private int id;
    
    private String nome;
    
    private String extencao;
    
    private int tamanho;
    
    private int duracao;

    public File(String nome, String extencao, int tamanho, int duracao) {
        this.id = nextid++;
        this.nome = nome;
        this.extencao = extencao;
        this.tamanho = tamanho;
        this.duracao = duracao;
    }

    public File(String nome, String extencao, int tamanho) {
        this.nome = nome;
        this.extencao = extencao;
        this.tamanho = tamanho;
    }

    public File() {
    }

    public int getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getExtencao() {
        return extencao;
    }

    public void setExtencao(String extencao) {
        this.extencao = extencao;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "File{" + "nome=" + nome + ", extencao=" + extencao + ", tamanho=" + tamanho + ", duracao=" + duracao + '}';
    }
    
    public String tracktoString() {
        return "File{" + "nome=" + nome + ", duracao=" + duracao + '}';
    }
    
    
    
}
