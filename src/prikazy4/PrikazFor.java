package prikazy4;

import java.util.Scanner;

public class PrikazFor {

    public static void main(String[] args) {
//        zakladniFor();
//        shoraDolu();
//        nasobilka();
//        velkaNasobilka();
//        faktorial();
        nejvetsiSpolDelitel();
//        cyklus();
//        vypisSlovoPozpatku();
    }

    // napiš metodu s názvem s názvem zakladniFor(),
    // která vypíše na řádek číslice 0 až 10,
    // mezi číslice vlož mezeru
    public static void zakladniFor() {
        for (int i = 0; i < 11; i++) {
            System.out.print(i + " ");
        }
    }

    // napiš metodu s názvem shoraDolu(), která vypíše na řádek 1 až 10, ale od největšího
    // až se ti to podaří, pokus se z výpisu vyloučit číslici 5
    // pomůcka: použij příkaz for, kde místo i++ bude i--
    // další pomůcka: právě pro jednu zadanou hodnotu ukončí cyklus příkaz continue
    public static void shoraDolu() {
        for (int i = 10; i > 0; i--) {
            if (i == 5) {
                continue;
            }
            System.out.print(i + " ");
        }
    }


    // napiš metodu s názvem nasobilka(), která vypíše výsledky malé násobilky
    // každou násobilku - 2,3,4 ... na jeden žádek, mezi číslicemi bude mezera
    // pomůcka: použij vnořený příkaz for, jednou pro čítač int i, podruhé pro int j
    // další pomůcka: nulou asi nemá smysl násobit, začni od 1
    public static void nasobilka() {
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }

    public static void velkaNasobilka() {
        for (int i = 11; i < 21; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }


    // napiš metodu, ktera vypocita faktorial
    // faktorial cisla n je soucin 1 * 2 * 3 * ....* n
    // vyzadej si zadani cisla n od uzivatele
    // pouzij prikazy for a if
    // osetri pripad, kdy uzivatel zada faktorial nuly nebo zaporneho cisla
    public static void faktorial() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadejte číslo: ");
        int num = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Faktoriál čísla " + num + " je " + factorial);
    }

    // napis metodu, ktera vypocita cyklem for nejvetsi spol.delitel
    // dvou cisel, cisla si vyzadej od uzivatele
    static void nejvetsiSpolDelitel() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zadejte první číslo: ");
        int a = scanner.nextInt();
        System.out.print("Zadejte druhé číslo: ");
        int b = scanner.nextInt();
        int vysledek = 1;

        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                vysledek = i;
            }
        }
        System.out.println("Největší společný dělitel čísel "
                + a + " a " + b + " je " + vysledek);
    }

    // napis metodu, ktera pomoci cyklu for vypocita mocninu cisla
    // vyzadej si zaklad a exponent od uzivatele
    static void vypocetMocniny() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zadejte základ: ");
        int x = scanner.nextInt();
        System.out.print("Zadejte exponent: ");
        int n = scanner.nextInt();

        int vysledek = 1;
        for (int i = 0; i < n; i++) {
            vysledek *= x;
        }
        System.out.println(x + " na " + n + " je " + vysledek);
    }


    // napiš metodu s názvem cyklus(), který pomocí scanneru vyžádá od uživatele počet opakování
    // zadaný počet opakování uloží do proměnné int pocet
    // na každý řádek zvlášť vypíše: "Průchod cyklem: " + kolikáté je to opakování cyklu
    // pokud uživatel zadá příliš velký počet opakování (např. 8), cyklus se ukončí předčasně
    // s výpisem "Cyklus byl ukončen předčasně."
    // pomůcka - použij příkaz for, předčasné ukončení vytvoř pomocí vnořeného if
    // další pomůcka: příkaz break ukončí cyklus, příkaz return ukončí metodu
    public static void cyklus() {
        System.out.println("Zadej počet opakování cyklu.");
        Scanner sc = new Scanner(System.in);
        int pocet = Integer.parseInt(sc.nextLine());
        // int pocet = sc.nextInt();
        for (int i = 0; i < pocet; i++) {
            System.out.println("Průchod cyklem: " + i);
            if (i > 8) {
                System.out.println("Cyklus For byl předčasně ukončen.");
                break;
            }
        }
    }

    //  napiš metodu s názvem vypisSlovoPozpatku(),
    //  která si vyžádá od uživatele slovo a uloží ho do proměnné typu String zadaneSlovo
    //  poté vytvoří proměnnou typu String slovoPozpatku, která zatím neobsahuje žádný znak
    //  pomocí cyklu for vytvoř a vytiskni slovo pozpátku
    //  pomůcka: typ String metoda .length() rozezná délku zadaného slova
    //  další pomůcka: písmeno na zadané pozici najdeme pomocí .charAt()
    public static void vypisSlovoPozpatku() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte slovo. Vypisu ho pozpatku.");
        String zadaneSlovo = sc.nextLine();
        String slovoPozpatku = "";
        for (int i = zadaneSlovo.length() - 1; i >= 0; i--) {
            slovoPozpatku += zadaneSlovo.charAt(i);
        }
        System.out.println("slovo pozpátku: " + slovoPozpatku);
    }
}
