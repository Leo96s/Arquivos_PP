
/**
 * Escreva uma descrição da classe Company aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Company
{
    private int vatNumber;
    
    private String name;

    /**
     * Construtor para objetos da classe Company
     */
    public Company(String name, int vatNumber)
    {
        this.name = name;
        this.vatNumber = vatNumber;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String val){
        this.name = val;
    }
    
    public int getVatNumber(){
        return this.vatNumber;
    }
    
    public void setVatNumber(int val){
        this.vatNumber = val;
    }

    
}
