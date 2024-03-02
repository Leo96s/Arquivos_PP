import java.time.LocalDate;

/**
 * Escreva uma descrição da classe JumpHipermarket aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class JumpHipermarket extends Hipermarket
{
    

    /**
     * Construtor para objetos da classe JumpHipermarket
     */
    public JumpHipermarket(String name, int vatNumber, double potatoesprice, double gasprice, double coffeeprice)
    {
        super(name, vatNumber, potatoesprice, gasprice, coffeeprice);
    }

    public int getPoints(double purchaseValue){
        LocalDate dataatual = LocalDate.now();

        if (dataatual.getDayOfWeek().getValue() >= 1 && dataatual.getDayOfWeek().getValue() <= 5) {
            // dias úteis
            return ((int) (purchaseValue / 10) * 3);
        } else {
            // fim de semana
            return ((int) (purchaseValue / 10));
        }
    }
}
