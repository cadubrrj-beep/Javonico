package aula4;

public class ControleRemoto {

    // Atributos

    private boolean ligado;
    private int volume;
    private int canal;

    // Construtores
    public ControleRemoto(){
        this.ligado = false;
        this.volume = 10;
        this.canal = 0;
    }

    public ControleRemoto(boolean ligado, int volume, int canal){
        this.ligado = ligado;
        this.volume = volume;
        this.canal = canal;
    }



    // Getters and Setters

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        // validação simples com condicionais
        if(volume >= 0 && volume <= 100){
            this.volume = volume;
            System.out.println("Volume alterado: " + volume);
        } else{
            System.out.println("Volume inválido");
        }
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        // validação simples com condicionais
        if(canal >= 0 && canal <= 500){
            this.canal = canal;
            System.out.println("Canal alterado: " + canal);
        } else{
            System.out.println("Canal inválido");
        }
    }


    // Metodos operacionais - Lógica condicional

    // Metodo ligar e desligar a TV
        public void ligarDesligar(){
            this.ligado = !this.ligado; // inverte o valor do booleano
            if(this.ligado) {
                System.out.println("TV LIGADA!");
            } else{
                System.out.println("TV DESLIGADA!");
            }
        }

    //Aumentar volume (+1)
        public void aumentarVolume(){
            if(!this.ligado){
                System.out.println("Erro: TV DESLIGADA!");
            }else if (this.volume >= 100){
                System.out.println("Aviso: Volume máximo (100)");
            }else {
                this.volume = this.volume +=1;
                //this.volume = this.volume + 1;
                // this.volume++;
            }
        }

    //Diminuir volume (-1)
        public void diminuirVolume(){
            if(!this.ligado){
                System.out.println("Erro: TV DESLIGADA!");
            }else if (this.volume <= 0){
                System.out.println("Aviso: A TV ESTÁ NO MÍNIMO (0)");
            }else {
                this.volume = this.volume -=1;
                //this.volume = this.volume - 1;
                // this.volume--;
                System.out.println("Volume diminuido para: " + this.volume);
            }
        }


    //Aumentar canal (+1)
    public void aumentarCanal(){
        if(!this.ligado){
            System.out.println("Erro: TV DESLIGADA!");
        }else if (this.canal >= 500){
            System.out.println("Aviso: Canal máximo alcançado (500)");
        }else {
            this.canal = this.canal +=1;
            //this.canal = this.canal + 1;
            // this.canal++;
        }
    }

    //Diminuir canal (-1)
    public void diminuirCanal(){
        if(!this.ligado){
            System.out.println("Erro: TV DESLIGADA!");
        }else if (this.canal <= 0){
            System.out.println("Aviso: A TV ESTÁ NO CANAL (0)");
        }else {
            this.canal = this.canal -=1;
            //this.volume = this.volume - 1;
            // this.volume--;
            System.out.println("Canal reduzido para: " + this.canal);
        }
    }


}
