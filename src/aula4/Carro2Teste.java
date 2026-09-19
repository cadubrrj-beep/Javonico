package aula4;

import aula3.Personagem;

public class Carro2Teste {
    public static void main(String[] args) {

        Carro2 carroUber1 = new Carro2();
        carroUber1.exibirInfo();

        Carro2 carroUber2 = new Carro2("Honda", "Xyz", 2026);
        carroUber2.setCor("vermelho");
        carroUber2.setPreco(250000);
        carroUber2.exibirInfo();

        Carro2 carroUber3 = new Carro2("Honda", "Xyz", 2026, "vermelho", 250000);
        carroUber3.exibirInfo();
    }
}
