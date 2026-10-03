package AtividadeGuiada2;

public class Cliente {

    private String nome;
    private String cpf;
    private double saldoCarteira;

    // Construtor vazio
    public Cliente() {
    }

    // Construtor parametrizado
    public Cliente(String nome, String cpf, double saldoCarteira) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldoCarteira = saldoCarteira;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldoCarteira() {
        return saldoCarteira;
    }

    public void setSaldoCarteira(double saldoCarteira) {
        this.saldoCarteira = saldoCarteira;
    }

    public boolean realizarPagamento(double valor) {
        if (saldoCarteira >= valor) {
            saldoCarteira -= valor;
            return true;
        } else {
            return false;
        }
    }
}
