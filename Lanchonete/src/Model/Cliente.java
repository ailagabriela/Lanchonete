package Model;
public class Cliente {
    private String nome;
    private String sobrenome;

    public Cliente(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public void Hello(){
        System.out.println("olá Mundo!");
    }
    public void Bye(){
        System.out.println("Bye Bye Baby");
    }

    public String getNomeInteiro(){
        return nome + " " + sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String ingredientes) {
        this.sobrenome = sobrenome;
    }
}
