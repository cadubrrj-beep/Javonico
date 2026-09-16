package ExercLivre;

public class Veiculo {

    private boolean motor;
    private boolean farol;
    private String portas;
    private String travas;
    private double velocidade;

    // Métodos de acesso e modificadores - getters() e setters()
    public boolean getMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        // regra de negócio / validação -> Aqui...
        this.motor = motor;

        if (motor) {
            farol = true;
        }
    }



    public boolean getFarol() {
        return farol;
    }

    public void setFarol(boolean farol) {
        this.farol = farol;
    }



    public String getPortas() {
        return portas;
    }

    public void setPortas(String portas) {
        this.portas = portas;
    }



    public String getTravas() {
        return travas;
    }

    public void setTravas(String travas) {
        this.travas = travas;
    }



    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
}
