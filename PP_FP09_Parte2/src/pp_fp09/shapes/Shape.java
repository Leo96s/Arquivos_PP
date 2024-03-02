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
abstract class Shape {
    
    private String color = "red";
    
    private boolean filled;
    
    
    public Shape(boolean filled, String color){
        this.filled = filled;
        this.color = color;
    }
    
    public Shape(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    abstract double getArea();
    
    abstract double getPerimeter();
    
    
    @Override
    public String toString(){
        
        String str = "";
        
        str+= "Color: " + this.getColor() + "\n" + "filled: " + this.isFilled() + "\n";
        
        return str;
    }
    
}
