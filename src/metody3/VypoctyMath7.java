package metody3;

import java.util.Arrays;
import java.util.Scanner;

public class VypoctyMath7 {
    public static void main(String[] args) {

        ludolfovoCislo();
    }


    Scanner sc = new Scanner(System.in);

//  - metoda si od uživatele vyžádá dvě čísla,
//    potom uživateli sdělí výsledky výpočtu (+-*/)
//    (pozor, nesmíme dělit nulou), metodu nazvěte např. pocitani()
    public void pocitani() {
        System.out.println("Zadejte první číslo. ");
        float a = Float.parseFloat(sc.nextLine());
        System.out.println("Zadejte druhé číslo: ");
        float b = Float.parseFloat(sc.nextLine());
        float soucet = a + b;
        System.out.println("soucet je: " + soucet);
    }


    //  - metoda si vyžádá od uživatele dvě čísla a porovná jejich velikost a uživateli sdělí které číslo je
//     větší a o kolik, metodu nazvěte např. porovnavani()
    public void porovnavani() {
        System.out.println("Zadejte první číslo. ");
        float a = Float.parseFloat(sc.nextLine());
        System.out.println("Zadejte druhé číslo: ");
        float b = Float.parseFloat(sc.nextLine());
        System.out.println("prvni cislo je: " + a);
        System.out.println("druhe cislo je: " + b);
        float mensi = Math.min(b,a);
        float vetsi = Math.max(b,a);
        System.out.println("Mensi je cislo " + mensi + ", je o " + (vetsi-mensi)+ " mensi nez " + vetsi + ".");

        }

    // vytvorte pole cisel, tato cisla sectete pomoci cyklu for, for each
    public static void provedSoucetPole() {
        int[] pole = {5, 66, 94, 5, 2, 11, 87, 30, 50};
        int soucetPole = 0;
        for (int s : pole) {
            soucetPole += s;
        }
        System.out.println(soucetPole);
    }



    // vytvořte náhodně velké pole (max.20 prvků )složené z náhodných celýchčísel(1 - 1000) a najděte největší číslo
    // vypište největší číslo a pod něj vypište na řádek celé pole - dvěma způsoby
    public static void najdiNejvetsi() {
        int a = (int) Math.round(Math.random() * 20 + 1);
        int[] pole = new int[a];
        for (int i = 0; i < pole.length - 1; i++) {
            pole[i] = (int) Math.round(Math.random() * 1000 + 1);
            // pole[i] = random.nextInt(100);
        }
        //  hledání největšího
        int nejvetsi = 0;
        for (int i = 0; i < pole.length - 1; i++) {
            if (pole[i] > nejvetsi) {
                nejvetsi = pole[i];
            }
        }
        // vypis pole
        System.out.println("Největší číslo je: " + nejvetsi);
        System.out.println(Arrays.toString(pole));
        for (int b : pole) {
            System.out.print(b + "; ");
        }
        System.out.println();
    }

    //    Vypište tabulku ASCII pro kódy 33 až 255.
    public static void vypisTabulkyASCII() {
        System.out.println("Tabulka ASCII:");
        System.out.println("===============");
        for (int i = 33; i < 256; i++) {
            char c = (char) i;
            System.out.printf(i + " %c \n", c);
        }
    }

    public static void vypocitejRovnici() {
//    Vytvořte program, který si na vstupu vyžádá postupně koeficienty a, b, c kvadratické rovnice ax^2 + bx + c = 0
//    Program vypočítá kořeny rovnice pomocí diskriminantu. Vzorecky pro vypocet mate dole. Nejprve vypocitejte diskriminant.
//    Vzoreček pro výpočet diskriminantu je:
//    d = b * b - 4 * a * c
//    Vzorecky pro výpočet kořenů jsou:
//    x1 = (-b + odmocnina(d)) / 2a
//    x2 = (-b - odmocnina(d)) / 2a
//    Pokud vam vyjde zaporny diskriminant d, napiste, ze "V oboru realnych cisel nema rovnice reseni." a ukoncete vypocet.
//    Komplexními kořeny se nezabývejte.

        System.out.println("Zadej postupne tri cela cisla jako koeficienty a, b, c kvadraticke rovnice" +
                "ve tvaru ax*x + bx + c = 0, kazdy na jeden radek.");
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int c = Integer.parseInt(sc.nextLine());
        int d = b * b - 4 * a * c;
        double x_1 = ((-b + Math.sqrt(d)) / (2 * a));
        double x_2 = ((-b - Math.sqrt(d)) / (2 * a));
        if (d < 0) {
            System.out.println("V oboru realnych cisel nema rovnice reseni.");
            return;
        }
        else {
            String x1 = Double.toString(x_1);
            String x2 = Double.toString(x_2);
            System.out.println("Reseni kvadraticke rovice je: x1 = " + x1 + ", x2 = " + x2);
        }
    }


    public static void ludolfovoCislo() {
        double n = 6;
        double x = 1;
        double pi = x * n / 2;
        System.out.println(pi);
        for (int i = 0; i < 50; i++) {
//            System.out.println("iterace:" + i);
            double v1 = Math.sqrt(1 - (x / 2) * (x / 2));
//            System.out.println("v1:" + v1);
            double v2 = 1 - v1;
//            System.out.println("v2:" + v2);
            x = Math.sqrt((x / 2) * (x / 2) + v2 * v2);
//            System.out.println("x:" + x);
            n = n * 2;
            pi = x * n / 2;
            System.out.println(pi);
//            System.out.println();
        }
    }
}
