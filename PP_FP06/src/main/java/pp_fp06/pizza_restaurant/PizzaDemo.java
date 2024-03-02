/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.pizza_restaurant;
import pp_fp06.pizza_restaurant.enums.Origem;
import pp_fp06.pizza_restaurant.enums.Tamanho_P;

/**
 *
 * @author Leonardo
 */
public class PizzaDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Ingredientes ing1 = new Ingredientes("Queijo", Origem.ANIMAL, 125);
        Ingredientes ing2 = new Ingredientes("Sal", Origem.MINERAL, 1);
        Ingredientes ing3 = new Ingredientes("Fiambre", Origem.ANIMAL, 125);
        Ingredientes ing4 = new Ingredientes("Pepperoni", Origem.ANIMAL, 125);
        Ingredientes ing5 = new Ingredientes("Bacon", Origem.ANIMAL, 125);
        
        Ingredientes[] ig1 = {ing1, ing2, ing3}, ig2 = {ing1, ing3, ing5};
        
        Pizza piz1 = new Pizza("Pizza de Queijo e Fiambe", "Pizza1", 24, Tamanho_P.MEDIUM);
        Pizza piz2 = new Pizza("Pizza de Pepperoni", "Pizza2", 30, Tamanho_P.MEDIUM);
        
        Ementa ementa = new Ementa("Ementa1", "Ementa variavel", "2023-01-23", "2023-02-23");
        
        piz1.setIngrediente(ig1);
        piz2.setIngrediente(ig2);
        
        Pizza[] p = {piz1, piz2};
        
        ementa.setPizzas(p);

        printEmenta(ementa);
        
    }
    static void printEmenta(Ementa ementa){
        System.out.println("Id: " + ementa.getId());
        System.out.println("Designacao: " + ementa.getDesignacao());
        System.out.println("Descricao: " + ementa.getDescricao());
        System.out.println("Data inicio: " + ementa.getDataInic());
        System.out.println("Data fim: " + ementa.getDataFim());
        
        Pizza[] pizza = ementa.getPizzas();

        for(Pizza _pizza : pizza){
            System.out.println("-------------");
            System.out.println("Codigo: " + _pizza.getcodigo());
            System.out.println("Nome: " + _pizza.getNome());
            System.out.println("Descricao: " + _pizza.getDescricao());
            System.out.println("Preco: " + _pizza.getpreco());
            System.out.println("Tamanho: " + Tamanho_P.pizzaToString(_pizza.getTamanho()));
            Ingredientes[] ing = _pizza.getIngredientes();
            for(Ingredientes _ing : ing){
                System.out.println("Ingredientes da pizza: ");
                System.out.println("Codigo: " + _ing.getCodigo());
                System.out.println("Nome: " + _ing.getNome());
                System.out.println("Origem: " + Origem.origemToString(_ing.getOrigem()));
                System.out.println("Calorias: " + _ing.getcalorias());
                
            }
        }
        
    }
    
}
