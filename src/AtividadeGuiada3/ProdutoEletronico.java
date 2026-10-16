package AtividadeGuiada3;

public class ProdutoEletronico extends Produto {
    private double taxaGarantiaEstendida;

    public ProdutoEletronico(String nome, double precoBase, double taxaGarantiaEstendida) {
        super(nome, precoBase);
        this.taxaGarantiaEstendida = taxaGarantiaEstendida;
    }

    //Getters and setters

    public double getTaxaGarantiaEstendida() {
        return taxaGarantiaEstendida;
    }

    public void setTaxaGarantiaEstendida(double taxaGarantiaEstendida) {
        this.taxaGarantiaEstendida = taxaGarantiaEstendida;
    }

    // Metodos

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() * 1.10 + taxaGarantiaEstendida;
    }
}
