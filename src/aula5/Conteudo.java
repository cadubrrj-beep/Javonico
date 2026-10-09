package aula5;

public class Conteudo {

    // atributos
    private String titulo;
    private String genero;
    private int duracaoMinutos;

    //Construtor da Super Classe
    public Conteudo(String titulo, String genero, int duracaoMinutos) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracaoMinutos = duracaoMinutos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        if (duracaoMinutos > 0) {
            this.duracaoMinutos = duracaoMinutos;
        } else {
            System.out.println("Erro: o tempo de duracao deve ser positiva");
        }
    }

    // Metodo comum que ambas as filhas herdarão
    public void darPlay() {
        System.out.println("o conteúdo " + this.titulo + " está carregando...");
        System.out.println("Aeeeeee... carregando em 3min!");
    }


}
