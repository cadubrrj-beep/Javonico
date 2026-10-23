package AtividadeGuiada4;

public class DoacaoDinheiro extends Doacao {
    private String meioPagamento;

    public DoacaoDinheiro(int id, String doador, double valorBase, String meioPagamento) {
        super(id, doador, valorBase);
        this.meioPagamento = meioPagamento;
    }


    public String getMeioPagamento() {
        return meioPagamento;
    }

    public void setMeioPagamento(String meioPagamento) {
        this.meioPagamento = meioPagamento;
    }



    @Override
    public double calcularTaxaAdministrativa() {
        return getValorBase() * 0.02;
    }

    @Override
    public void processarDoacao() {
        System.out.println("Processando doação via " + meioPagamento + "...");
    }
}
