import Model.Cliente;
import Model.Hamburguer;
import Model.Pedido;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        String nomeLanche = "Lanche Misto";

        double precoIngrediente = 29.99;

        System.out.println("Lanche: " + nomeLanche);

        ArrayList<String> ingredientelist = new ArrayList<String>();
        ingredientelist.add("pao");
        ingredientelist.add("hamburguer");
        ingredientelist.add("queijo");
        ingredientelist.add("bacon");
        ingredientelist.add("jilo");
        ingredientelist.add("ovo");

        Hamburguer hamburguer = new Hamburguer(ingredientelist);

        System.out.println("Antes de tirar: " + Hamburguer.getIngredientes());
        Hamburguer.tirarIngredientes("jilo");
        System.out.println("Depois de tirar: " + Hamburguer.getIngredientes());

        ingredientelist.remove("jilo");
        System.out.println(ingredientelist);

        int cont_ing = 0;
        for(int cont = 0 ; cont<6 ; cont++){
            cont_ing += 1;
            System.out.println(ingredientelist.get(cont));
        }

        System.out.println("Valor: R$ " + precoIngrediente);


        //Cliente cliente = new Cliente("Jian", "Eduardo");
       // Hamburguer hamburguer = new Hamburguer(ingredientelist);

      //  Pedido pedido1 = new Pedido(cliente, hamburguer);

       // System.out.println(hamburguer.getIngredientes());
    }
}
