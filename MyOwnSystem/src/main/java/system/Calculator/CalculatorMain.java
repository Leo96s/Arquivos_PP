package system.Calculator;

/**
 *
 * @author Leonardo
 */
public class CalculatorMain {
    
    private calculator calculator;
    
    public CalculatorMain(){

    }
    
    public void setCalculator(calculator calculator){
        this.calculator = calculator;
    }
    
    public double calculate(double x, int y){
        return calculator.getCalculatorTotal(x, y);
    }
}
