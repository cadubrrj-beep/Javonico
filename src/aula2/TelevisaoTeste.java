package aula2;

public class TelevisaoTeste {

    public static void main(String[] args) {

        System.out.println(" --- Minha Televisão ---");

        // Criação do objeto de Televisão

        Televisao tv = new Televisao();

        System.out.println("Canal: " + tv.getCanal());
        System.out.println("Volume: " + tv.getVolume());
        System.out.println("Ligado: " + tv.getLigado());
        System.out.println("Marca: " + tv.getMarca());

        // Alterando os dados do objeto tv (de forma direta)

        //tv.canal = 30;
        tv.setCanal(50);
        //tv.volume = 1000;
        tv.setVolume(100);
        //tv.ligado = true;
        tv.setLigado(true);
        tv.setMarca("Phillips");

        System.out.println("\n------------------------\n");

        System.out.println("Canal: " + tv.getCanal());
        System.out.println("Volume: " + tv.getVolume());
        System.out.println("Ligado: " + tv.getLigado());
        System.out.println("Marca: " + tv.getMarca());

    }

}
