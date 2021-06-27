import java.util.Scanner;

public class RetezceZadani {

    public static void main(String[] args) {
//        vypisJmeno();
//        porovnejSlova();
//        obsahujeSlovo();
//        porovnejJmeno();
//        rozeznejSmajliky();
        vypocitejRovnici();


    }

    public static void vypisJmeno() {
//        Vytvořte program, který si na vstupu nechá zadat jméno uživatele, jeho příjmení a věk. Jméno a příjmení
//        poté vypíše VELKÝMI PÍSMENY. Nakonec vypíše "Za rok ti bude vek + 1 let."
        System.out.println("Zadej svoje jmeno.");
        Scanner sc = new Scanner(System.in);
        String jmeno = sc.nextLine();
        System.out.println("Zadej prijmeni.");
        String prijmeni = sc.nextLine();
        System.out.println("Jeste napis tvuj vek.");
        int vek = Integer.parseInt(sc.nextLine());
        System.out.println(jmeno.toUpperCase() + " " + prijmeni.toUpperCase());
        System.out.println("Za rok ti bude " + (vek + 1) + " let.");
    }

    public static void porovnejSlova() {
//        Vytvořte program, který si na vstupu nechá zadat 2 slova. Následně vypište o kolik znaků je první slovo delší
//        než druhé. Ignorujte bílé znaky před a za textem. Pokud uživatel zadá slova v opačném pořadí
//                (tj. nejprve to kratší), pak ve výpisu výstupu nesmí figurovat záporné znaménko - vytvořte jiný text.

        System.out.println("Zadej prvni slovo.");
        Scanner sc = new Scanner(System.in);
        String prvniSlovo = sc.nextLine();
        System.out.println("Zadej druhe slovo.");
        String druheSlovo = sc.nextLine();
        int rozdilDelkySlova = prvniSlovo.length() - druheSlovo.length();
        if (rozdilDelkySlova > 0) {
            System.out.println("Druhe slovo je o " + rozdilDelkySlova + " pismen kratxi.");
        } else if (rozdilDelkySlova == 0) {
            System.out.println("Obe slova jsou stejne dlouha.");
        } else System.out.println("Druhe slovo je o " + (-rozdilDelkySlova) + " pismen delsi.");
    }

    public static void obsahujeSlovo() {
//     Vytvořte program, který si na vstupu vyžádá textový řetězec. Zjistěte, zda daný textový řetězec obsahuje
//     slovo "babicka" bez ohledu na velikost písmen.
        System.out.println("Zadej textovy retezec, napriklad nejakou vetu.");
        Scanner sc = new Scanner(System.in);
        String retezec = sc.nextLine();
        boolean obsahuje = retezec.toLowerCase().contains("babicka");
        if (obsahuje) {
            System.out.println("Zadany retezec slovo babicka obsahuje.");
        } else System.out.println("Zadany retezec slovo babicka neobsahuje.");
    }

    public static void porovnejJmeno() {
//      Vytvořte program, který si na vstupu nechá zadat jméno uživatele. Program analyzuje délku zadaného jména.
//      Pokud je délka jména mezi třemi a deseti znaky, vypíše, že má uživatel normální jméno.
//      V ostatních případech vypíše, že je jméno příliš krátké nebo dlouhé.
        System.out.println("Zadej sve jmeno, zjistim jestli neni moc kratke nebo dloune.");
        Scanner sc = new Scanner(System.in);
        int delka = sc.nextLine().trim().length();
        if ((delka >= 3) && (delka <= 10)) {
            System.out.println("Mas normalni jmeno.");
        } else if (delka < 3) {
            System.out.println("Mas nejak moc kratke jmeno.");
        } else System.out.println("Mas strasne dlouhe jmeno.");
    }


    public static void rozeznejSmajliky() {
//    Vytvořte program, který si na vstupu nechá zadat smajlíka. Následně vypište slovy o jakou emoci se jedná. Rozeznávejte smajlíky:
//
//    :-) - "Tvůj smajlík je veselý"
//    :-( - "Tvůj smajlík je smutný"
//    :-* - "Tvůj smajlík je zamilovaný"
//    :-P - "Tvůj smajlík vyplazuje jazyk."
//    jakýkoli jiný - "Takového smajlíka neznám."
//
//Pokud zadaný smajlík nesouhlasí ani s jedním z těchto, program vypíše, že je neznámý. K řešení aplikace použijte konstrukci switch.
//
//Zamyslete se nad tím, aby program rozeznával smajlíky s nosem i bez nosu.
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
