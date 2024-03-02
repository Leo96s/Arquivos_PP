import java.time.LocalDate;

/**
 * Escreva uma descrição da classe ContinentHipermarket aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ContinentHipermarket extends Hipermarket
{

    /**
     * Construtor para objetos da classe ContinentHipermarket
     */
    public ContinentHipermarket(String name, int vatNumber, double potatoesprice, double gasprice, double coffeeprice)
    {
        super(name, vatNumber, potatoesprice, gasprice, coffeeprice);
    }

    public int getPoints(double purchaseValue){
        LocalDate dataatual = LocalDate.now();
        
        if(dataatual.getDayOfMonth() <= 20){
            return ((int) purchaseValue / 5);
        }else if(dataatual.getDayOfMonth() >= 21){
            return ((int) purchaseValue / 20) * 3;
        }
        return 0;
    }
}
