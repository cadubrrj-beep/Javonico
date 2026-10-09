package aula5;

//Subclasse de conteúdo (Herança)
public class Serie extends Conteudo{

    //atributo
    private int totalTemporadas;

    //Construtor
    public Serie(String titulo, String genero, int duracaoMinutos, int totalTemporadas){
        super(titulo, genero, duracaoMinutos);
        this.totalTemporadas = totalTemporadas;
    }

    // Get e Set
    public int getTotalTemporadas() {
        return totalTemporadas;
    }

    public void setTotalTemporadas(int totalTemporadas) {
        if (totalTemporadas > 0) {
            this.totalTemporadas = totalTemporadas;
        } else {
            System.out.println("Erro: Não foi possível definir a TEMPORADA!");
        }
    }

    //Exibir dados da Série
    public void exibirDetalhes(){
        System.out.println(" --- Exibir detalhes da série ---");
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Gênero: " + this.getGenero());
        System.out.println("Duração: " + this.getDuracaoMinutos());
        System.out.println("Temporadas: " + this.totalTemporadas);
    }
}
