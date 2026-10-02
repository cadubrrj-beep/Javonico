package AtividadeGuiada;

public class Produto {

        //Atributos
        private String nome;
        private double preco;
        private int quantidadeEstoque;

        // Construtores

        // Construtor padrão
        public Produto(){
            //parâmetros vazios com os parênteses sem conteúdo

            //atributos do objeto e o nome definido como "sem nome"
            this.nome = "Sem nome";
            this.preco = 0.0;
            this.quantidadeEstoque = 0;
        }

        // Construtor parametrizado
        public Produto(String nome, double preco, int quantidadeEstoque){
            //parâmetros dentro dos parÊnteses

            //atributos do objeto
            this.nome = nome;
            this.preco = preco;
            this.quantidadeEstoque = quantidadeEstoque;
        }

        // Getters e Setters

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getPreco() {
            return preco;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

        public int getQuantidadeEstoque() {
            return quantidadeEstoque;
        }

        public void setQuantidadeEstoque(int quantidadeEstoque) {
            this.quantidadeEstoque = quantidadeEstoque;
        }



        // Metodo de exibição

        public void exibirDetalhes() {
            System.out.println("Nome: " + nome);
            System.out.println("Preço: R$ " + preco);
            System.out.println("Quantidade em estoque: " + quantidadeEstoque);
            //impressão na tela dos atributos via um metodo
        }

        // Metodo operacional

        public boolean adicionarEstoque(int qtd) {

            // Regra de Negócio: A quantidade a ser adicionada deve ser estritamente maior que zero (> 0).
            if (qtd > 0) {
                // se a quantidade for maior que zero
                this.quantidadeEstoque += qtd;
                //quantidadeEstoque será somado de quantidade
                return true;
            } else {
                return false;
            }
        }



        public boolean realizarVenda(int qtd) {

            // Regra de Negócio: A quantidade da venda deve ser maior que zero e menor ou igual à quantidade disponível em quantidadeEstoque (evitando estoque negativo).
            // Validando quantidade e estoque
            if (qtd > 0 && qtd <= this.quantidadeEstoque) {
                //se a quantidade for maior que zero E menor ou igual a quantidade Estoque
                this.quantidadeEstoque -= qtd;
                //quantidadeEstoque é subtraído de quantidade
                return true;
            } else {
                return false;
            }
        }


}
