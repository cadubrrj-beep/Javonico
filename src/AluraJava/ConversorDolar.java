package AluraJava;

import java.util.Scanner;

// 5. Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável.
// Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares
// para reais e imprima o resultado formatado.

public class ConversorDolar {
    public void main(String[] args){
        Scanner multi = new Scanner(System.in);

        System.out.print("Digite o valor a ser convertido em dólares: ");
        double valorEmDolares = 4.94;
        double unidade = multi.nextDouble();
        double resultado = (unidade * valorEmDolares);
        System.out.printf("O resultado é : %.2f", resultado);


    }
}
