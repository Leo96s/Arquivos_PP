/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopphone;

/**
 *
 * @author Leonardo
 */
public class ShopPhone {

    private Phone phone;
    
    public ShopPhone(){
        
    }
    
    public void setPhone(Phone phone){
        this.phone = phone;
    }
    
    public String getInformationsPhone(){
        return "Brand: " + phone.getBrandPhone() + "\n" + "Price: " + phone.getPricePhone()
                + "\n";
    }
    
}
