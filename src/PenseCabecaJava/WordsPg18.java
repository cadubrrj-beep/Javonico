package PenseCabecaJava;

public class WordsPg18 {
    public static void main (String[] args) {
        // Crie 3 conjuntos de palaveas que serao selecioinadas.
        // Adicione as palavras que bem entender

        String[] wordListOne = {"agnostic", "opinionated", "voice activated", "haptically driven", "extensible", "reactive", "agent based", "functioinal", "AI enabled", "strongly typed"};

        String[] wordListTwo = {"loosely coupled", "six sigma", "asynchronous", "event driven", "pub-sub", "IoT", "cloudnative", "service oriented", "containerized", "serveless", "microservices", "distributed ledger"};

        String[] wordListThree = {"framework", "library", "DSL", " REST API", "repository", "pipeline", "servicemesh", "architechture", "perspective", "design", "orientation"};

        // Descubra quantas palavras estão em cada lista
        int oneLength = wordListOne.length;
        System.out.println("Tamanho da lista 1: " + oneLength);

        int twoLength = wordListTwo.length;
        System.out.println("Tamanho da lista 2: " + twoLength);

        int threeLength = wordListThree.length;
        System.out.println("Tamanho da lista 3: " + threeLength);


        // Gere 3 numeros aleatorios
        java.util.Random randomGenerator = new java.util.Random(); // classe do java prefixada
        int rand1 = randomGenerator.nextInt(oneLength); // nextIn é um metodo do java
        System.out.println("O primeiro número aleatório é: " + rand1);

        int rand2 = randomGenerator.nextInt(twoLength);
        System.out.println("O segundo número aleatório é: " + rand2);

        int rand3 = randomGenerator.nextInt(threeLength);
        System.out.println("O terceiro número aleatório é: " + rand3);


        String phrase = wordListOne[rand1] + " " + wordListTwo [rand2] + " " + wordListThree[rand3];

        System.out.println("Precisamos de " + phrase);
    }

}
