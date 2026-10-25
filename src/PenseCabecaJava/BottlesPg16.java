package PenseCabecaJava;

//public class Bottles {
//    static void main(String[] args) {
//        int bottlesLeft = 10;
//        int bottlesFallen = 1;
//
//        while (bottlesLeft >= 1) {
//            System.out.println(bottlesLeft + " green bottles hanging on the wall,");
//            System.out.println(bottlesLeft + " green bottles hanging on the wall,");
//            System.out.println("If one bottle accidentally fall,");
//
//            bottlesLeft -= bottlesFallen;
//
//            System.out.println("There`ll be " + bottlesLeft + " green bottles hanging on the wall");
//        }
//    }
//}

// Livro Use a cabeca: Java (Pg. 16)

public class BottlesPg16 {
    public static void main(String[] args) {
        int bottlesNum = 10;
        String word = "bottles";

        while (bottlesNum >= 0) {

            System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
            System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
            System.out.println("And if one green bottle should accidentally fall,");
            bottlesNum = bottlesNum - 1;

            if (bottlesNum == 1) {
                word = "bottle"; // No singular, UMA garrafa (bottle)
                System.out.println("There`ll be " + bottlesNum + " green " + word + ", hanging on the wall");
            } else {
                System.out.println("There`ll be no green bottles, hanging on the wall");
            } // Fim do else
        } // Fim do loop while
    } // Fim do metodo main
} // Fim das classe