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
public class CDDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Artist a1 = new Artist("Artista1", "German", "1977-03-04");
        Artist[] artists = {a1};

        Track t1 = new Track(1, "Ho Hey", 90);
        Track t2 = new Track(2, "Stubborn Love", 105);

        CD cd = new CD("The Lumineers", "The Lumineers", 2012, "Dualtone Records",
         195, artists);
        cd.musicas[0] = t1;
        cd.musicas[14] = t2;
        
        System.out.println("Nome do cd: " + cd.nomecd);
        System.out.println("Ano de lancamento: " + cd.anolancamento);
        System.out.println("Editora: " + cd.editora);

        Author author1 = new Author("Antonio", 23, "rua de cunha", 123456789, 222333444);
        Author author2 = new Author("Manel", 22, "rua de cunha", 123456543, 222333444);
        Author author3 = new Author("Jose", 25);

        cd.musicas[0].autor[0] = author1;
        cd.musicas[0].autor[1] = author2;

        cd.musicas[14].autor[0] = author3;

        int nTracks = cd.musicas.length;
        int nAuhtors = t1.autor.length; 
               
        for(int i = 0; i < nTracks; i++){
            if(cd.musicas[i] != null){
                Track t = cd.musicas[i];
                System.out.println("Musica numero: " + t.nfaixa + " com titulo: " + t.nome);
                System.out.println("Duracao (em segundos): " + t.duracao);
                for(int j = 0; j < nAuhtors; j++){
                    if(t1.autor[j] != null){

                        System.out.println("Autor da musica: " + t.autor[j].nome);
                        System.out.println("Idade: " + t.autor[j].idade);

                        if(t.autor[j].morada != null){
                        System.out.println("Morada: " + t.autor[j].morada);
                        System.out.println("Nif: " + t.autor[j].nif);
                        System.out.println("NIB: " + t.autor[j].nib);
                        }
                    }
                }
            }
        }
        
    }
    
}
