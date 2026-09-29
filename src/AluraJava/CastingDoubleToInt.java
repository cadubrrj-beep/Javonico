package AluraJava;

// 2. Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.

public class CastingDoubleToInt {
    public static void main(String[] args){
        double valorDouble = 2.0;
        int valorInt = 2;

        System.out.println("Valor original da double: " + valorDouble);
        System.out.println("Valor original da int: " + valorInt);
        System.out.println("----------------------------------------");

        System.out.println("Valor convertido da Double: " + (int) valorDouble);
        System.out.print("Valor convertido da Int: " + (double) valorInt);
    }
}
