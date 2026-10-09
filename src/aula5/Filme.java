package aula5;

public class Filme extends Conteudo{

    //Atributo
    private boolean indicacaoOscar;

    // Construtor
    public Filme(String titulo, String genero, int duracaoMinutos, boolean temOscar) {
        super(titulo, genero, duracaoMinutos);
        this.indicacaoOscar = indicacaoOscar;
    }

    // Get() e Set()

    public boolean isTemOscar() {
        return indicacaoOscar;
    }

    public void setTemOscar(boolean temOscar) {
        this.indicacaoOscar = indicacaoOscar;
    }

    //Exibir os dados do filme
    public void exibirDetalhes(){
        System.out.println(" ---- Exibir detalhes do filme ----");

        // Atenção: usamos o metodo getTitulo()
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Genero: " + this.getGenero());
        System.out.println("Duracao minutos: " + this.getDuracaoMinutos());

        if (this.indicacaoOscar){
            System.out.println("Filme INDICADO para o OSCAR!");
        }else{
            System.out.println("Filme Não foi INDICADO para o OSCAR!");
        }
    }
}
