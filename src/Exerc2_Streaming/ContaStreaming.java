/*
xercício 2: Conta de Streaming de Vídeo 🎬   Objetivo: Praticar estado do objeto (booleano) e controle de fluxo.
Contexto: Crie uma classe chamada ContaStreaming.   Atributos privados: usuario (String), planoAtivo (boolean),
perfilInfantil (boolean).   Regras de negócio:   Crie um construtor que recebe apenas o nome do usuario. O planoAtivo
começa como false e o perfilInfantil como false.   Crie métodos para ativarAssinatura() e cancelarAssinatura().
Crie o metodo assistirFilme(int classificacaoEtaria):   Se o plano não estiver ativo, exiba: "Assinatura inativa.
Por favor, realize o pagamento." Se o plano estiver ativo, mas o perfilInfantil for true e a
classificacaoEtaria for maior que 12 anos, exiba: "Acesso bloqueado pelo Controle dos Pais."
Caso contrário, exiba: "Reproduzindo filme..."
*/

package Exerc2_Streaming;

public class ContaStreaming {
    private String usuario;
    private boolean planoAtivo;
    private boolean perfilInfantil;

// Construtores
    public ContaStreaming(String usuario) {
        this.usuario = "";
        this.planoAtivo = false;
        this.perfilInfantil = false;
    }

// Setter & Getters
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public boolean isPlanoAtivo() {
        return planoAtivo;
    }

    public void setPlanoAtivo(boolean planoAtivo) {
        this.planoAtivo = planoAtivo;
    }

    public boolean isPerfilInfantil() {
        return perfilInfantil;
    }

    public void setPerfilInfantil(boolean perfilInfantil) {
        this.perfilInfantil = perfilInfantil;
    }


    //Métodos
    public void ativarAssinatura() {
        if (planoAtivo) {
            System.out.println("A conta já está ativa");
        } else {
            planoAtivo = true;
            System.out.println("Ativando conta");
        }
    }

    public void cancelarAssinatura() {
        if (!planoAtivo) {
            System.out.println("A assinatura não está ativa");
        } else {
            planoAtivo = false;
            System.out.println("Cancelando assinatura");
        }
    }

    public void assistirFilme(int classificacaoEtaria) {
        if (!planoAtivo) {
            System.out.println("Assinatura inativa. Por favor, realize o pagamento.");
        } else if (perfilInfantil && classificacaoEtaria > 12) {
            System.out.println("Acesso bloqueado pelo Controle dos Pais");
        } else {
            System.out.println("Reproduzindo filme...");
        }
    }


}




