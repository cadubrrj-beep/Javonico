package ExercLivre;

import java.util.Scanner;

public class MediaVariosAlunos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int qtdAluno;
        float media, n1, n2;
        String nome = "";

        System.out.print("Quantos alunos na sala? ");
        qtdAluno = input.nextInt();
        input.nextLine();

        while (qtdAluno > 0) {
            System.out.print("Nome do aluno: ");
            nome = input.nextLine();

            System.out.print("Nota 1: ");
            n1 = input.nextFloat();

            System.out.print("Nota 2: ");
            n2 = input.nextFloat();

            media = ((n1 + n2) / 2);

            System.out.println("Media do aluno " + nome + ", é de " + media);

            qtdAluno--;

            input.nextLine();
        }
        input.close();
    }
}

