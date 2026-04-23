package Model;

public class Cliente {

    private String Nome;
    private String sobrenome;

    public Cliente(String nome, String sobrenome) {
        Nome = nome;
        this.sobrenome = sobrenome;
    }

    public  void Hello(){
        System.out.println("ola mundo!");

    }
    public  void Bye(){
        System.out.println(" Bye Bye baby!");
    }
    public String getNomeinteiro() {
        return Nome + " " + sobrenome;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }


}
