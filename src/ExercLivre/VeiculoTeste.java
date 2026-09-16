package ExercLivre;

public class VeiculoTeste {

    public static void main(String[] args) {

        System.out.println(" --- Status do veículo ---");

        // Criação dos objetos do Carro

        Veiculo carro = new Veiculo();

        System.out.println("Motor: " + carro.getMotor());
        System.out.println("Farol: " + carro.getFarol());
        System.out.println("Portas: " + carro.getPortas());
        System.out.println("Travas: " + carro.getTravas());
        System.out.println("Velocidade: " + carro.getVelocidade());

        // Alterando os dados do objeto carro (de forma direta)

        carro.setMotor(true);
        //carro.setFarol(false);
        carro.setPortas("fechadas");
        carro.setTravas("fechadas");
        carro.setVelocidade(0);

        System.out.println("\n------------------------\n");

        System.out.println("Motor: " + carro.getMotor());
        System.out.println("Farol: " + carro.getFarol());
        System.out.println("Porta: " + carro.getPortas());
        System.out.println("Trava: " + carro.getTravas());
        System.out.println("Velocidade: " + carro.getVelocidade());

    }

}
