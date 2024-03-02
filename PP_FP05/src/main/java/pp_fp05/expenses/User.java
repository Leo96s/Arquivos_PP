package pp_fp05.expenses;


public class User {
    
    //Tamanho do mes
    protected final int EXPENSES_SIZE = 31;

    //Numero de identificacao
    protected int id;

    /** Nome */
    protected String nome;

    /**Email */
    protected String email;

    /**Data de nascimento */
    protected String datanascimento;

    /**Array com o conjunto de despesas */
    protected Expenses[] expenses;

    private static int nextid = 0;

    /**Construtor que incializa o array */
    public User(String tempNome, String tempEmail, String tempDatanascimento){
        expenses = new Expenses[EXPENSES_SIZE];
        id = nextid++;
        nome = tempNome;
        email = tempEmail;
        datanascimento = tempDatanascimento;
    }
}
