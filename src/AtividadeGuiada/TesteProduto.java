package AtividadeGuiada;

public class TesteProduto {

    public static void main(String[] args) {

        // 1. Construtor vazio
        Produto produto1 = new Produto();

        produto1.setNome("Livro de literatura");
        produto1.setPreco(150.00);
        produto1.setQuantidadeEstoque(10);

        // 2. Construtor parametrizado
        Produto produto2 = new Produto("Coleção Harry Potter", 350.00, 5);



        // 3. Adicionar estoque
        boolean estoqueAdicionado = produto1.adicionarEstoque(5);

        System.out.println("Estoque adicionado: " + estoqueAdicionado);



        // 4. Venda bem-sucedida
        boolean venda1 = produto1.realizarVenda(3);

        System.out.println("Venda realizada: " + venda1);



        // Quando acima do estoque
        boolean venda2 = produto2.realizarVenda(20);

        System.out.println("Venda realizada: " + venda2);



        // 5. Relatórios finais
        System.out.println("\nProduto 1:");
        produto1.exibirDetalhes();

        System.out.println("\nProduto 2:");
        produto2.exibirDetalhes();
    }
}
