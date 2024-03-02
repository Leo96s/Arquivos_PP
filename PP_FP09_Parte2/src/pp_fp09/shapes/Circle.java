/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp09.shapes;
import java.text.DecimalFormat;

/**
 *
 * @author Leonardo
 */
public class Circle extends Shape {
    
    private double radius = 1.0;
    
    
    public Circle(boolean filled, double radius){
        super(filled);
        this.radius = radius;
    }
    
    public Circle(boolean filled, double radius, String color){
        super(filled, color);
        this.radius = radius;
    }
    
    public Circle(boolean filled, String color) {
        super(filled, color);
    }

    public Circle(boolean filled) {
        super(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea(){
        double pi = 3.1416;
        double area;
        
        area = pi * (this.getRadius() * this.getRadius());
        
        return area;        
    }
    
    @Override
    public double getPerimeter(){
        double pi = 3.1416;
        double perimeter;
        
        perimeter = 2 * (pi * this.getRadius());
        
        return perimeter;
    }
    
    @Override
    public String toString(){
        
        String str = "";
        
        str += super.toString() + "Radius: " + this.getRadius() + "\n" + "Area: " + this.getArea() + "\n" +
                "Perimeter: " + this.getPerimeter() + "\n";
        
        return str;
    }
}
