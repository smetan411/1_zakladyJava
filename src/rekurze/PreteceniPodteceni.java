package rekurze;

public class PreteceniPodteceni {


    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        // Overflow

        System.out.println("Overflow example:");
        System.out.println("max = " + (max));
        System.out.println("max + 1 = " + (max + 1)); // This will print "-2147483648"
        System.out.println("max + 2 = " + (max + 2)); // This will print "-2147483647"
        System.out.println("max + 3 = " + (max + 3)); // This will print "-2147483646"

        // Underflow
        System.out.println("\nUnderflow example:");
        System.out.println("min = " + (min));
        System.out.println("min - 1 = " + (min - 1)); // This will print "2147483647"
        System.out.println("min - 2 = " + (min - 2)); // This will print "2147483646"
        System.out.println("min - 3 = " + (min - 3)); // This will print "2147483645"
    }
}

