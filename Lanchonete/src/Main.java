import Model.Cliente;
import Model.Hamburguer;
import Model.Pedido;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args){

        ArrayList<String> ingredientelist = new ArrayList<String>();
        ingredientelist.add("pao");
        ingredientelist.add("hamburguer");
        ingredientelist.add("queijo");
        ingredientelist.add("bacon");
        ingredientelist.add("jilo");
        ingredientelist.add("ovo");


        Cliente cliente = new Cliente("Aila", "Gabriela");
        Hamburguer hamburguer = new Hamburguer(ingredientelist);

        Pedido pedido1 = new Pedido(cliente, hamburguer);

        System.out.println(hamburguer.getIngredientes());
    }
}
