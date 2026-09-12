package aula2;

/**
 *
 * Encapsulamento
 *  - private - Nível mais restrito possível. Não há acesso externo. O acesso se dá através de funções públicas
 *  - protected* -
 *  - public
 */

public class Televisao {

    private int canal;
    private int volume;
    private boolean ligado;
    private String marca;

    // Métodos de acessores e modificadores - getters() e setters()
    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        // regra de negócio / validação -> Aqui...
        if(ligado) {
            if (canal >= 0 && canal <= 500) {
                this.canal = canal;
                System.out.println("Canal Alterado para " + this.canal);
            } else {
                System.out.println("[Erro]: Canal inválido!");
            }
        }else{
            System.out.println("[AVISO]: A TV está desligada!");
        }

        if(canal >= 0 && canal <=500) {
            this.canal = canal;
            System.out.println("Canal Alterado para " + this.canal);
        }else{
            System.out.println("[Erro]: Canal inválido!");
        }
    }



    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }



    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void ligar(){
        this.ligado = !this.ligado;
        if(ligado) {
            System.out.println(">>> TV ligada!");
        }else{
            System.out.println(">>> TV desligada!");
        }
    }



    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
