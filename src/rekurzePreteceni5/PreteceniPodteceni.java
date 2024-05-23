package rekurzePreteceni5;

public class PreteceniPodteceni {

    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        // Overflow
        System.out.println("Priklad preteceni - overflow:");
        System.out.println("maximalni hodnota byte = " + (max));
        System.out.println("max + 1 = " + (max + 1));
        System.out.println("max + 2 = " + (max + 2));
        System.out.println("max + 3 = " + (max + 3));

        // Underflow
        System.out.println("\nPriklad podteceni - underflow");
        System.out.println("minimalni hodnota byte = " + (min));
        System.out.println("min - 1 = " + (min - 1));
        System.out.println("min - 2 = " + (min - 2));
        System.out.println("min - 3 = " + (min - 3));
    }
}

