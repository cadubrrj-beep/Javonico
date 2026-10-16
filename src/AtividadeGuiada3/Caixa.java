package AtividadeGuiada3;

public class Caixa {

    public static void imprimirEtiqueta(Produto produto) {
        System.out.println("Produto: " + produto.getNome());
        System.out.printf("Preco base: R$ %.2f%n", produto.getPrecoBase());
        System.out.printf("Preco final: R$ %.2f%n", produto.calcularPrecoFinal());
        System.out.println("------------------------------");
    }

    public static void simularCompraPorCategoria(int opcao, String nome, double precoBase) {
        Produto produto;

        if (opcao == 1) {
            produto = new ProdutoEletronico(nome, precoBase, 50.0);
        } else if (opcao == 2) {
            produto = new ProdutoVestuario(nome, precoBase, 15.0);
        } else {
            produto = new Produto(nome, precoBase);
        }

    imprimirEtiqueta(produto);
}
}
