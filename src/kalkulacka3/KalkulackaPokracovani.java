package kalkulacka3;

import java.util.Scanner;

public class KalkulackaPokracovani {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Zadejte první číslo. ");
        float a = Float.parseFloat(sc.nextLine());
        System.out.println("Zadejte druhé číslo. ");
        float b = Float.parseFloat(sc.nextLine());
        System.out.println("Vyberte: sčítání - 1, odčítání - 2, násobení - 3, dělení - 4 .");
        int volba = Integer.parseInt(sc.nextLine());

        float soucet = a + b;
        float rozdil = a - b;
        float soucin = a * b;
        float podil = a / b;
        float vysledek = 0;
        switch (volba) {
            case 1:
                vysledek = soucet;
                break;
            case 2:
                vysledek = rozdil;
                break;
            case 3:
                vysledek = soucin;
                break;
            case 4:
                vysledek = podil;
                break;
        }
        System.out.println("Výsledek:  " + vysledek);
    }
}

