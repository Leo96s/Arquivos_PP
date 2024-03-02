/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste_01;

/**
 *
 * @author Leonardo
 */
public class TesteManagement {
    
    private Teste[] teste;
    
    private int count;

    public TesteManagement() {
        this.teste = new Teste[2];
    }
    
    public void extendtest(){
        Teste[] temp = new Teste[this.count * 2];
        
        for(int i = 0; i < this.count; i++){
            temp[i] = this.teste[i];
        }
        
        this.teste = temp;
    }
    
    public boolean isequal(Teste teste){
        for(Teste temp: this.teste){
            if(temp !=null && temp.equals(teste)){
                return true;
            }
        }
        return false;
    }
    
    
    public void addtest(Teste teste){
        if(this.count == this.teste.length){
            extendtest();
        }
        
        if(!this.isequal(teste)){
            this.teste[count++] = teste;
        }
        
    }
    
    public void deletetest(int index){
        for(int i = index; i < this.count; i++){
                this.teste[i] = this.teste[i + 1];
            }
            this.count--;
            this.teste[this.count] = null;
    }
    
    public void searchTest(String name){
        
    }

    @Override
    public String toString(){
        String teste = "";
        
        for(Teste temp: this.teste){
            if(temp != null){
                if(temp.getDatebirth() != null){
                    teste+= "Teste{" + "id=" + temp.getId() + ", name=" + temp.getName() + 
                            ", datebirth=" + temp.getDatebirth() + ", nationality=" + temp.getNationality() + '}';
                }
                else{
                    teste+= "Teste{" + "id=" + temp.getId() + ", name=" + temp.getName() + '}'; 
                }
            }
        }
        
        return teste;
            
    }
}
    
   
