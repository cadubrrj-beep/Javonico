package AtividadeGuiada2;

import java.util.Scanner;

public class LivroTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Livro livro = new Livro(
                "Java para Iniciantes",
                "Fernando Almeida",
                50.00
        );
        Cliente cliente = new Cliente(
                "Ana",
                "000.000.000-00",
                100.00
        );
        System.out.println("=== LIVRARIA ===");
        System.out.println("1 - Consultar dados do Livro e do Cliente");
        System.out.println("2 - Realizar a Compra do Livro");
        System.out.println("3 - Sair");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("\n=== DADOS DO LIVRO ===");
                livro.exibirDadosLivro();
                System.out.println("\n=== DADOS DO CLIENTE ===");
                System.out.println("Nome: " + cliente.getNome());
                System.out.println("CPF: " + cliente.getCpf());
                System.out.printf(
                        "Saldo atual: R$ %.2f%n",
                        cliente.getSaldoCarteira()
                );
                break;
            case 2:
                boolean pagamentoAprovado =
                        cliente.realizarPagamento(livro.getPreco());
                if (pagamentoAprovado) {
                    System.out.printf(
                            "Compra realizada com sucesso! Saldo restante: R$ %.2f%n",
                            cliente.getSaldoCarteira()
                    );
                } else {
                    System.out.println(
                            "Erro: Saldo insuficiente na carteira!"
                    );
                }
                break;
            case 3:
                System.out.println("Encerrando atendimento. Até logo!");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        scanner.close();
    }
}

