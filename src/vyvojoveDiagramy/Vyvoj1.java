package vyvojoveDiagramy;

import java.util.Scanner;

public class Vyvoj1 {

    public static void main(String[] args) {

        trojuhelnik();
    }


    // na vstupu si vyžádejte 3 hodnoty jako strany trojuhelniku
    // zjisti, jestli je to trojuhelnik
    // pokud jsou strany vsechny stejne, vypis rovnostranny trojuhelnik
    // pokud jsou 2 strany stejne, vypis rovnoramenny
    // pokud je trojuhelnik pravouhly, vypis pravouhly
    // pokud nejde sestrojit napis neni trojuhelnik

    public static void trojuhelnik() {
        System.out.println("Zadej tri strany trojuhelnika, reknu ti jaky je to trojuhelnik.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej prvni stranu.");
        double a = sc.nextDouble();
        System.out.println("Zadej druhou stranu.");
        double b = sc.nextDouble();
        System.out.println("Zadej treti stranu.");
        double c = sc.nextDouble();
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && a == c) {
                System.out.println("rovnostranny");
            } else if (a * a + b * b == c * c || a * a + c * c == b * b || c * c + b * b == a * a) {
                System.out.println("pravouhly");
            } else System.out.println("obecny");
        } else System.out.println("neni to trojuhelnik");
    }
}





/*
//Na vstupu 3 hodnoty kladne nenulove jsou delky strany trojuhelniku
//pokud jsou strany
//    1.vsechny stejne dlouhe vypis "rovnostranny"
//    2. pokud je trojuhelnik pravouhly vypis "pravouhly"
//    3. pokud nejde sestrojit vypis "neni trojuhlenik"
//    4.poku je obecny vypis "obecny"

        ic static void trojuhelnik() {
        System.out.println("Zadej 3 strany trojuhleniku. Napisu o jaky druh se jedna");
        Scanner scanner = new Scanner(System.in);
        System.out.println("zadej 1. stranu:");
        double a = scanner.nextDouble();

        System.out.println("zadej 2. stranu:");
        double b = scanner.nextDouble();

        System.out.println("zadej 3. stranu:");
        double c = scanner.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
        if (a == b && a == c) {
        System.out.println("rovnostranny");
        } else if (a * a + b * b == c * c || a * a + c * c == b * b || c * c + b * b == a * a) {
        System.out.println("pravouhly");
        } else System.out.println("obecny");
        } else System.out.println("neni trojuhelnik");
        }


 */