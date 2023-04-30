package pokracovani5;

import java.util.Scanner;

public class Ukoly11 {

    public static void main(String[] args) {
        vypisCislo();
        vypisTabulkyASCII();
        najdiPalindrom();
        zasifrujText();
        zasifrujText2();
        zasifrujTextHeslem();

    }

    // Program si vyžádá zadání libovolného písmeme nebo jiného znaku a vytiskne odpovídající číslo podle
    // tabulky ASCII. Zkontrolujte správnost číselného kódu převodem zpět na písmeno a písmeno vytiskněte.
    // Informujte uživatele, jak zadat libovolný znak pomocí alt + číselného kódu podle ASCII
    public static void vypisCislo() {
        System.out.println("Zadej písmeno malé abecedy: ");
        Scanner sc = new Scanner(System.in);
        String zadanePismeno = sc.nextLine();
        char pismeno = zadanePismeno.charAt(0);
        int cisloPismene = (int) pismeno;
        System.out.println(cisloPismene);
        char pismenoZpet = (char) cisloPismene;
        System.out.println(pismenoZpet);
        System.out.println("Libovolný znak lze zadat stisknutím klávesy Alt + číselný kód ASCII, vyzkoušejte si to.");

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


//    Naprogramujte aplikaci, které zadáte na vstupu textový řetězec a ona zjistí, zda je to palindrom.
//    Palindrom je slovo, které se čte stejně zleva i zprava. Jsou to tedy např. slova: oko, anna, level, radar.
    public static void najdiPalindrom() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej slovo, které se čte zezadu stejně jako zepředu (= palindrom).");
        System.out.println("Můžeš zadat i jiné slovo, které není palindrom.");
        String zadaneSlovo = sc.nextLine();
        System.out.println("Zadané slovo: " + zadaneSlovo);
        char[] slovoChar = zadaneSlovo.toCharArray();
        char[] slovoPozpatkuChar = new char[slovoChar.length];
        String slovoPozpatkuString = "";
        for (int i = 0; i < slovoChar.length; i++) {
            int j = slovoChar.length - 1 - i;
            slovoPozpatkuChar[j] = slovoChar[i];
        }
        slovoPozpatkuString = new String(slovoPozpatkuChar);
        System.out.println("Slovo pozpátku: " + slovoPozpatkuString);
        if (zadaneSlovo.equals(slovoPozpatkuString)) System.out.println("Je to palindrom.");
        else System.out.println("Neni to palindrom.");
    }

//  Program si vyžádá zadání krátkého textu, který potom zašifruje tím, že písmena posune doprava nebo doleva o zadaný
//  posun. Zašifrovyný text potom znovu rozšifrujte.
    public static void zasifrujText() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte kratky text. Zasifruju ho.");
        String zadanyText = sc.nextLine();
        System.out.println("Zadejte posun.");
        int posun = Integer.parseInt(sc.nextLine());
        char[] poleZeZadanehoTextu = zadanyText.toCharArray();
        String zasifrovanyTextString = "";
        for (char i : poleZeZadanehoTextu) {
            int cislo = (int) i;
            cislo += posun;
            char pismeno = (char) cislo;
            zasifrovanyTextString += pismeno;
        }
        System.out.println("Zasifrovany text: " + zasifrovanyTextString);
// odšifrování:
        char[] poleZeZasifrovanehoTextu = zasifrovanyTextString.toCharArray();
        String odsifrovanyTextString = "";
        for (char i : poleZeZasifrovanehoTextu) {
            int cislo = (int) i;
            cislo -= posun;
            char pismeno = (char) cislo;
            odsifrovanyTextString += pismeno;
        }
        System.out.println("Odsifrovany text: " + odsifrovanyTextString);
    }

    //  Program si vyžádá zadání krátkého textu, který potom zašifruje tím, že písmena posune doprava nebo doleva o zadaný
//  posun. Délka posunu se bude měnit podle zadaného pravidla. Zašifrovyný text potom znovu rozšifrujte.
    public static void zasifrujText2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte kratky text. Zasifruju ho.");
        String zadanyText = sc.nextLine();
        System.out.println("Zadejte posun.");
        int posun = Integer.parseInt(sc.nextLine());
        char[] poleZeZadanehoTextu = zadanyText.toCharArray();
        String zasifrovanyTextString = "";
        for (int i : poleZeZadanehoTextu) {
            int cislo = (int) i;
            // pravidlo pro zmenu posunu:
            posun += 1;
            cislo += posun;
            char pismeno = (char) cislo;
            zasifrovanyTextString += pismeno;
        }
        System.out.println("Zasifrovany text: " + zasifrovanyTextString);
// odšifrování:
        char[] poleZeZasifrovanehoTextu = zasifrovanyTextString.toCharArray();
        String odsifrovanyTextString = "";
        posun -= zadanyText.length();
        for (int i : poleZeZasifrovanehoTextu) {
            int cislo = (int) i;
            posun += 1;
            cislo -= posun;
            char pismeno = (char) cislo;
            odsifrovanyTextString += pismeno;
        }
        System.out.println("Odsifrovany text: " + odsifrovanyTextString);
    }


// Naprogramuj šifraci textu pomocí Vigenerovy šifry. Program si na vstupu vyžádá šifrované slovo a heslo.
// Program posune jednotlivá písmena v šifrovaném slovu o určitý počet znaků v abecedě dopředu.
// Tento počet závisí na písmenech v heslu, např. heslo je ahoj.
// V našem případě program posune první znak ve slovu o 1 ('a'), druhý o 8('h'), třetí o 15('o'),
// čtvrtý o 10 ('j'), pátý zas o 1 ('a') a tak dále.
    public static void zasifrujTextHeslem() {
        // Zadání vstupu
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte text k zašifrování: ");
        String vstup = sc.nextLine();
        System.out.println("Zadejte heslo: ");
        String heslo = sc.nextLine();
        // Pomocné proměnné
        String vystup = "";
        int poziceA = (int) 'a';
        int poziceZ = (int) 'z';
        // Iterace všemi znaky
        for (int i = 0; i < vstup.length(); i++) {
            /* Výpočet posunu v abecedě podle hesla
               % je zbytek po celočíselném dělení a je
               zde využito pro jednoduché opakování
               hesla ve slově */
            int x = (int) heslo.charAt(i % heslo.length()) - (poziceA - 1);
            // Ošetření přetečení přes Z
            if ((int) vstup.charAt(i) + x > poziceZ) {
                x -= poziceZ - poziceA + 1;
            }
            // Získání znaku výstupu
            char znak = (char) ((int) vstup.charAt(i) + x);
            // Přidání znaku do výstupu
            vystup += znak;
        }
        System.out.println(vystup);
    }
}

