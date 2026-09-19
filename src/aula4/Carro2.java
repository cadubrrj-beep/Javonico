package aula4;

public class Carro2 {

    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private float preco;

    //construtore padrão

    public Carro2(){
    }

    public Carro2(String marca, String modelo, int ano){
        this.marca = marca;
        this.ano = ano;
        this.modelo = modelo;
        this.cor = cor;
        this.preco = preco;
    }

    public Carro2(String marca, String modelo, int ano, String cor, float preco){
        this.marca = marca;
        this.ano = ano;
        this.modelo = modelo;
        this.cor = cor;
        this.preco = preco;
    }

    // getter e setter

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }


    // Outros métodos

    public void exibirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Preco: " + preco);
    }

}
