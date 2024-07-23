package zaklady1;

class NahodneCislo4 {

    // vytvořte metodu s názvem hazimKostkou(), která představuje hrací kostku
    // nejprve ale v metodě trenujeme() natrénujte používání random()

    public static void main(String[] args) {
        trenujeme();
        hazimKostkou();
    }

    public static void trenujeme() {
        // vygenerujte pomoci metody Math.random() nahodne cislo
        // a priradte jeho hodnotu do promenne nahodneCislo, vytisknete
        System.out.println("Trénujeme: ");

        double nahodneCislo = Math.random();
        System.out.println(nahodneCislo);

        // zkuste tento kód v jednom kroku, rovnou do println()
        // pote vytvorte pomoci tisku prazdny radek
        System.out.println(Math.random());

        // vytvorte promennou typu double s nazvem
        // meziNulouAStovkou a priradte do ni nahodne
        // cislo mezi nulou a stovkou, vytisknete ji
        double meziNulouAStovkou = Math.random() * 100;
        System.out.println(meziNulouAStovkou);

        // nyni provedte totez ale se zaokrouhlenim na cele cislo
        double zaokrouhleno = Math.round(Math.random() * 100);
        System.out.println(zaokrouhleno);

        // vytisknete nahodne zaokrouhlene cislo mezi nulou a petkou
        // pote vytvorte pomoci tisku prazdny radek
        double doPeti = Math.round(Math.random() * 5);
        System.out.println(doPeti);
        System.out.println();

    }

    public static void hazimKostkou() {
        System.out.println("Házím kostkou: ");
        // vygenerujte hraci kostku, ktera bude hazet cisla od jedne do sesti:
        // nejprve vytvořte proměnnou double kostka
        // přetypujte kostku na int a uložte ji do proměnné kostkaInt
        // vytisknete vysledek hodu se slovnim doprovodem, napr. kostka hodila:
        double kostka = Math.round(Math.random() * 5 + 1);
        int kostkaInt = (int) kostka;
        System.out.println("Šestistranná kostka hodila: " + " " + kostkaInt);


        // vygenerujte podobnou hraci kostku, ktera bude hazet cisla od jedne do deseti
        double desetistrannaKostka = Math.round(Math.random() * 9 + 1);
        int desetistrannaInt = (int) desetistrannaKostka;
        System.out.println("Desetistranná kostka hodila: " + " " + desetistrannaInt);

    }
}


