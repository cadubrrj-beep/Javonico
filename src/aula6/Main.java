package aula6;

public class Main {

    //Metodo que aceita qualquer notificacao - O coracao do polimorfismo
    public static void dispararAlerta(Notificacao notificacao) {
        System.out.println("\n [Sistema de alerta]");
        notificacao.enviar(); //O Java decide em tempo de execucao qual metodo enviar() será chamado.
    }





    public static void main(String[] args) {

        // Declaração de tipo genérico (Generics)
        Notificacao n1 = new Email("aluno@fiap.com.br", "CP realizado com sucesso", "Aviso importante!"); //variável n1 é do tipo notificacao e cria um novo EMAIL
        // generalizacao (notificacao) <-> Especializacao (email)

        Notificacao n2 = new SMS("11 99999-9999", "Aula de hoje, não se atrase!"); //variável n1 é do tipo notificacao e cria um novo EMAIL

        // Chamada Direta. Escrevendo direto o metodo enviar
        n1.enviar();
        n2.enviar();

        // Usando o metodo Polomorfismo com condicionais simples. Sobrescrevendo o metodo enviar
        dispararAlerta(n1);
        dispararAlerta(n2);

        // Usando o metodo polimorfico com condicionais
        // 1 - Email
        // 2 - SMS
        int tipoCanal = 1; //trocar o número de 1 para 2 muda para SMS. Ela que controla o if / else
        Notificacao notificacaoEscolhida = null;

        if(tipoCanal == 1) {
            notificacaoEscolhida = new Email("aluno2@fiap.com.br", "Alô, turma!", "Aula de Java");
        }else if(tipoCanal == 2) {
            notificacaoEscolhida = new SMS("1197777-1111", "Aula de hoje - Estamos quase terminando...");
        }

        // Nao importa o tipo do dado Concreto, o metodo trata TODOS como notificacao
        dispararAlerta(notificacaoEscolhida);


    }

}
