package prikazy2;

import java.util.Scanner;

public class PrikazIF {

    public static void main(String[] args) {
        //   zadejText();
        //   zadejCislo();
        //    porovnejCisla();
        //    odmocnovani();
        //    leziVrozmezi();
        //    porovnejSlova();

    }

    // napiste metodu, ktera si vyzada od uzivatele text
    // pomoci prikazu if vytiskne bud text s komentářem
    // nebo rekne ze v textu neni zadny znak
    static void zadejText() {
        System.out.println("Napis na dalsi radek text.");
        String text = new Scanner(System.in).nextLine();
        if (!text.isEmpty()) {
            System.out.println("jo, asi je to fakt text: " + text);
        } else {
            System.out.println("V textu neni zadny znak.");
        }
    }

    // napiste metodu, která si od uzivatele vyzada cislo
    // pomocí příkazu if pak buď číslo vytiskne, nebo
    // napíše, že uživatel žádné číslo nezadal
    static void zadejCislo() {
        System.out.println("Zadej cislo, vytisknu ho.");
        String cislo = new Scanner(System.in).nextLine();
        Double cisloDouble = Double.parseDouble(cislo);
        if (cislo.isEmpty()) {
            System.out.println("Cislo nebylo zadano.");
        } else {
            System.out.println("Bylo zadano cislo " + cisloDouble);
        }
    }

    // napiste metodu, ktera vygeneruje dve nahodna desetinna cisla 0 az 100
    // obe vygenerovana cisla vytisknete na dve desetinna cisla
    // pomoci prikazu if vytisknete: vetsi cislo je ...., mensi cislo je.....
    static void porovnejCisla() {
        double prvniCislo = Math.random() * 100;
        double druheCislo = Math.random() * 100;
        System.out.printf("automaticky vygenerovana cisla jsou: %.2f a %.2f\n", prvniCislo, druheCislo);
        if (prvniCislo > druheCislo) {
            System.out.printf("vetsi je %.2f%n", prvniCislo);
            System.out.printf("mensi je %.2f%n", druheCislo);
        } else {
            System.out.printf("vetsi je %.2f%n", druheCislo);
            System.out.printf("mensi je %.2f%n", prvniCislo);
        }
    }

    // napiste metodu, ktera si vyzada cislo k odmocneni
    // zjisti, jestli cislo neni mensi nez nula
    // pokud je cislo zapornt, upozorni uzivatele
    // ze odmocnina ze zaporneho cisla neni definovana
    static void odmocnovani() {
        System.out.println("Zadej cislo k odmocneni.");
        double cislo = Double.parseDouble(new Scanner(System.in).nextLine());
        if (cislo > 0) {
            System.out.println("Odmocnina cisla " + cislo + " je " + Math.sqrt(cislo));
        } else if (cislo == 0) {
            System.out.println("Zadal jsi nulu, nebudu to pocitat, odmocnina z nuly je nula.");
        } else {
            System.out.println("Odmocnina ze zaporneho cisla neni definovana.");
        }
    }

    // napiste metodu, ktera se zepta uzivatele, jestli chce zadavat nebo
    // generovat cela cisla  mezi 0 a 500
    // metoda zjisti, jestli zadana cisla lezi v rozmezi 300 a 400
    // zjisti take, jestli cislo lezi na hranici intervalu - tj. rovno 300 nebo 400
    static void leziVrozmezi() {
        System.out.println("Zadej číslo do 500.");
        System.out.println("Chces zadavat sam nebo generovat automaticky? sam - automaticky");
        String rozhodnuti = new Scanner(System.in).nextLine();
        int celeCislo = 0;
        if (rozhodnuti.equals("sam")) {
            System.out.println("Tak tedy zadej cele cislo mezi nulou a 500.");
            celeCislo = Integer.parseInt(new Scanner(System.in).nextLine());
        } else if (rozhodnuti.equals("automaticky")) {
            celeCislo = (int) Math.round(Math.random() * 500);
            System.out.println(celeCislo);
        }
        if (celeCislo >= 0 && celeCislo < 501) {
            System.out.println("Cislo lezi v zadanem rozmezi.");
        } else {
            System.out.println("Cislo nelezi v zadanem rozmezi.");
        }
    }

    //Vytvořte metodu, ktera si na vstupu nechá zadat 2 slova.
    //Následně vypište o kolik znaků je první slovo delší nez druhe.
    //Odstrante bílé znaky před a za textem pomoci trim()
    //Pouzijte if, else if, else
    static void porovnejSlova() {
        System.out.println("Zadej prvni slovo.");
        Scanner sc = new Scanner(System.in);
        String prvniSlovo = sc.nextLine();
        System.out.println("Zadej druhe slovo.");
        String druheSlovo = sc.nextLine();
        boolean shodnostSlov = prvniSlovo.equals(druheSlovo);
        if (shodnostSlov) {
            System.out.println("Zadana slova jsou shodna.");
        } else {
            System.out.println("Zadana slova nejsou shodna, podivame se na jejich delku.");
            int rozdilDelkySlova = prvniSlovo.length() - druheSlovo.length();
            if (rozdilDelkySlova > 0) {
                System.out.println("Druhe slovo je o " + rozdilDelkySlova + " pismen kratsi.");
            } else if (rozdilDelkySlova == 0) {
                System.out.println("Obe slova jsou stejne dlouha.");
            } else System.out.println("Druhe slovo je o " + (-rozdilDelkySlova) + " pismen delsi.");
        }
    }
}
