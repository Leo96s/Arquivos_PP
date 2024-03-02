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
public class ClientShopPhone { 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ShopPhone shopphone = new ShopPhone();
        
        shopphone.setPhone(new Nokia());
        System.out.println(shopphone.getInformationsPhone());
        
        shopphone.setPhone(new Samsung());
        System.out.println(shopphone.getInformationsPhone());
        
        shopphone.setPhone(new TCL());
        System.out.println(shopphone.getInformationsPhone());
        
        shopphone.setPhone(new Iphone());
        System.out.println(shopphone.getInformationsPhone());
    }    
}
