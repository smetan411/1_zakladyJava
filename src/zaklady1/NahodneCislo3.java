package zaklady1;

class NahodneCislo3 {

    public static void main(String[] args) {
        // vygenerujte pomoci metody random() nahodne cislo a priradte jeho hodnotu do promenne nahodneCislo, vytisknete
        double nahodneCislo = Math.random();
        System.out.println(nahodneCislo);

        // pokud promennou nebudete potrebovat, staci vytisknout primo jen hodnotu nahodneho cisla, zkuste to
        // pote vytvorte pomoci tisku prazdny radek
        System.out.println(Math.random());
        System.out.println();

        // vytvorte promennou typu double s nazvem meziNulouAStovkou a priradte do ni nahodne cislo mezi nulou a stovkou, vytisknete ji
        double meziNulouAStovkou = Math.random() * 100;
        System.out.println(meziNulouAStovkou);

        // nyni provedte totez ale se zaokrouhlenim na cele cislo
        double zaokrouhleno = Math.round(Math.random() * 100);
        System.out.println(zaokrouhleno);

        // vytisknete nahodne zaokrouhlene cislo mezi nulou a petkou
        double doPeti = Math.round(Math.random() * 5);
        System.out.println(doPeti);

        // pote vytvorte pomoci tisku prazdny radek
        System.out.println();

        // vygenerujte hraci kostku, ktera bude hazet cisla od jedne do sesti
        // přetypujte promennou kostka na int a uložte ji do proměnné kostkaInt
        // vytisknete vysledek hodu se slovnim doprovodem, napr. kostka hodila:
        double kostka = Math.round(Math.random() * 5 + 1);
        int kostkaInt = (int) kostka;
        System.out.println("kostka hodila: " + " " + kostkaInt);

        // vygenerujte podobnou hraci kostku, ktera bude hazet cisla od jedne do deseti
        double desetistrannaKostka = Math.round(Math.random() * 9 + 1);
        int desetistrannaInt = (int) desetistrannaKostka;
        System.out.println("kostka hodila: " + " " + desetistrannaInt);

    }
}


