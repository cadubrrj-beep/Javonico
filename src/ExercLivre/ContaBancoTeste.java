package ExercLivre;

public class ContaBancoTeste {
    public static void main(String[] args) {

        ContaBanco novaConta = new ContaBanco();
        novaConta.exibirInfo();

        ContaBanco novaContaJr = new ContaBanco("Cecilia",1100,10);
        novaContaJr.exibirInfo();

        ContaBanco novaContaPF = new ContaBanco("Carlos",708,150,"PF",true);
        novaContaPF.exibirInfo();

        novaContaPF.depositar(317);
        novaContaPF.exibirInfo();

        novaContaPF.sacar(300);
        novaContaPF.exibirInfo();
    }
}