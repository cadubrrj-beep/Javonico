import java.util.Scanner;

public class CalculaMedia {
    static void main() {

        // Declaração de variáveis
        Scanner input = new Scanner(System.in);
        String nome;
        float n1, n2, n3, media;

        //Atribuição
        System.out.print("Nome: ");
        nome = input.nextLine();
        System.out.print("Primeira nota: ");
        n1 = input.nextFloat();
        System.out.print("Segunda nota: ");
        n2 = input.nextFloat();
        System.out.print("terceira nota: ");
        n3 = input.nextFloat();

        media = (n1+n2+n3)/3;

        System.out.println(nome + ", sua média foi: " + media );
    }
}
