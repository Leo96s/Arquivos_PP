
/**
 * Escreva uma descrição da classe LargeGasStation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class LargeGasStation extends GasStation implements CoffeeService
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private double coffeeprice;

    /**
     * Construtor para objetos da classe LargeGasStation
     */
    public LargeGasStation(String name, int vatNumber, double price, double coffeeprice)
    {
        super(name, vatNumber, price);
        this.coffeeprice = coffeeprice;
    }
    
    public double getCoffeePrice(){
        return this.coffeeprice;    
    }
    
    public void setCoffeePrice(double p){
        if(p >= 0){
        this.coffeeprice = p;
        }
    }
    
    public double getCoffeeTotal(int coffees){
        return coffees * this.coffeeprice;
    }
    
    
}
