package kalkulacka3;

import java.util.Scanner;

public class KalkulackaVylepseni {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        System.out.println("Vítejte v kalkulačce.");
        String pokracovat = "ano";
        while (pokracovat.equals("ano")) {

            System.out.println("Zadejte první číslo. ");
            float a = Float.parseFloat(sc.nextLine());

            System.out.println("Zadejte druhé číslo: ");
            float b = Float.parseFloat(sc.nextLine());

            System.out.println("Vyberte: sčítání - 1, odčítání - 2, násobení - 3, dělení - 4 .");
            int volba = Integer.parseInt(sc.nextLine());

            float vysledek = 0;
            switch (volba) {
                case 1:
                    vysledek = a + b;
                    break;
                case 2:
                    vysledek = a - b;
                    break;
                case 3:
                    vysledek = a * b;
                    break;
                case 4:
                    vysledek = a / b;
                    break;
            }
            if ((volba > 0) && (volba < 5)) {
                System.out.println("Výsledek:  " + vysledek);
            } else {
                System.out.println("Neplatné zadání. ");
            }
            System.out.println("Chcete pokračovat? [ano/ne]");
            pokracovat = sc.nextLine();
        }
        System.out.println("Děkuji za použití kalkulačky.");
    }
}

