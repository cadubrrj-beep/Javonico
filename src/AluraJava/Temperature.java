package AluraJava;

import java.util.Scanner;

public class Temperature {
    static void main(String[] args) {
        Scanner celsius = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius para ser convertida em Fahrenheit: ");
        double tempCelsius = celsius.nextDouble();
        //int tempCelsius = (int) celsius.nextDouble();

        double tempFahrenheit = (tempCelsius * 1.8) + 32;

        System.out.println("A temperatura em Fahrenheit é: " + (int) tempFahrenheit);

        celsius.close();
    }
}
