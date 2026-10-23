package aula7;

public class EducadorVoluntario extends Voluntario{
    private int oficinaMinistradas;


    public EducadorVoluntario(String nome, String email, int oficinaMinistradas) {
        super(nome, email);
        this.oficinaMinistradas = oficinaMinistradas;
    }


    public int getOficinaMinistradas() {
        return oficinaMinistradas;
    }

    public void setOficinaMinistradas(int oficinaMinistradas) {
        this.oficinaMinistradas = oficinaMinistradas;
    }

    @Override
    public void realizarAcao() {
        System.out.println("Ministrando oficina de higiene bucal e prevencao");
    }

    @Override
    public double calcularHorasDedicadas() {
        return oficinaMinistradas * 2.0; //Media de 2h por oficina
    }
}
