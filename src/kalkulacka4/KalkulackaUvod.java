package kalkulacka4;

import java.util.Scanner;

public class KalkulackaUvod {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Zadejte první číslo. ");
        float a = Float.parseFloat(sc.nextLine());
        System.out.println("Zadejte druhé číslo: ");
        float b = Float.parseFloat(sc.nextLine());

        float soucet = a + b;
        float rozdil = a - b;
        float soucin = a * b;
        float podil = a / b;

        System.out.println("Soucet: " + soucet);
        System.out.println("Rozdil: " + rozdil);
        System.out.println("Soucin: " + soucin);
        System.out.println("Podil: " + podil);

    }
}

