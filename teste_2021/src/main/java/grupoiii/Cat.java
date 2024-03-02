/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupoiii;

import grupoiii.enums.CatType;

/**
 *
 * @author Joaquim Matos
 */
public class Cat extends Animal implements Cathelp {

    private CatType catType;

    public Cat(CatType catType, String name, String birthdate, boolean vacination) {
        super(name, birthdate, vacination);
        this.catType = catType;
    }

    public CatType getCatType() {
        return catType;
    }

    public void setCatType(CatType catType) {
        this.catType = catType;
    }

    @Override
    public String toString() {
        String s = super.toString();
        return s + "\n  Cat{" + "catType=" + catType + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Cat temp = (Cat) obj;
        if (temp.catType.equals(this.catType)) {
            return true;
        }
        return false;
    }
}
