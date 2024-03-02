/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupoiii;

/**
 *
 * @author Joaquim Matos
 */
import grupoiii.enums.SizeType;

public class Dog extends Animal implements Doghelp {

    private SizeType sizeType;

    public Dog(SizeType sizeType, String name, String birthdate, boolean vacination) {
        super(name, birthdate, vacination);
        this.sizeType = sizeType;
    }

    public SizeType getSizeType() {
        return sizeType;
    }

    public void setSizeType(SizeType sizeType) {
        this.sizeType = sizeType;
    }

    @Override
    public String toString() {
        String s = super.toString();
        return s + "\n  Dog{" + "sizeType=" + sizeType + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Dog temp = (Dog) obj;
        if (temp.sizeType.equals(this.sizeType)) {
            return true;
        }
        return false;
    }
}
