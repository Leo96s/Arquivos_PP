/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Leonardo
 */
public class CalculatorMain {
    
    private Calculator calculator;
    
    public CalculatorMain(){

    }
    
    public void setCalculator(Calculator calculator){
        this.calculator = calculator;
    }
    
    public double calculate(int x, int y){
        return calculator.getCalculatorTotal(x, y);
    }
}
