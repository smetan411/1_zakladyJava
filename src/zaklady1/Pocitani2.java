package zaklady1;

import java.util.Scanner;

class Pocitani2 {
    public static void main(String[] args) {

        // vytvořte dvě celočíselné proměnné a, b a přiřaďte jim nějaké hodnoty
        // vytiskněte si jejich součet, rozdíl, součin, podíl, zbytek po dělení

        int a = 10;
        int b = 25;
        int soucet = a + b;
        int rozdil = a - b;
        int soucin = a * b;
        int podil = a / b;
        int zbytekPoDeleni = a % b;
        System.out.println("Počítání s celými čísly:");
        System.out.println("soucet cisel je: " + soucet);
        System.out.println("rozcil cisel je: " + rozdil);
        System.out.println("soucin cisel je: " + soucin);
        System.out.println("podil cisel je: " + podil);
        System.out.println("zbytek po dělení je: " + zbytekPoDeleni);
        System.out.println();

        // nyní vytvořte dvě proměnné s desetinným číslem c, d a přiřaďte jim nějaké hodnoty
        // vytiskněte si jejich součet, rozdíl, součin, podíl, zbytek po dělení přímo, bez použití proměných
        double c = 100.65;
        double d = 25.32;
        System.out.println("Počítání s desetinnými čísly:");
        System.out.println("soucet cisel je: " + (c + d));
        System.out.println("rozcil cisel je: " + (c - d));
        System.out.println("soucin cisel je: " + (c * d));
        System.out.println("podil cisel je: " + (c / d));
        System.out.println();

        // fakt to umí počítat :-)
        // vymyslete si příklad a spočítejte ho pro různé hodnoty proměnných
        int g = 15;
        int h = 20;
        int i = 7;
        int j = 4;
        int vysledek = ((i * g) / (j - g))*((j * i)/g + h);
        System.out.println("Tohle je řešení našeho vymyšleného příkladu:");
        System.out.println(vysledek);
        System.out.println();



    ///////////////////////////////////////////////////////////////////////////////////////
    }
}
