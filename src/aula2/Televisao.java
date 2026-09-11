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

    // Métodos de acesso e modificadores - getters() e setters()
    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        // regra de negócio / validação -> Aqui...
        this.canal = canal;
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



    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
