package AluraJava;

import java.util.Scanner;

public class CalculadoraArea {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha = 0; // inicia a variável escolha

        while (escolha != 3) {
            System.out.println("----Menu----");
            System.out.println("1. Calcular área do quadrado");
            System.out.println("2. Calcular área do círculo");
            System.out.println("3. Sair");
            System.out.println("Escolha uma opção: ");
            escolha = scanner.nextInt();

            if (escolha == 1) { //Tá fazendo aqui um match case com if-else
                System.out.println("Digite o lado do quadrado: ");
                double lado = scanner.nextDouble(); //abrindo o input de dados pelo usuario e guardando na variável com tipagem double "lado"
                double areaQuadrado = lado * lado;
                System.out.println("Área do quadrado: " + areaQuadrado);
            } else if (escolha == 2) {
                System.out.println("Digite o raio do círculo: ");
                double raio = scanner.nextDouble();
                double areaCirculo = 3.14 * raio * raio;
                System.out.println("Área do círculo: " + areaCirculo);
            } else if (escolha == 3) {
                System.out.println("Programa encerrado");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
