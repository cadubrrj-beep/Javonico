package aula5;

public class Main {
    public static void main(String[] args) {

        //1. Instanciando e testando um Filme
        Filme meuFilme = new Filme("Interestelar", "Ficção científica", 170, true);
        meuFilme.exibirDetalhes(); //metodo da classe local, do filme
        meuFilme.darPlay(); //metodo herdado

        System.out.println("\n ------------------------------------------------------------------------------------- \n");

        //2. Instanciando e testando uma Série
        Serie minhaSerie = new Serie("BreakingBad", "Drama", 45, 5);
        minhaSerie.exibirDetalhes();
        minhaSerie.darPlay(); // O mesmo metodo herdado e rodando na serie


    }
}
