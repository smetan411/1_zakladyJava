package procvicovani6;

import java.util.Scanner;

public class VypoctyMath {
    public static void main(String[] args) {
        vypocetPrumeru(5.5, 6.6, 7.7);
//        porovnavani();
//        vypocitejRovnici();

    }

    public static void vypocetPrumeru(double a, double b, double c){
        double soucet = a + b + c;
        int n = 3;
        double prumer = soucet / n;
        System.out.println("Prumer zadanych cisel je: " + prumer);
        System.out.printf("Prumer zadanych cisel je: %.2f\n", prumer);
    }

    //  metoda si vyžádá od uživatele dvě čísla a porovná jejich velikost a uživateli sdělí které číslo je
    //     větší a o kolik, metodu nazvěte např. porovnavani()
    public static void porovnavani() {
        Scanner sc = new Scanner(System.in);
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



}
