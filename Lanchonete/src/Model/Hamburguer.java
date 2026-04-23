package Model;

public class Hamburguer {
    public String ingredientes;
    public String ingredientes2;
    public String ingredientes3;
    public String ingredientes4;

    public Hamburguer(String ingredientes, String ingredientes2, String ingredientes3, String ingredientes4) {
        this.ingredientes = ingredientes;
        this.ingredientes2 = ingredientes2;
        this.ingredientes3 = ingredientes3;
        this.ingredientes4 = ingredientes4;
    }

    public String gethamburgao(){
        return ingredientes + " " + ingredientes2 + " " + ingredientes3 + " " + ingredientes4;
    }
}
