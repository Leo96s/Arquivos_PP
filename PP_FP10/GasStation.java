
/**
 * Escreva uma descrição da classe GasStation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class GasStation extends Company implements GasService
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private double price;
    
    public GasStation(String name, int vatNumber, double price)
    {
        super(name, vatNumber);
        this.price = price;
    }

    public double getGasPrice(){
       return this.price; 
    }
    
    public void setGasPrice(double p){
        this.price = p;
    }
    
    public double getGasTotal(double litres){
        return this.price * litres;
    }

    public String toString(){

        String str = "";

        str += "Nome: " + this.getName() + "\n" + "VatNumber: " + this.getVatNumber() + "\n" + 
                "Price: " + this.getGasPrice() + "\n";

        return str;
    }
}
