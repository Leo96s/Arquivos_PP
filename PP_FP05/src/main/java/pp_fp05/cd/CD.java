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
public class CD {
    private final int CD_SIZE = 15;
    protected final int ARTIST_SIZE = 5;
    public String nomebanda;
    public String nomecd;
    public int tempototal;
    public int anolancamento;
    public int price;
    public String editora;
    public Artist[] artista;
    public Track[] musicas;

    public CD(String tempNomebanda, String tempNomecd, int tempAnolancamento, String tempEditora, int tempTempototal, 
        Artist[] artisttemp, int tempprice){
        musicas = new Track[CD_SIZE];
        artista = artisttemp;

        nomebanda = tempNomebanda;
        nomecd = tempNomecd;
        tempototal = tempTempototal;
        anolancamento = tempAnolancamento;
        editora = tempEditora;
        price = tempprice;
    }
    
    public CD(String tempNomebanda, String tempNomecd, int tempAnolancamento, String tempEditora, int tempTempototal, 
            Artist[] artisttemp, Track[] tempmusicas, int tempprice){
        
        musicas = tempmusicas;
        artista = artisttemp;

        nomebanda = tempNomebanda;
        nomecd = tempNomecd;
        tempototal = tempTempototal;
        anolancamento = tempAnolancamento;
        editora = tempEditora;
        price = tempprice;
    }
    public CD(String tempNomebanda, String tempNomecd, int tempAnolancamento, String tempEditora, int tempTempototal, 
        Artist[] artisttemp){
        musicas = new Track[CD_SIZE];
        artista = artisttemp;

        nomebanda = tempNomebanda;
        nomecd = tempNomecd;
        tempototal = tempTempototal;
        anolancamento = tempAnolancamento;
        editora = tempEditora;
    }

}
