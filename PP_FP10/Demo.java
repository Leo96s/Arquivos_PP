import java.util.function.DoubleBinaryOperator;

/**
 * Escreva uma descrição da classe Demo aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Demo
{
    public static void main(String[] args) 
    {
        ContinentHipermarket c1 = new ContinentHipermarket("Continente", 1233, 5.0, 4.0, 5.0);
        JumpHipermarket c2 = new JumpHipermarket("Rico Preco", 123, 3.0, 2.0, 7.0);

        System.out.println(c1.getPoints(123));
        System.out.println(c2.getPoints(123));

        System.out.println(c1.getMorePoints(123, c2, c1));


        GasStation gas1 = new GasStation("Inter Marche", 12345, 11);
        GasStation gas2 = new GasStation("Galp", 1234567, 11);
        GasStation gas3 = new GasStation("BP", 12345, 11);

        GasStation[] gStations = {gas1, gas2, gas3};

       System.out.println(c1.getcheapGasStation(gStations).toString());

       System.out.println(c1.getPrecoCabaz(3, 3, 4));
    }
}
