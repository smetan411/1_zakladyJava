package prikazy2;

import java.util.Scanner;

public class ReturnBreakContinue {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        // return:
        System.out.print("Zadejte číslo, poznám jestli je sudé nebo liché: ");
        int cislo = scanner.nextInt();
        String vysledek = zkontrolujSude(cislo);
        System.out.println("Výsledek: " + vysledek);

        cekejNaKlavesu(); // alt + shift + Enter

        // continue
        System.out.print("Vytisknu zadaný rozsah čísla, zadejte začátek rozsahu: ");
        int zacatek = scanner.nextInt();
        System.out.print("Zadejte konec rozsahu: ");
        int konec = scanner.nextInt();
        System.out.print("Zadejte číslo, které chcete vynechat: ");
        int vynech = scanner.nextInt();
        preskocCislo(zacatek, konec, vynech);
    }

    // Napište metodu, která přijme jedno číslo a vrátí text "sudé" nebo "liché",
    // podle toho, o jaké číslo jde. Pokud je číslo 0, vraťte text "nula".
    public static String zkontrolujSude(int cislo) {
        if (cislo == 0) {
            return "nula"; // Vrací výsledek pro nulu
        }
        if (cislo % 2 == 0) {
            return "sudé"; // Vrací výsledek pro sudé číslo
        } else {
            return "liché"; // Vrací výsledek pro liché číslo
        }
    }

    //Napište metodu, která vypíše čísla od 1 do 10, ale přeskočí zadané číslo.
    public static void preskocCislo(int zacatek, int konec, int vynech) {
        for (int i = zacatek; i <= konec; i++) {
            if (i == vynech) {
                continue;
            }
            System.out.print(i + " "); // Vypisuje číslo
        }
    }

    // Napište metodu s názvem cekejNaKlavesu(),
    // která uživatele požádá o stiknutí klávesy, než se bude dál pokračovat
    public static void cekejNaKlavesu() throws Exception {
        System.out.println("\nStiskněte libovolnou klávesu pro pokračování...");
        System.in.read(); // Čeká na vstup uživatele
    }

}
