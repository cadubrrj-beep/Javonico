package aula4;

public class TesteControleRemoto {
    public static void main(String[] args) {

        // Criar objeto de controle remoto

        ControleRemoto controle = new ControleRemoto();

        System.out.println(" *** Controle Remoto ***");
        System.out.println("Estado: " + controle.isLigado());
        System.out.println("Volume: " + controle.getVolume());

        System.out.println("--- Teste 1 ---");
        controle.setVolume(300);
        System.out.println("Volume: " + controle.getVolume());

        System.out.println("--- Teste 2 ---");
        controle.ligarDesligar();
        System.out.println("ligado: " + controle.isLigado());

        System.out.println("--- Teste 3 ---");
        controle.aumentarVolume();
        controle.aumentarVolume();
        System.out.println("Volume: " + controle.getVolume());
        controle.setVolume(-3);

        System.out.println("--- Teste 4 ---");
        controle.diminuirVolume();
        controle.diminuirVolume();
        controle.diminuirVolume();
        System.out.println("Volume: " + controle.getVolume());
        controle.setVolume(200);
        System.out.println("Volume: " + controle.getVolume());

        System.out.println("--- Teste 5 ---");
        controle.diminuirCanal();
        System.out.println("Canal: " + controle.getCanal());
        controle.setCanal(501);
        System.out.println("Canal: " + controle.getCanal());
    }
}
