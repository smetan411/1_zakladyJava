package procvicovani7;

import java.util.Scanner;

public class Znaky1 {

    public static void main(String[] args) {
    // textPozpatku();
    // textNaopak();
    // prevedZnakAscii();
    // najdiPocetZnaku();
    // sifrujText();
    //jmenoPozpatku();
    }

    public static void textPozpatku() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej text, napíšu ho pozpátku.");
        String jmeno = sc.nextLine();
        String jmenoPozpatku = "";
        for (int i = 0; i < jmeno.length(); i++) {
            char pismeno = jmeno.charAt(jmeno.length() - 1 - i);
            jmenoPozpatku += pismeno;
        }
        System.out.println(jmenoPozpatku);
    }

    public static void textNaopak() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej text, napíšu ho pozpátku.");
        String text = sc.nextLine();
        String textPozpatku = "";
        int pocetPismen = text.length();

        char[] zadaneJmeno = text.toCharArray();
        char[] pismeno = new char[pocetPismen];

        for (int i = 0; i < pocetPismen; i++) {
            pismeno[i] = zadaneJmeno[pocetPismen - 1 - i];
            textPozpatku += pismeno[i];
        }
        System.out.println(textPozpatku);
    }

    public static void prevedZnakAscii() {
        char c; // znak
        int i;  // číslo - zde to bude číselná hodnota znaku podle tabulky ASCII
// převedeme znak na jeho ASCII hodnotu, pozor podle formátování textu printf je %c znak(char), %d celé číslo(int)
        c = 'a';
        i = (int) c;
        System.out.printf("Znak %c jsme převedli na ASCII hodnotu %d\n", c, i);
        // Převedeme ASCII hodnotu na znak
        i = 98;
        c = (char) i;
        System.out.printf("ASCII hodnotu %d jsme převedli na znak %c", i, c);
    }


    public static void najdiPocetZnaku() {
        String text = "Programátor se zasekne ve sprše, protože instrukce na šampónu byly: Namydlit, omýt, opakovat.";
        System.out.println(text);
        text = text.toLowerCase().trim();
// inicializace počítadel
        int pocetSamohlasek = 0;
        int pocetSouhlasek = 0;
// definice typů znaků
        String samohlasky = "aeiouyáéěíóúůý";
        String souhlasky = "bcčdďfghjklmnpqrřsštťvwxzž";
//      hlavní cyklus - text převedeme na pole znaků pomocí metody toCharArray(), převést ho musíme, protože
//      ve forEach máme char c
//      String.valueOf() metoda se volá na třídě String - zjistí typ hlásky, samohlásky jsou typu String
        for (char c : text.toCharArray()) {
            if (samohlasky.contains(String.valueOf(c))) {
                pocetSamohlasek++;
            } else if (souhlasky.contains(String.valueOf(c))) {
                pocetSouhlasek++;
            }
        }
        System.out.printf("Celkem znaků: %d\n", text.length());
        System.out.printf("Samohlásek: %d\n", pocetSamohlasek);
        System.out.printf("Souhlásek: %d\n", pocetSouhlasek);
        System.out.printf("Nepísmenných znaků: %d\n", text.length() - (pocetSamohlasek + pocetSouhlasek));
    }


    public static void sifrujText() {
        String textKSifrovani = "no nazdar";
        System.out.printf("Původní zpráva: %s\n", textKSifrovani);
        String zasifrovanyText = "";
        int posun = 2;
// cyklus projíždějící jednotlivé znaky
        for (char c : textKSifrovani.toCharArray()) {
            int i = (int) c;
            i += posun;
            // kontrola přetečení - znaků je 26, když bychom nezadali kontrolu přetečení, objevily by se
            // na místě např. písmene z jiné znaky, ale to nemusí vadit
            if (i > (int) 'z') {
                i -= 26;
            }
            char znak = (char) i;
            zasifrovanyText += znak;
        }
        // výpis + desifrovat text
        System.out.printf("Zašifrovaná zpráva: %s\n", zasifrovanyText);
    }


    public static void jmenoPozpatku() {
        String jmeno = "ahoj";
        System.out.println(jmeno);
        String jmenoPozpatku = "";
        for (int i = 0; i < jmeno.length(); i++) {
            char pismeno = jmeno.charAt(jmeno.length() - 1 - i);
            jmenoPozpatku += pismeno;
        }
        System.out.println(jmenoPozpatku);
    }
}


