class Ukoly4 {

    public static void main(String[] args) {
        pozdrav();
        husyAKralici();
        prevodHodinNaSekundy();
        prevodRokuNaVek();
    }

    private static void pozdrav() {
        String jmeno = "Jana";
        String prijmeni = "Mala";
        System.out.println("Ahoj, zdravi te " + jmeno + " " + prijmeni + "!");
    }

    private static void husyAKralici() {
        int pocetZvirat;
        int pocetNohou;
        int pocetHus = 20;
        int pocetKraliku = pocetHus - 5;
        pocetZvirat = pocetHus + pocetKraliku;
        int pocetNohHusy = 2;
        int pocetNohKralika = 4;
        int pocetHusichNoh = pocetHus * pocetNohHusy;
        int pocetKralicichNoh = pocetKraliku * pocetNohKralika;
        pocetNohou = pocetHusichNoh + pocetKralicichNoh;
        System.out.println("Na farme je " + pocetZvirat + " zvirat a maji " + pocetNohou + " nohou.");
    }

    private static void prevodHodinNaSekundy() {
        int pocetHodin = 10;
        int pocetMinut = pocetHodin * 60;
        int pocetSekund = pocetMinut * 60;
        System.out.println(pocetHodin + " hodin je " + pocetSekund + " sekund.");
    }

    private static void prevodRokuNaVek() {
        int rokNarozeni = 1975;
        int letosniRok = 2020;
        int vek = letosniRok - rokNarozeni;
        System.out.println("Lidem narozenym v roce " + rokNarozeni + " je nyni " + vek + " let nebo o rok mene.");
    }



}
