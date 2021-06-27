import java.util.Scanner;

public class Retezce6 {

    public static void main(String[] args) {
//        obsahujeZacinaKonci();
//        jePrazdnyRetezec();
//        prevedPismena();
//        orezText();
//        nahradSlovo();
//        tiskniSFormatem();
        delkaTextu();
    }


    public static void obsahujeZacinaKonci() {
        String text = "Třída String obsahuje metody, které umožní zjistit, text nějaké slovní spojení nebo slovo:" +
                " obsahuje - contains()" +
                "začíná s ním - startsWith()" +
                "končí s ním - endsWith()" +
                "výsledkem je hodnota typu boolean - true, false";

        System.out.println(text.startsWith("Třída"));
        System.out.println(text.endsWith("hroch"));
        System.out.println(text.contains("které"));
        System.out.println(text.contains("roh"));
    }

    public static void jePrazdnyRetezec() {
        String text1 = "";
        String text2 = " ";
        String text3 = "Metoda isEmpty() zjistí, jestli je řetězec prázdný - neobsahuje žádný znak. Pozor, i mezera je znak:";
        String text4 = null;  //prázdný objekt, žádná hodnota

        System.out.println(text1.isEmpty());
        System.out.println(text2.isEmpty());
        System.out.println(text3.isEmpty());
        System.out.println(text4.isEmpty());    //NullPointException, žádná hodnota - nelze volat metodu, platí pro všechny objekty
    }

    public static void prevedPismena() {
//     Uživatel například nakupuje přes internet a má vypsat názvy zboží. Jenže se mu tam vloudí malá a velká
//     písmena tam, kde nepatří. Převedením textu na malá/velká písmena tuto chybu eliminujeme.
        String text = "Chci koupit ROHliky, chLEBA, MáslO a VAJíčKA";
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
    }

    public static void orezText() {
//      Vstupy od uživatele je vhodné ořezat, k tomu slouží metoda trim(), ořeže text zvnějšku, vnitřní mezery nesmaže.
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte text, udělejte vpředu a vzadu mezery:");
        String text2 = sc.nextLine();
        System.out.println("Zadal jste text: " + text2);
        System.out.println("Text po funkci trim: " + text2.trim());
    }


    public static void nahradSlovo() {
//      Hodně používaná metoda je replace(), nahradí slovo nebo i nekolik slov v testu.
        Scanner sc = new Scanner(System.in);
        String text = "Moje malickost je nejlepsi v programovani.";
        System.out.println(text);
        System.out.println(text.replace("Moje malickost", "Muj tata"));
    }


    public static void tiskniSFormatem() {
//     Metoda format() umožní vkládat pro tisk do textu značky = procento plus písmeno:
//     %s  String - text,   %c  char - znak,    %d  celá číslo,  % f   desetinn0 číslo - float
        int a = 10;
        int b = 20;
        int c = a + b;
        String s = String.format("Když sečteme %d a %d, dostaneme %d", a, b, c);
        System.out.println(s);
        //dalsi moznosti tisku:
        System.out.println(String.format("Když sečteme %d a %d, dostaneme %d", a, b, c));
        System.out.printf("Když sečteme %d a %d, dostaneme %d", a, b, c);

        float d = 45.56F;
        float e = 58.6957F;
        float f = d + e;
        String v = String.format("Když sečteme %f a %f, dostaneme %f", d, e, f);
        System.out.println(v);
    }

    public static void delkaTextu() {
//     Metoda length() vrátí počet znaků textu
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte nějaký text, ve kterém znáte počet písmen a mezer.");
        String text = sc.nextLine();
        System.out.printf("Délka vašeho textu je:  " + text.length() + "  znaků.");
    }
}
