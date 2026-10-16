package AtividadeGuiada3;

public class Main {
    public static void main(String[] args) {
        Produto generico = new Produto("Caderno", 20.0);
        ProdutoEletronico eletronico = new ProdutoEletronico("Fone de ouvido", 200.0, 50.0);
        ProdutoVestuario vestuario = new ProdutoVestuario("Camiseta", 100.0, 15.0);

        System.out.println("--- Etiquetas dos produtos ---");
        Caixa.imprimirEtiqueta(generico);
        Caixa.imprimirEtiqueta(eletronico);
        Caixa.imprimirEtiqueta(vestuario);

        System.out.println("--- Compra ---");
        Caixa.simularCompraPorCategoria(1, "Notebook Gamer", 4000.0);
    }
}
