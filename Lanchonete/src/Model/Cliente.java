package Model;
public class Cliente {
    private String nome;
    private String ingredientes;

    public Cliente(String nome, String ingredientes) {
        this.nome = nome;
        this.ingredientes = ingredientes;
    }

    public void Hello(){
        System.out.println("olá Mundo!");
    }
    public void Bye(){
        System.out.println("Bye Bye Baby");
    }

    public String getNomeInteiro(){
        return nome + " " + ingredientes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
}
