package aula8;

import java.sql.SQLOutput;
import java.util.Scanner;

// 1. (x) menu() : int
// 2. entradaDados() : float
// 3. somar(n1:float, n2:float):float
// 4. subtrair(n1:float, n2:float) : float
// 5. multiplicar(n1:float, n2:float) : float
// 6. dividir(n1:float, n2:float) : float
// 7. controlador(int op, float n1, float n2): float
// 8. imprimir(float result) : void

public class CalculadoraSimples {

    public int menu(){
        Scanner input = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("---------------------------");
            System.out.println("--- Calculadora simples ---");
            System.out.println("---------------------------");
            System.out.println("1. Adição");
            System.out.println("2. Subtcação");
            System.out.println("3. Multiplicacao");
            System.out.println("4. Divisão");
            System.out.println("Opcão: ");
            opcao = input.nextInt();

            if((opcao < 1 || opcao < 4)){
                System.out.println("Operacao inválida, digite entre 1 e 4");
            }

        }while(opcao < 1 || opcao < 4);

        return opcao;
    }

    public float entradaDados(){
        Scanner input = new Scanner(System.in);

        System.out.println("--- Entrada de dados ---");
        System.out.println("Número: ");
        float numero = input.nextFloat();
        return numero;
    }

    public float somar(float num1, float num2){
        System.out.println("---- SOMAR ----");
        return num1 + num2;
    }

    public float subtrair(float num1, float num2){
        System.out.println("--- SUBTRACAO --- ");
        return num1 - num2;
    }
    public float multiplicar(float num1, float num2){
        System.out.println("--- MULTIPLICAÇÃO --- ");
        return num1 * num2;
    }
    public float divisao(float num1, float num2){
        System.out.println("--- DIVISAO - --");
        return num1 / num2;
    }




    public void imprimir(float result) {
        System.out.println("--- IMPRIMIR ---");
        System.out.println("Resultado: " + result);
    }


    public float controlador(int opcao, float num1, float num2){
        System.out.println("--- Controlador ---");

        float resultado = 0;

        switch (opcao) {
            case 1:
                resultado = somar(num1, num2);
                break;
            case 2:
                resultado = subtrair(num1, num2);
                break;
            case 3:
                resultado = multiplicar(num1, num2);
                break;
            case 4:
                resultado = divisao(num1, num2);
                break;
            default:
                break;
        }
        return resultado;
    }


}
