package prikazy3;

import java.util.Scanner;

public class PrikazSwitch {

    public static void main(String[] args) {
//        dnyTydne();
//        rozeznamPismena();
        doporucimKurz();
        rozeznejSmajliky();
    }

    //vytvořte metodu, která pomocí příkazu switch vypíše do konzoly
    //text k jednotlivým dnům v týdnu, dny v týdnu vyjádřete čísly
    // a vygenerujte toto číslo náhodně 1 - 7
    //bude stačit odlišit sobotu, neděli a vsedniDen
    //v konzole se objeví text dnes je 5.den tydne, nebo tesim se na vikend.
    static void dnyTydne() {
        int den = (int) (Math.round(Math.random() * 7 + 1));
        switch (den) {
            case 6:
                System.out.println("Dnes je sobota.");
                break;
            case 7:
                System.out.println("Dnes je nedele.");
                break;
            default:
                System.out.printf("Dnes je %d. den tydne, tesim se na vikend.", den);
        }
    }

    //Vytvořte metodu, pomocí switch metodu, která rozezná, zda jste zadali
    //souhlásku nebo samohlásku. Metoda si nejprve vyžádá zadání písmene,
    //potom ho převede na malé písmeno pro případ, že by uživatel zadal velké.
    //Nakonec vytiskne: Zadané písmeno ... je samohláska. nebo ... je souhláska.
    static void rozeznamPismena() {
        System.out.println("Zadej pismeno.");
        Scanner sc = new Scanner(System.in);
        String pismeno = sc.nextLine().toLowerCase();
        char pismenoChar = pismeno.charAt(0);
        switch (pismenoChar) {
            case 'a':  case 'e':   case 'i':    case 'o':    case 'u':
            case 'á':  case 'é':   case 'í':     case 'ó':    case 'ů':
            case 'ú':  case 'ě':
                System.out.println(pismenoChar + " je samohláska");
                break;
            default:
                System.out.println(pismenoChar + " je souhláska.");
        }
    }

    //Vytvořte metodu, která podle rodného čísla pozná rok narození
    //a pozná, kolik je vám let. Podle toho vám doporučí kurz pro
    //děti, studenty, dospělé nebo důchodce.
    static void doporucimKurz() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej svoje rodne cislo.");
        String rodneCislo = sc.nextLine();

        Character prvniPismenoChar = rodneCislo.charAt(0);
        String prvniPismenoString = prvniPismenoChar.toString();
        int prvniCislice = Integer.parseInt(prvniPismenoString);

        Character druhePismenoChar = rodneCislo.charAt(1);
        String druhePismenoString = druhePismenoChar.toString();
        int druhaCislice = Integer.parseInt(druhePismenoString);

        int rokNarozeni = 2000 + prvniCislice * 10 + druhaCislice;
        if (rokNarozeni >= 2023) {
            rokNarozeni = 1900 + prvniCislice * 10 + druhaCislice;
        }
        System.out.println(prvniCislice);
        System.out.println(druhaCislice);
        System.out.println(rokNarozeni);

        int vek = 2023 - rokNarozeni;
        System.out.println(vek + " let ");
        String kategorieVeku = "";
        if (vek < 6) {
            kategorieVeku = "spunt";
        } else if (vek < 10) {
            kategorieVeku = "zak";
        } else if (vek < 26) {
            kategorieVeku = "student";
        } else if (vek < 65) {
            kategorieVeku = "dospely";
        } else if (vek >= 65) {
            kategorieVeku = "duchodce";
        }
        System.out.println(kategorieVeku);

        switch (kategorieVeku) {
            case "zak":
                System.out.println("Doporucuji krouzek GameMaker");
                break;
            case "student":
                System.out.println("Doporucuji krouzek Minecraft");
                break;
            case "dospely":
                System.out.println("Doporucuji krouzek Unity");
                break;
            case "duchodce":
                System.out.println("Doporucuji krouzek Java");
                break;
            default:
                System.out.println("Bohuzel musis jeste vyrust.");
        }
    }

    public static void rozeznejSmajliky() {
//    Vytvořte program, který si na vstupu nechá zadat smajlíka.
//    Následně vypište slovy o jakou emoci se jedná. Rozeznávejte smajlíky:
//    :-) - "Tvůj smajlík je veselý"
//    :-( - "Tvůj smajlík je smutný"
//    :-* - "Tvůj smajlík je zamilovaný"
//    :-P - "Tvůj smajlík vyplazuje jazyk."
//    jakýkoli jiný - "Takového smajlíka neznám."
//Pokud zadaný smajlík nesouhlasí ani s jedním z těchto, program vypíše, že je neznámý. K řešení aplikace použijte konstrukci switch.
///Zamyslete se nad tím, aby program rozeznával smajlíky s nosem i bez nosu.
        System.out.println("Zadej nektereho z nasledujicich smajliku: :-)   :-(   :-*   :-P   ");
        Scanner sc = new Scanner(System.in);
        String smajlik = sc.nextLine();
        switch (smajlik) {
            case ":-)":
                System.out.println("Tvuj smajlik je vesely.");
                break;
            case ":-(":
                System.out.println("Tvuj smajlik je smutny.");
                break;
            case ":-*":
                System.out.println("Tvuj smajlik je zamilovany.");
                break;
            case ":-P":
                System.out.println("Tvuj smajlik vyplazuje jazyk.");
                break;
            default:
                System.out.println("Takoveho smajlika neznam.");
        }
        boolean obsahuje = smajlik.trim().contains("-");
        if (obsahuje) {
            System.out.println("Mas smajlika s nosem.");
        } else System.out.println("Mas smajlika bez nosu.");
    }
}

