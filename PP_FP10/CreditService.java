
/**
 * Escreva a descrição da interface CreditService aqui.
 * 
 * @author (seu nome aqui) 
 * @version (um número da versão ou data aqui)
 */

public interface CreditService
{
    public double getAnnualRate();
    
    public void setAnnualRate(double r);
    
    public double computerMonthlyPayment(double ammount, int months);
}
