package AluraJava;

import java.util.Scanner; // chama lib de entrada de dados do usuário

public class Tabuada {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in); //cria nova instância baseada nessa lib scanner.

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt(); // cria variável que recebe o conteúdo dessa instância scanner

        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) { // Define i como 1 e estabelece que enquanto i for menor ou igual que 10 vai rodar essa parte do programa. A cada nova rodada adiciona 1 ao valor de i.
            System.out.println(numero + " x " + i + " = " + (numero * i)); // Concatenacao as variaveis
        }
    }
}



