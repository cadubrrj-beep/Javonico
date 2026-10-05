package Exerc2_Streaming;

public class ContaStreaming {
    String usuario;
    boolean planoAtivo;
    boolean perfilInfantil;

// Construtores
    public void perfilTipo(String usuario, boolean planoAtivo, boolean perfilInfantil) {
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
    public boolean ativarAssinatura() {
        if (planoAtivo) {
            System.out.println("A conta já está ativa");
        } else {
            planoAtivo = true;
            System.out.println("Ativando conta");
        }
    }

}




