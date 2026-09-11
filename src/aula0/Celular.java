package aula0;

public class Celular {

    String marca;
    int modelo;

    void ligar(){
        System.out.println("ligando...");
    }
    void desligar(){
        System.out.println("Desligando...");
    }

    //teste
    public static void main(String[] args) {
        Celular c1 = new Celular();
        c1.ligar();
        c1.desligar();
        c1.marca = "Apple";
        c1.modelo = 17;
        System.out.println(c1.marca);
        System.out.println(c1.modelo);

        Celular c2 = new Celular();
        c2.ligar();
        c2.desligar();
        c2.marca = "LG";
        c2.modelo = 21;
        System.out.println(c2.marca);
        System.out.println(c2.modelo);
    }
}
