/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp09.shapes;

/**
 *
 * @author Leonardo
 */
public class ShapeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circle circle1 = new Circle(true, 22.4, "blue");
        
        Circle circle2 = new Circle(false, 13.5);
        
        Circle circle3 = new Circle(false, 13.5);
        
        Square square1 = new Square(true, "yellow", 12.0);
        
        Square square2 = new Square(true, 15.0);
        
        Rectangle rectangle1 = new Rectangle(true, "green", 18.3);
        rectangle1.setHeight(19.5);
        
        Rectangle rectangle2 = new Rectangle(true, "black");
        
        ShapeManagement shapesman = new ShapeManagement();
        
        shapesman.addShape(circle1);
        shapesman.addShape(circle2);
        shapesman.addShape(circle3);
        
        System.out.println(shapesman.findShaopeByType("CIRCLE"));
        System.out.println(shapesman.findShape(square2));
    }
    
}
