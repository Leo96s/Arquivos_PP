
/**
 * Escreva uma descrição da classe Hipermarket aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public abstract class Hipermarket extends Supermarket implements HipermarketService, PointsService
{
    private int points;
    private double gasprice;
    private double annualrate;
    private double coffeeprice;
    
    /**
     * Construtor para objetos da classe Hipermarket
     */
    public Hipermarket(String name, int vatNumber, double potatoesprice, double gasprice, double coffeeprice)
    {
        super(name, vatNumber, potatoesprice);
        this.gasprice = gasprice;
        this.coffeeprice = coffeeprice;
       
    }

    public abstract int getPoints(double purchaseValue);
    
    public double getPotatoes(){
        return super.getPotatoesPrice();
    }
    
    public void setPotatoesPrice(double p){
        super.setPotatoesPrice(p);
    }
    
    public double getMarketTotal(double kilos){
        return kilos * this.getPotatoes();
    }
    
    public double getGasPrice(){
        return this.gasprice;
    }
    
    public void setGasPrice(double p){
        this.gasprice = p;
    }
    
    public double getGasTotal(double litres){
        return litres * this.gasprice;
    }
    
    public double getAnnualRate(){
        return this.annualrate;
    }
    
    public void setAnnualRate(double r){
        this.annualrate = r;
    }
    
    public double computerMonthlyPayment(double ammount, int months){
        double montlyTax = (1 + Math.pow(this.getAnnualRate(), 1/12) - 1);  
        return (montlyTax * ammount) / (1 - Math.pow(1 + montlyTax, -months));
    }
    
    public double getCoffeePrice(){
        return this.coffeeprice;
    }
    
    public void setCoffeePrice(double p){
        this.coffeeprice = p;
    }
    
    public double getCoffeeTotal(int coffees){
        return coffees * this.coffeeprice;
    }
    
    public String getMorePoints(double purchaseValue, PointsService jump, PointsService continente) 
    {
        int continentepoints = continente.getPoints(purchaseValue);
        int jumppoints = jump.getPoints(purchaseValue);
  

        if(continentepoints > jumppoints){
            return "O continete da mais pontos: " + " " + continentepoints;
        }else{
            return "O jump da mais pontos: " + " " + jumppoints;
        }
        
    }
    
    public GasStation getcheapGasStation(GasStation[] gasstations){
        double cheapprice = gasstations[0].getGasPrice();
        int temp = 0;
        for(int i = 0; i < gasstations.length; i++){
            if(gasstations[i].getGasPrice() < cheapprice){
                cheapprice = gasstations[i].getGasPrice();
                temp = i;
            }else if(gasstations[i].getGasPrice() == cheapprice){
                cheapprice = gasstations[temp].getGasPrice();
            }
        }
        return gasstations[temp];
    }

    public double getPrecoCabaz(int q, int l, int c){
        return this.getMarketTotal(q) + this.getGasTotal(l) + this.getCoffeeTotal(c);
    }

    public Hipermarket getcheapHipermarket(Hipermarket[] hipermarket, int q, int l, int c){
        double cheapcabaz = hipermarket[0].getPrecoCabaz(q, l, c);
        int temp = 0;

        for(int i = 0; i < hipermarket.length; i++){
            if(hipermarket[i].getPrecoCabaz(q, l, c) < cheapcabaz){
                cheapcabaz = hipermarket[i].getPrecoCabaz(q, l, c);
                temp = i;
            }else if(hipermarket[i].getPrecoCabaz(q, l, c) == cheapcabaz){
                cheapcabaz = hipermarket[temp].getPrecoCabaz(q, l, c);
            }
        }
        return hipermarket[temp];

    }
    
}
