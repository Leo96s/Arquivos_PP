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
public class CalculatorDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CalculatorMain calculator = new CalculatorMain();
        
        System.out.println("Calculator: ");
        
        calculator.setCalculator(new AddCalculator());
        System.out.println("Soma: " + calculator.calculate(23, 45));
        
        calculator.setCalculator(new SubtractCalculator());
        System.out.println("Subtracao: " + calculator.calculate(34, 100));
        
        calculator.setCalculator(new MultiplyCalculator());
        System.out.println("Multiplicacao: " + calculator.calculate(2, 2));
        
        calculator.setCalculator(new DivideCalculator());
        System.out.println("Divisao: " + calculator.calculate(1, 2));
        
        calculator.setCalculator(new ExponentCalculator());
        System.out.println("Resultado de a^b: " + calculator.calculate(2, 2));
        
             
    }
    
}
