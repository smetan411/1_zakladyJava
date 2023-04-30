package kalkulacka2;

import java.util.Scanner;

public class KalkulackaVylepseni {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("Vítejte v kalkulačce.");
        String pokracovat = "ano";
        while (pokracovat.equals ("ano")){

            System.out.println("Zadejte první číslo. ");
            float a = Float.parseFloat(sc.nextLine());

            System.out.println("Zadejte druhé číslo: ");
            float b = Float.parseFloat(sc.nextLine());

            System.out.println("Vyberte: sčítání - 1, odčítání - 2, násobení - 3, dělení - 4 .");
            int volba = Integer.parseInt(sc.nextLine());
            float soucet = a + b;
            float rozdil = a - b;
            float soucin = a * b;
            float podil = a / b;
            float vysledek = 0;
            switch (volba){
                case 1: vysledek = soucet;
                    break;
                case 2: vysledek = rozdil;
                    break;
                case 3: vysledek = soucin;
                    break;
                case 4: vysledek = podil;
                    break;
            }
            if ((volba > 0) && (volba < 5)) {
                System.out.println("Výsledek:  " + vysledek);
            }
            else {
                System.out.println("Neplatné zadání. ");
            }
            System.out.println("Chcete pokračovat? [ano/ne]");
            pokracovat = sc.nextLine();
        }
        System.out.println("Děkuji za použití kalkulačky.");
    }

}

