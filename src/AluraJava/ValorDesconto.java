package AluraJava;

// 6. Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável,
// representando o preço original de um produto. Em seguida, declare uma variável do tipo double percentual
// Desconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor
// do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.

import java.util.Scanner;

public class ValorDesconto {
    public static void main(String []args){
        System.out.print("Digite o valor original do produto em R$: "); //imprime pergunta para
        Scanner input = new Scanner(System.in); //entrada de valor pelo usuário
        double preco = input.nextDouble(); //define valor digitado para a variavel preco

        System.out.print("Digite o valor do desconto(%): "); //entrada do desconto pelo usuario
        double inputPercentual = input.nextDouble(); //define valor digitado para a variavel inputPercentual

        double percentual = (inputPercentual / 100) * preco; //converte o valor digitado do desconto em percentual

        double totalDesconto = preco - percentual; // diminui o percentual de desconto do valor do produto
        System.out.print("O preço com desconto é: " + totalDesconto); //imprime o resultado final do valor com o desconto aplicado
    }
}
