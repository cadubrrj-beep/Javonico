package aula7;

public class DentistaVoluntario extends Voluntario{

    private String cro;
    private int consultasRealizadas;

    public DentistaVoluntario(String nome, String email, String cro, int consultasRealizadas) {
        super(nome, email);
        this.cro = cro;
        this.consultasRealizadas = consultasRealizadas;
    }

    @Override
    public void realizarAcao() {
        System.out.println("Realizando atendimento odontologico com o CRO" + this.cro);
    }

    @Override
    public double calcularHorasDedicadas() {
        return this.consultasRealizadas * 1.5; // Média de atendimento
    }
}
