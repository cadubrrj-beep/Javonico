package AtividadeGuiada4;

public abstract class Doacao {
    private int id;
    private String doador;
    private double valorBase;

    public Doacao(int id, String doador, double valorBase) {
        this.id = id;
        this.doador = doador;
        this.valorBase = valorBase;
    }

    // Getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDoador() {
        return doador;
    }

    public void setDoador(String doador) {
        this.doador = doador;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    // Método concreto compartilhado pelas subclasses
    public String exibirResumo() {
        return "Doação ID: " + id + " | Doador: " + doador;
    }

    public abstract double calcularTaxaAdministrativa();

    public abstract void processarDoacao();
}
