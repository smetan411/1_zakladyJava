package prikazy2;

import java.util.Scanner;

public class PrikazWhile {

    public static void main(String[] args) {
//        radaStovek();
//        radaCisel();
//   scitaniCisel();
          delitele();
//        deliteleSeSouhlasem();
   }

    // napište metodu, která zjistí celočíselné dělitele libovolného čísla
    public static void delitele() {
        System.out.println("Zadej cele cislo.");
        Scanner sc = new Scanner(System.in);
        int cislo = sc.nextInt();
        int i = 1;
        while (i <= cislo){
            if(cislo % i == 0){
                System.out.print(i + " ");
            }
            i++;
        }
    }

    // napiste metodu, která si od uživatele vyžádá postupné zadávání čísel,
    // čísla se budou sčítat a bude se počítat jejich počet.
    // Sečítání bude ukončeno tehdy, když uživatel zadá nulu.
    // Pomůcka: použijte příkaz while
    public static void scitaniCisel() {
        System.out.println("Zadavej cisla, budou se scitat. Scitani se ukonci, az zadas nulu.");
        Scanner sc = new Scanner(System.in);
        int cislo = sc.nextInt();
        int soucet = 0;
        int pocet = 0;
        while(cislo != 0){
            soucet += cislo;
            pocet += 1;
            System.out.println("pocet cisel je " + pocet + ", soucet cisel je " + soucet );
            System.out.println("Zadej dalsi cislo.");
            cislo = sc.nextInt();
        }
        System.out.println("Celkovy pocet cisel je " + pocet);
        System.out.println("Celkovy soucet cisel je " + soucet);
        System.out.println("Prumer z techto cisl je " + (soucet/pocet));
        System.out.println("posledni cislo byla nula, tohle cislo nezapocitavam.");
    }



    // napište metodu, která vypíše na řádek číselnou řadu 100, 200 atd. až do 1000
      public static void radaStovek() {
        int i = 100;
        while (i <= 1000) {
            System.out.print(i + " ");
            i += 100;
        }
    }

    // napište další metodu tak, aby vypsala po desitkach všechna čísla mezi 100 a 1000,
    // každou stovku na jeden řádek, použijte k tomu další while
    public static void radaCisel() {
        int i = 101;  //100
        while (i <= 1000) {
            System.out.print(i + " ");
            if (i % 100 == 0) {
                System.out.println();
            }
            i++;
        }
    }



    // vylepšete metodu tak, že po výpisu všech dělitelů se uživatele zeptá,
    // jestli chce pokračovat, použijte další while s proměnnou String souhlas
    public static void deliteleSeSouhlasem() {
        Scanner sc = new Scanner(System.in);
        String souhlas = "ano";
        while(souhlas.equals("ano") ) {
            System.out.println("Zadej cele cislo.");
            int cislo = Integer.parseInt(sc.nextLine());  //nextInt()
            int i = 1;
            while (i <= cislo) {
                if (cislo % i == 0) {
                    System.out.println(i);
                }
                i++;
            }
            System.out.println("Chces pokracovat? ano - ne");
            souhlas = sc.nextLine();  //next()
        }
    }
}
