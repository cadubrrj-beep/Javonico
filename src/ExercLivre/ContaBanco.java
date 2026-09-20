package ExercLivre;

public class ContaBanco {

    // Atributos

    private String titular;
    private int numeroCt;
    private float saldo;
    private String tipoCt;
    private boolean status;

    // Construtores

    public ContaBanco(){
        this.titular = titular;
        this.numeroCt = numeroCt;
        this.saldo = saldo;
        this.tipoCt = tipoCt;
        this.status = status;
    }

    public ContaBanco(String titular, int numeroCt, float saldo){
        this.titular = titular;
        this.numeroCt = numeroCt;
        this.saldo = saldo;
        this.tipoCt = tipoCt;
        this.status = status;
    }

    public ContaBanco(String titular, int numeroCt, float saldo, String tipoCt, boolean status){
        this.titular = titular;
        this.numeroCt = numeroCt;
        this.saldo = saldo;
        this.tipoCt = tipoCt;
        this.status = status;
    }


    // Getters e Setters

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroCt() {
        return numeroCt;
    }

    public void setNumeroCt(int numeroCt) {
        this.numeroCt = numeroCt;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getTipoCt() {
        return tipoCt;
    }

    public void setTipoCt(String tipoCt) {
        this.tipoCt = tipoCt;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    // Outros métodos

    public void depositar(float valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(float valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= valor;
        }
    }

    public void exibirInfo(){
        System.out.println("Titular: " + titular);
        System.out.println("Número da conta: " + numeroCt);
        System.out.println("Saldo da conta: " + saldo);
        System.out.println("Tipo da conta: " + tipoCt);
        System.out.println("Situação da conta: " + status);
        System.out.println("---------");
    }
}
