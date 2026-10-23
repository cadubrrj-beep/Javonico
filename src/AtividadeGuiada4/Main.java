package AtividadeGuiada4;

public class Main {
    public static void main(String[] args) {
        // Erro de compilação: Doacao é abstrata e não pode ser instanciada diretamente. "Doacao is abstract; cannot be instantiated"
        // Doacao doacao = new Doacao(1, "Ana", 100.0);  <---Como explicado na aula de 22Out

        DoacaoDinheiro dinheiro = new DoacaoDinheiro(1, "Ana", 100.0, "PIX");
        DoacaoSuprimento suprimento = new DoacaoSuprimento(2, "Carlos", 250.0, 10.0);

        emitirComprovante(dinheiro);
        emitirComprovante(suprimento);
    }



    public static void emitirComprovante(Doacao d) {
        System.out.println("---- Comprovante de doação ----");
        System.out.println(d.exibirResumo());

        // O Java executa os métodos da subclasse ao objeto recebido.

        d.processarDoacao();
        System.out.println("Taxa administrativa: R$ " + d.calcularTaxaAdministrativa());
        System.out.println();
    }
}
