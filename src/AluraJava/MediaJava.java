package AluraJava;

// 1. Crie um programa que realize a média de duas notas decimais e exiba o resultado.

import java.util.Scanner;

public class MediaJava {
    public static void main(String[] args) {
        Scanner notaInput = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = notaInput.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = notaInput.nextDouble();

        double media = ((nota1 + nota2) /2);

        System.out.println("A média é: "+media);
    }
}
