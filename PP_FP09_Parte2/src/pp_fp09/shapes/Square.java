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
public class Square extends Shape{
    
    private double width = 1.0;
    
    
    public Square(boolean filled, String color, double width){
        super(filled, color);
        this.width = width;
    }
    
    public Square(boolean filled, double width){
        super(filled);
        this.width = width;
    }
    
    public Square(boolean filled, String color) {
        super(filled, color);
    }

    public Square(boolean filled) {
        super(filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    @Override
    public double getArea(){
        double area;
        
        area = this.width * this.width;
        
        return area;
    }
    
    @Override
    public double getPerimeter(){
        double perimeter;
        
        perimeter = 4 * this.width;
        
        return perimeter;
    }
    
    @Override
    public String toString(){
        
        String str = "";
        
        str+= super.toString() + "width: " + this.getWidth() + "\n" + "Area: " + this.getArea() + "\n" +
                "Perimeter: " + this.getPerimeter() + "\n";
        
        return str;
                                
    }
    
}
