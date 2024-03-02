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
public class ShapeManagement {
    
    private Shape[] shapes;
    private int count;
    
    public ShapeManagement(){
        this.shapes = new Shape[3];
    }
    
    public void addShape(Shape _shape){
        if(!contains(_shape)){
        if(this.count == this.shapes.length){
            this.shapes = this.extendShape();
        }
        
        this.shapes[this.count++] = _shape;
        }
    }
    
    private Shape[] extendShape(){
        int newlength = this.shapes.length * 2;
        Shape[] newshape = new Shape[newlength];
        
        for(int i = 0; i < this.shapes.length; i++){
            newshape[i] = this.shapes[i];
        }
        
        return newshape;
    }
    
    private boolean contains(Shape _shape){
        for(int i = 0; i < this.count; i++){
            if(this.shapes[i].equals(_shape)){
                return true;
            }
        }
        return false;
    }
    
    public void removeShape(Shape _shape){
        int indexToRemove = -1;
        
        for(int i = 0; i < this.shapes.length; i++){
            if(this.shapes[i].equals(_shape)){
                indexToRemove = i;
                break;
                
            }
        }
        if(indexToRemove != -1){
            for(int i = indexToRemove; i < this.count; i++){
                this.shapes[i] = this.shapes[i + 1];
            }
            this.count--;
            this.shapes[this.count] = null;
        }
    }
    
    public String findShape(Shape _shape){
        String str = "";
        for(int i = 0; i < this.count; i++){
            if(this.shapes[i].equals(_shape)){
                if(this.shapes[i] instanceof Circle){
                    Circle circle = (Circle)this.shapes[i];
                    str+="--------------------------------\n";
                    str += circle.toString();
                    str+="--------------------------------\n";
                    
                }else if(this.shapes[i] instanceof Square){
                    Square square = (Square)this.shapes[i];
                    str+="--------------------------------\n";
                    str += square.toString();
                    str+="--------------------------------\n";
                    
                }else if(this.shapes[i] instanceof Rectangle){
                    Rectangle rectangle = (Rectangle)this.shapes[i];
                    str+="--------------------------------\n";
                    str += rectangle.toString();
                    str+="\n--------------------------------\n";
                    
                }
            }else {
                System.out.println("Impossible to read.");
            }
        }
        return str;
    }
     
    public String findShaopeByType(String type){
        type = type.toLowerCase();
            Shape[] _shape = new Shape[typeCounter(type)];
            
        int index = 0;
        String str = "";
        
        if(_shape.length != 0){
        for(int i = 0; i < this.count; i++){
            if(!"circle".equals(type) && !"rectangle".equals(type)){
                _shape[index++] = this.shapes[i];
            
            } else if(!"square".equals(type) && !"rectangle".equals(type)){
                _shape[index++] = this.shapes[i];
            
            }else if(!"circle".equals(type) && !"square".equals(type)){
                _shape[index++] = this.shapes[i];
            }
          
        }
        for(Shape shape_ : _shape){
            if(shape_ != null){
                
                if(shape_ instanceof Circle){
                    Circle circle = (Circle)shape_;
                    str+="--------------------------------\n";
                    str += circle.toString();
                    str+="--------------------------------\n";
                    
                }else if(shape_ instanceof Square){
                    Square square = (Square)shape_;
                    str+="--------------------------------\n";
                    str += square.toString();
                    str+="--------------------------------\n";
                    
                }else if(shape_ instanceof Rectangle){
                    Rectangle rectangle = (Rectangle)shape_;
                    str+="--------------------------------\n";
                    str += rectangle.toString();
                    str+="\n--------------------------------\n";
                    
                }else {
                    System.out.println("Impossible to read.");
                }
            }
        }              
    }else{
          str += "Nao foi adicionado espaco ao array";  
        }
        return str;      
    }
    
    private int typeCounter(String type) {
        type = type.toLowerCase();
        int circlecount = 0, squarecount = 0, rectanglecount = 0;

        for (Shape temp : this.shapes) {
            if (temp != null) {
                if (temp instanceof Circle) {
                    circlecount++;
                } else if (temp instanceof Square) {
                    squarecount++;
                } else if (temp instanceof Rectangle) {
                    rectanglecount++;
                }
            }
        }
        
        if("square".equals(type)){
            return squarecount;
            
        }else if("circle".equals(type)){
            return circlecount;
            
        }else if("rectangle".equals(type)){
            return rectanglecount;
        }
       
        return 0;    
    }
    
    @Override
    public String toString(){
        
        String str = "";
        
        for(Shape _shape : this.shapes){
            if(_shape != null){
                
                if(_shape instanceof Circle){
                    Circle circle = (Circle)_shape;
                    str+="--------------------------------\n";
                    str += circle.toString();
                    str+="--------------------------------\n";
                    
                }else if(_shape instanceof Square){
                    Square square = (Square)_shape;
                    str+="--------------------------------\n";
                    str += square.toString();
                    str+="--------------------------------\n";
                    
                }else if(_shape instanceof Rectangle){
                    Rectangle rectangle = (Rectangle)_shape;
                    str+="--------------------------------\n";
                    str += rectangle.toString();
                    str+="\n--------------------------------\n";
                    
                }else {
                    System.out.println("Impossible to read.");
                }
            }
        }
        return str;
    }
}
