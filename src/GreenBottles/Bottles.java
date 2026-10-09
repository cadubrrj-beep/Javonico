package GreenBottles;

public class Bottles {
    static void main(String[] args) {
        int bottlesLeft = 10;
        int bottlesFallen = 1;

        while (bottlesLeft >= 1) {
            System.out.println(bottlesLeft + " green bottles hanging on the wall,");
            System.out.println(bottlesLeft + " green bottles hanging on the wall,");
            System.out.println("If one bottle accidentally fall,");

            bottlesLeft -= bottlesFallen;

            System.out.println("There`ll be " + bottlesLeft + " green bottles hanging on the wall");
        }
    }

}
