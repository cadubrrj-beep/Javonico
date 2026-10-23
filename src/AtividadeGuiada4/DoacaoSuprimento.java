package AtividadeGuiada4;

public class DoacaoSuprimento extends Doacao {
    private double pesoKg;

    public DoacaoSuprimento(int id, String doador, double valorBase, double pesoKg) {
        super(id, doador, valorBase);
        this.pesoKg = pesoKg;
    }



    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }



    @Override
    public double calcularTaxaAdministrativa() {
        return pesoKg * 5.0;
    }

    @Override
    public void processarDoacao() {
        System.out.println("Agendando triagem e transporte para " + pesoKg + "kg de suprimentos.");
    }
}
