/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp05.store;
import pp_fp05.cd.CD;
import pp_fp05.cd.Artist;
import pp_fp05.cd.Author;
import pp_fp05.cd.Track;

/**
 *
 * @author Leonardo
 */
public class StoreDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Artist a1 = new Artist("Artista1", "German", "1977-03-04");
        Artist[] artists = {a1};
        CD cd = new CD("The Lumineers", "The Lumineers", 2012, "Dualtone Records",
         195, artists, 40);
        CD cd1 = new CD("The Lumineers1", "The Lumineers1", 2013, "Dualtone Records",
         200, artists);
        CD cd2 = new CD("The Lumineers2", "The Lumineers2", 2014, "Dualtone Records",
         250, artists, 50);
        CD[] cds = {cd, cd1, cd2};

        Author author1 = new Author("Antonio", 23, "rua de cunha", 123456789, 222333444);
        Author author2 = new Author("Manel", 22, "rua de cunha", 123456543, 222333444);
        Author author3 = new Author("Jose", 25);

        Track t1 = new Track(1, "Ho Hey", 90);
        Track t2 = new Track(2, "Stubborn Love", 105);

        cd.musicas[0] = t1;
        cd.musicas[14] = t2;

        cd1.musicas[0] = t1;
        cd1.musicas[14] = t2;

        cd2.musicas[0] = t1;
        cd2.musicas[14] = t2;

        cd.musicas[0].autor[0] = author1;
        cd.musicas[0].autor[1] = author2;

        cd.musicas[14].autor[0] = author3;

        cd1.musicas[0].autor[0] = author1;
        cd1.musicas[0].autor[1] = author2;

        cd1.musicas[14].autor[0] = author3;

        cd2.musicas[0].autor[0] = author1;
        cd2.musicas[0].autor[1] = author2;

        cd2.musicas[14].autor[0] = author3;

        int nTracks = cd.musicas.length;
        int nAuhtors = t1.autor.length; 

        Sale sale = new Sale("2023-02-12", cds);

        System.out.println("Id da compra: " + sale.id);
        System.out.println("Data da venda: " + sale.data);

        for(int i = 0; i < cds.length; i++){
            
            System.out.println("Nome banda: " + sale.cd[i].nomebanda);
            System.out.println("Nome de cd: " + sale.cd[i].nomecd);
            System.out.println("Ano lancamento: " + sale.cd[i].anolancamento);
            System.out.println("Editora: " + sale.cd[i].editora);
            System.out.println("Tempo total: " + sale.cd[i].tempototal);
            
            for(int j = 0; j < artists.length; j++){
                System.out.println("Artista: " + sale.cd[i].artista[j].nomeartista);
                System.out.println("Artista: " + sale.cd[i].artista[j].nacionalidade);
                System.out.println("Artista: " + sale.cd[i].artista[j].datanascimento);
            }
            for(int k = 0; k < nTracks; k++){
                if(sale.cd[i].musicas[k] != null){
                    Track t = sale.cd[i].musicas[k];
                    System.out.println("Musica numero: " + t.nfaixa + " com titulo: " + t.nome);
                    System.out.println("Duracao (em segundos): " + t.duracao);
                    for(int l = 0; l < nAuhtors; l++){
                        if(t.autor[l] != null){
    
                            System.out.println("Autor da musica: " + t.autor[l].nome);
                            System.out.println("Idade: " + t.autor[l].idade);
    
                            if(t.autor[l].morada != null){
                            System.out.println("Morada: " + t.autor[l].morada);
                            System.out.println("Nif: " + t.autor[l].nif);
                            System.out.println("NIB: " + t.autor[l].nib);
                            }
                        }
                    }
                }
            }
            sale.preco = sale.cd[0].price + sale.cd[1].price + sale.cd[2].price;
            System.out.println("Preco final: " + sale.preco);


        }

    }
    
}
