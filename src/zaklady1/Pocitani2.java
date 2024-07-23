package zaklady1;

class Pocitani2 {

    // vytvořte dvě celočíselné proměnné a, b a přiřaďte jim nějaké hodnoty
    // vytiskněte si jejich součet, rozdíl, součin, podíl, zbytek po dělení

    public static void main(String[] args) {
        int a = 10;
        int b = 25;

        //todo
        int soucet = a + b;
        System.out.println("soucet cisel je: " + soucet);
        System.out.println("rozcil cisel je: " + (a - b));
        System.out.println("soucin cisel je: " + (a * b) );
        System.out.println("podil cisel je: " + (a / b));
        System.out.println("zbytek po dělení je: " + (a % b));

        System.out.println();

    // nyní vytvořte dvě proměnné s desetinným číslem c, d a přiřaďte jim nějaké hodnoty
    // vytiskněte si jejich součet, rozdíl, součin, podíl, zbytek po dělení

        double c = 100.65;
        double d = 25.32;

        System.out.println("soucet cisel je: " + (c + d));
        System.out.println("rozcil cisel je: " + (c - d));
        System.out.println("soucin cisel je: " + (c * d) );
        System.out.println("podil cisel je: " + (c / d));

    }
}
