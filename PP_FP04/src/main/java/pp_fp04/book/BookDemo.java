package pp_fp04.book;

public class BookDemo {
    
    static Authors autor1, autor2;
    static Criticos critico1, critico2, critico3;
    public static void main(String[] args) {

        Data.dia = 3;
        Data.mes = 5;
        Data.ano = 2023;
        autor1 = new Authors();
        autor1.acronimo = new char[] {'A', 'B', 'C'};
        autor1.nacionalidade = new char[] {'a'};
        autor1.nome = new char[] {'b'};
        autor2 = new Authors();
        autor2.acronimo = new char[] {'D', 'E', 'F'};

        critico1.cotacao = 2;
        critico2.cotacao = 7;

        System.out.println(Book.titulo);
        System.out.println(Book.editora);
        System.out.println(autor1.acronimo);
        System.out.println(autor2.acronimo);
        System.out.println(autor1.nome);
        System.out.println(autor1.nacionalidade);
        System.out.println("0" + Data.dia + "/"+ "0" + Data.mes + "/" + Data.ano);
        System.out.println(Book.paginas);
        System.out.println(critico1.cotacao);
        System.out.println(critico2.cotacao);
        
    }
}
