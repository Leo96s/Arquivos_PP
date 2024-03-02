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
public class Rectangle extends Square{
    
    private double height = 1.0;

    public Rectangle(boolean filled, String color, double width) {
        super(filled, color, width);
    }

    public Rectangle(boolean filled, double width) {
        super(filled, width);
    }

    public Rectangle(boolean filled, String color) {
        super(filled, color);
    }

    public Rectangle(boolean filled) {
        super(filled);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    @Override
    public double getArea(){
        double area;
        
        area = this.getWidth() * this.getHeight();
        
        return area;
    }
    
    @Override
    public double getPerimeter(){
        double perimeter;
        
        perimeter = (this.getHeight() + this.getWidth()) * 2;
        
        return perimeter;
    }
    
    @Override
    public String toString(){
        
        String str = "";
        
        str += super.toString() + "Height: " + this.getHeight() + "\n" + "Area: " + this.getArea() + "\n" +
                "Perimeter: " + this.getPerimeter() + "\n";
        
        return str;
    }
    
}
