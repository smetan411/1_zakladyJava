package zaklady1;

class Pocitani2 {

    public static void main(String[] args) {
        //deklarujte a inicializujte promennou vek s hodnotou 25 let, vytisknete na radek s textem napr. "vek je: "
        int vek;
        vek = 25;
        System.out.println("Hodnota promenne vek: " + vek);

        // zmente hodnotu promenne vek napr. na 36 let a vytisknete na dalsi radek vcetne nejakeho textu
        vek = 36;
        System.out.println("Nova hodnota promenne vek: " + vek);


        //deklarujte dvě celočíselné proměnné a, b, přiřaďte jim hodnoty
        //vyzkoušejte sčítání, odčítání, násobení, celočíselné dělení a zbytek po dělení
        //výsledky vytisknět
        int a = 10;
        int b = 20;
        int soucet = a + b;
        int rozdil = a - b;
        int soucin = a * b;
        int podil = a / b;
        int zbytek = a % b;
        System.out.println("součet: " + soucet);
        System.out.println("rozdil: " + rozdil);
        System.out.println("součín: " + soucin);
        System.out.println("podíl: " + podil);
        System.out.println("zbytek po dělení: " + zbytek);
    }
}
