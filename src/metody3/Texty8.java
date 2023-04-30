package metody3;

import java.util.Scanner;

public class Texty8 {

    public static void main(String[] args) {
//         poleZnaku();
//          delkaTextu();
//          obsahujeZacinaKonci();
//          jePrazdnyRetezec();
//          prevedPismena();
//         orezText();
//         nahradSlovo();
//               vytiskniCastTextu();
        porovnejSlovaPodleAbecedy("ahoj","ahoj");
    }

    // text je pole znaku, pole se indexuje od nuly
    // metoda char.At() vypise pismeno na pozici, metoda neumoznuje menit text, slouzi jen pro cteni
    // napiste libovolny text a vytisknete pismeno, ktere je na druhem miste
    public static void poleZnaku() {
        String text = "Text je pole znaků. Vyzkoušíme to.";
        System.out.println(text);
        System.out.println(text.charAt(1));
    }

    //  Zadejte nějaký text, ve kterém znáte počet písmen a mezer.
    //  Vytisknete delku textu spolecne se slovnim komentarem.
    public static void delkaTextu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte nějaký text, ve kterém znáte počet písmen a mezer.");
        String text = sc.nextLine();
        System.out.printf("Délka vašeho textu je:  " + text.length() + "  znaků.");
    }


    //  Třída String obsahuje metody, které umožní zjistit, zda text obsahuje nějaké slovní spojení nebo slovo.
    //  Metody jsou:  contains()" obsahuje, startsWith() začíná,  endsWith() končí. Výsledkem je - true, false.
    //  Napište libovolný text a použijte uvedené metody k výpisu.
    public static void obsahujeZacinaKonci() {
        String text = "Třída String obsahuje metody.";
        System.out.println(text.startsWith("Třída"));
        System.out.println(text.endsWith("metody"));
        System.out.println(text.contains("které"));
        System.out.println(text.contains("obsahuje"));
    }

    //  Metoda isEmpty() zjistí, jestli je řetězec prázdný - neobsahuje žádný znak. Pozor, i mezera je znak:
    //  Opet deklarujte texty, z nichz budou dva prazdne a pouzijte metodu.
    public static void jePrazdnyRetezec() {
        String text1 = "";
        String text2 = " ";
        String text3 = "Metoda isEmpty() zjistí, jestli je řetězec prázdný - neobsahuje žádný znak. Pozor, i mezera je znak:";
        String text4 = null;  //prázdný objekt, žádná hodnota

        System.out.println(text1.isEmpty());
        System.out.println(text2.isEmpty());
        System.out.println(text3.isEmpty());
        System.out.println(text4.isEmpty()); //NullPointException, žádná hodnota - nelze volat metodu, platí pro všechny objekty
    }

    //  Uživatel například nakupuje přes internet a má vypsat názvy zboží. Jenže se mu tam vloudí malá a velká
    //  písmena tam, kde nepatří. Převedením textu na malá/velká písmena tuto chybu eliminujeme.
    public static void prevedPismena() {
        String text = "Chci koupit ROHliky, chLEBA, MáslO a VAJíčKA";
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
    }

    // Vstupy od uživatele je vhodné ořezat, k tomu slouží metoda trim(), ořeže text zvnějšku, vnitřní mezery nesmaže.
    public static void orezText() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte text, udělejte vpředu a vzadu mezery:");
        String text2 = sc.nextLine();
        System.out.println("Zadal jste text: " + text2);
        System.out.println("Text po funkci trim: " + text2.trim());
    }

    // Hodně používaná metoda je replace(), nahradí slovo nebo i nekolik slov v testu.
    public static void nahradSlovo() {
        Scanner sc = new Scanner(System.in);
        String text = "Moje malickost je nejlepsi v programovani.";
        System.out.println(text);
        System.out.println(text.replace("Moje malickost", "Muj tata"));
    }



    //substring
    public static void vytiskniCastTextu() {
        String text = "Tak tedy nevim, co by se dalo vytisknout. ";
        System.out.println(text.substring(15, 30));
    }

    // porovna dva retezce podle abecedy / vraci o kolik jsou slova od sebe
    public static void porovnejSlovaPodleAbecedy(String slovo1, String slovo2) {
        System.out.println(slovo1.compareTo(slovo2));
        System.out.println("ahoi".compareTo("ahoj"));
    }

}
