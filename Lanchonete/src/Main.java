import Model.Cliente;
import Model.Hamburguer;

public class Main{
    public static void main(String[] args){
        Hamburguer hamburguer = new Hamburguer("pão", "alface", "bacon", "ovo");

        System.out.println(hamburguer.gethamburgao());

    }
}
