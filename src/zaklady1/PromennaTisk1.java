package zaklady1;

class PromennaTisk1 {

    public static void main(String[] args) {

        // vytvořte proměnnou s názvem mujKamarad a přiřaďte jí jméno kamaráda, vytiskněte jméno kamaráda
        // na další řádek vytiskněte stejným způsobem jiného kamaráda
        String mujKamarad = "Jan";
        System.out.println(mujKamarad);
        String jinyKamarad = "Pavel";
        System.out.println(jinyKamarad);

        // vytvořte celočíselnou proměnnou s názvem mojeCislo a přiřaďte jí hodnotu 100, číslo vytiskněte
        // změňte velikost čísla a vytiskněte ho vedle prvního čísla na stejný řádek
        int mojeCislo = 100;
        System.out.print(mojeCislo + " ");
        mojeCislo = 50;
        System.out.println(mojeCislo);

        // deklarujte a inicializujte proměnnou a přiřaďte jí hodnotu pro všechny datové typy, které známe
        // celé číslo, desetinné číslo, text, pravdivostní hodnotu, libovolný znak
        // hodnoty si vymyslete a všechny je vytiskněte
        int celeCislo = 20;
        double desetinneCislo = 333.3;
        String text = "Nojo text.";
        boolean mojePravda = false;
        char znak = 'p';
        System.out.println(celeCislo + " " + desetinneCislo + " " + text + " " + mojePravda + " " + znak);
    }
}

