package procvicovani7;

import java.util.Scanner;

public class TextyRetezce {

    public static void main(String[] args) {
        najdiHledaneho();
//        obsahujeSlovo();
//        porovnejJmeno();

    }

    public static void najdiHledaneho() {
//        Vytvořte program, který si na vstupu nechá zadat jméno a příjmení
//        a porovná ho s databází hledaných lidí. Vypíše, zda osoba je nebo není hledaná.
        System.out.println("Zadej hledane osoby.");
        Scanner sc = new Scanner(System.in);
        String hledaneOsoby = sc.nextLine();
        System.out.println(hledaneOsoby.toUpperCase());
        System.out.println("Zadej jmeno.");
        String jmeno = sc.nextLine();
        System.out.println(jmeno.toUpperCase());
        boolean jeHledany = hledaneOsoby.contains("jmeno");
        System.out.println(jeHledany ? "Osoba je hledana.":"Osoba neni hledana.");
    }


    public static void obsahujeSlovo() {
//     Vytvořte program, který si na vstupu vyžádá textový řetězec.
//     Zjistěte, zda daný textový řetězec obsahuje slovo "babicka" bez ohledu na velikost písmen.
        System.out.println("Zadej textovy retezec, napriklad nejakou vetu.");
        Scanner sc = new Scanner(System.in);
        String retezec = sc.nextLine();
        boolean obsahuje = retezec.toLowerCase().contains("babicka");
        if (obsahuje) {
            System.out.println("Zadany retezec slovo babicka obsahuje.");
        } else System.out.println("Zadany retezec slovo babicka neobsahuje.");
    }

    public static void porovnejJmeno() {
//      Vytvořte program, který si na vstupu nechá zadat jméno uživatele.
//      Program analyzuje délku zadaného jména a pokud je délka jména
//      mezi třemi a deseti znaky, vypíše, že má uživatel normální jméno.
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

}
