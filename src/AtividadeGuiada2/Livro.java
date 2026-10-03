package AtividadeGuiada2;

public class Livro {
    private String titulo;
    private String autor;
    private double preco;

    //Construtor vazio
    public Livro() {
    }

    //Construtor parametrizado
    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void exibirDadosLivro() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor:" + autor);
        System.out.printf("Preço: R$ %.2f%n", preco);
    }
}
