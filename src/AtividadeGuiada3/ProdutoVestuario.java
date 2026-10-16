package AtividadeGuiada3;

public class ProdutoVestuario extends Produto {
    private double percentualDesconto;

    public ProdutoVestuario(String nome, double precoBase, double percentualDesconto) {
        super(nome, precoBase);
        this.percentualDesconto = percentualDesconto;
    }

    // Getters and setters

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    // Metodos

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() * (1 - percentualDesconto / 100.0);
    }
}
