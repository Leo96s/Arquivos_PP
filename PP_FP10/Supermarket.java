
/**
 * Escreva uma descrição da classe Supermarket aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Supermarket extends Company implements MarketService
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private double potatoesprice;

    /**
     * Construtor para objetos da classe Supermarket
     */
    public Supermarket(String name, int vatNumber, double potatoesprice)
    {
        super(name, vatNumber);
        this.potatoesprice = potatoesprice;
    }

    public double getPotatoesPrice(){
        return this.potatoesprice;
    }
    
    public void setPotatoesPrice(double p){
        if(p >= 0){
        this.potatoesprice = p;
        }
    }
    
    public double getMarketTotal(double kilos){
        return kilos * this.potatoesprice;
    }
}
