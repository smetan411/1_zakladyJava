package prikazy3;

import java.util.Scanner;

public class PrikazIF {

    public static void main(String[] args) {
//        porovnejCisla();
//        porovnejCislaFloat();
//        porovnejText();
//        odmocnovani();
//        leziVrozmezi();
        porovnejSlova();

    }



    // napiste metodu, ktera vygeneruje dve nahodna desetinna cisla 0 az 100
    // obe vygenerovana cisla vytisknete na dve desetinna cisla
    // pomoci prikazu if vytisknete: vetsi cislo je ...., také na dve des.mista
    static void porovnejCisla() {
        double prvniCislo = Math.random() * 100;
        double druheCislo = Math.random() * 100;
        System.out.printf("cisla jsou: %.2f a %.2f\n", prvniCislo, druheCislo);

        if (prvniCislo > druheCislo) {
            System.out.printf("vetsi je %.2f", prvniCislo);
        } else System.out.printf("vetsi je %.2f", druheCislo);
    }

    // napiste metodu, ktera si vyzada od uzivatele text
    // pomoci prikazu if vytiskne bud text
    // s komentarem - jo, asi je to fakt text:
    // nebo rekne ze v textu neni zadny znak
    static void porovnejText() {
        System.out.println("Napis na dalsi radek text.");
        String text = new Scanner(System.in).nextLine();
        if (text.length() > 0) {
            System.out.println("jo, asi je to fakt text: " + text);
        } else System.out.println("V textu neni zadny znak.");
    }

    // napiste metodu, ktera si vyzada cislo k odmocneni
    // zjisti, jestli cislo neni mensi nez nula, pouzijeme if
    // pokud je cislo rovno nule, odmitne to pocitat
    // pokud je cislo mensi nez nula, upozorni uzivatele
    // ze odmocnina ze zaporneho cisla neni definovana
    static void odmocnovani() {
        System.out.println("Zadej cislo k odmocneni.");
        double cislo = Double.parseDouble(new Scanner(System.in).nextLine());
        if (cislo > 0) {
            System.out.printf("Odmocnina cisla %f je %f \n", cislo, Math.sqrt(cislo));
        } else if (cislo == 0) {
            System.out.println("Zadal jsi nulu, nebudu to pocitat.");
        } else {
            System.out.println("Odmocnina ze zaporneho cisla neni definovana.");
        }
    }

    // napiste metodu, ktera se zepta uzivatele, jestli chce zadavat nebo
    // generovat cela cisla  mezi 0 a 500
    // metoda zjisti, jestli zadana cisla lezi v rozmezi 300 a 400
    // zjisti take, jestli cislo lezi na hranici intervalu - tj. rovno 300 nebo 400
    static void leziVrozmezi() {
        System.out.println("Chces zadavat cisla sam nebo chces generovat automaticky? sam - automaticky");
        String rozhodnuti = new Scanner(System.in).nextLine();
        int celeCislo = 0;
        if (rozhodnuti.equals("sam")) {
            System.out.println("Tak tedy zadej cele cislo mezi minus a plus padesati.");
            celeCislo = Integer.parseInt(new Scanner(System.in).nextLine());
        } else if (rozhodnuti.equals("automaticky")){
            celeCislo = (int) Math.round(Math.random() * 500);
            System.out.println(celeCislo);
        }
        if (celeCislo >300 && celeCislo < 400) {
            System.out.println("Cislo lezi v zadanem rozmezi mezi 20 a 40.");
        }
        else if(celeCislo ==300 || celeCislo== 400){
            System.out.println("Cislo lezi na hranici zadaneho intervalu.");
        }
        else{
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
        int rozdilDelkySlova = prvniSlovo.length() - druheSlovo.length();
        if (rozdilDelkySlova > 0) {
            System.out.println("Druhe slovo je o " + rozdilDelkySlova + " pismen kratsi.");
        } else if (rozdilDelkySlova == 0) {
            System.out.println("Obe slova jsou stejne dlouha.");
        } else System.out.println("Druhe slovo je o " + (-rozdilDelkySlova) + " pismen delsi.");
    }
}
