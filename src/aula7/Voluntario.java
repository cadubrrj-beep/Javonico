package aula7;

// nao pode ser instanciada diretamente: new Voluntario() gera erro de compilacao
public abstract class Voluntario {
    private String nome;
    private String email;

    public Voluntario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    // Getter e Setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }





    // Metodo concreto: compartilhado por todas as subclasses
    public String getInfo(){
        return "Nome: " + this.nome + "| Email: " + this.email;
    }

    // Metodos Abstratos: não tem corpo {} (implementacao)
    // Obrigam qualquer classe filha concreta a implementar a logica
    public abstract void realizarAcao();
    public abstract double calcularHorasDedicadas();

}
