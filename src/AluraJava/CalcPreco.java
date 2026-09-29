package AluraJava;

// 4. Declare uma variável do tipo double precoProduto e uma variável do tipo int
// (quantidade). Calcule o valor total multiplicando o preço do produto pela
// quantidade e apresente o resultado em uma mensagem.

public class CalcPreco {
    public void main(String[] args){
        double produto = 4.0;
        int quant = 4;

        double calc = produto * quant;
        System.out.println("O valor do calculo é de :"+ (int) calc);

    }
}
