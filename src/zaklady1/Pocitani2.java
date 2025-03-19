package zaklady1;

import java.util.Scanner;

class Pocitani2 {
    public static void main(String[] args) {


    }

    //   vytvořte metodu, která sečte dvě celočíselné proměnné a, b
    //  vytiskněte si jejich součet, rozdíl, součin, podíl, zbytek po dělení
    public static void pocitej() {
        int a = 10;
        int b = 25;
        int aa = a + b;
        int bb = a - b;
        int cc = a * b;
        int dd = a / b;
        int ee = a % b;
        System.out.println("Počítání s celými čísly:");
        System.out.println("soucet cisel je: " + aa);
        System.out.println("rozcil cisel je: " + bb);
        System.out.println("soucin cisel je: " + cc);
        System.out.println("podil cisel je: " + dd);
        System.out.println("zbytek po dělení je: " + ee);
        System.out.println();
    }

    // nyní vytvořte dvě proměnné s desetinným číslem c, d a přiřaďte jim nějaké hodnoty
    // vytiskněte si jejich součet, rozdíl, součin, podíl, zbytek po dělení přímo, bez použití proměných
    public static void pocitejLip() {
        double c = 100.65;
        double d = 25.32;
        System.out.println("Počítání s desetinnými čísly:");
        System.out.println("soucet cisel je: " + (c + d));
        System.out.println("rozcil cisel je: " + (c - d));
        System.out.println("soucin cisel je: " + (c * d));
        System.out.println("podil cisel je: " + (c / d));
    }

    // fakt to umí počítat :-)
    // vymyslete si příklad a spočítejte ho pro různé hodnoty proměnných
    public static void vymysliPriklad() {
        int g = 15;
        int h = 20;
        int i = 7;
        int j = 4;
        int vysledek = ((i * g) / (j - g)) * ((j * i) / g + h);
        System.out.println("Tohle je řešení našeho vymyšleného příkladu:");
        System.out.println(vysledek);
    }
}
