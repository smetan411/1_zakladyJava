package metody2;

class Ukoly2 {

    public static void main(String[] args) {
        pozdrav();
        cenaPneumatik();
        prevodHodinNaSekundy();
        prevodRokuNaVek();
    }

    //    Vytvoř proměnné jmeno, prijmeni typu String. Do těchto proměnných přiřaď své jméno a příjmení.
    //    Metoda bude mít hlavičku: private static void pozdrav()
    //    Vypiš pozdrav ve tvaru:
    //    Ahoj, zdravi te {jmeno} {prijmeni}!
    private static void pozdrav() {
        String jmeno = "Jana";
        String prijmeni = "Mala";
        System.out.println("Ahoj, zdravi te " + jmeno + " " + prijmeni + "!");
    }

    //    Vytvoř dvě číselné proměnné pocetMotocyklu a pocetAut. Motocyklu je 20 a aut je o 5 méně.
    //    Vypocitej pocetPneumatik a urci celkovou cenu pneumatik.
    //    Pneumatika pro auto stoji 900,- Kc, pneumatika pro motocykl 600,-Kc.
    //    Metoda bude mít hlavičku: private static void cenaPneumatik()

    private static void cenaPneumatik() {
        int pocetMotocyklu = 20;
        int pocetAut = pocetMotocyklu -5;
        int cenaPneuAuto = 900;
        int cenaPneuMotocyklu = 600;
        int pocetPneumatik = pocetAut * 4 + pocetMotocyklu * 2;
        int cenaPneumatik = pocetAut * 4 * cenaPneuAuto + pocetMotocyklu * 2 * cenaPneuMotocyklu;
        System.out.println("V autoservisu je " + pocetPneumatik + " pneumatik a maji celkovou hodnotu " + cenaPneumatik + ",- korun.");
    }

    //   Naprogramuj jednoduchý převodník hodin na sekundy. Do proměnné pocetHodin přiřaď počet hodin,
    //   který správně převedeš na sekundy a výsledek uložíš do proměnné pocetSekund.
    //   Metoda bude mít hlavičku: private static void prevodHodinNaSekundy()
    //   Formát výpisu:
    //   {pocetHodin} hodin je {pocetSekund} sekund.
    private static void prevodHodinNaSekundy() {
        int pocetHodin = 10;
        int pocetMinut = pocetHodin * 60;
        int pocetSekund = pocetMinut * 60;
        System.out.println(pocetHodin + " hodin je " + pocetSekund + " sekund.");
    }

    //   Vytvoř proměnnou rokNarozeni, do které přiřadíš rok narození. Podle něj vypočti do proměnné vek
    //   aktuální věk a výsledek vypiš.
    //   Formát výpisu:
    //   Lidem narozenym v roce {rokNarozeni} je nyni {vek} let nebo o rok mene.
    private static void prevodRokuNaVek() {
        int rokNarozeni = 1975;
        int letosniRok = 2020;
        int vek = letosniRok - rokNarozeni;
        System.out.println("Lidem narozenym v roce " + rokNarozeni + " je nyni " + vek + " let nebo o rok mene.");
    }
}
