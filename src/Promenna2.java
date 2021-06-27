class Promenna2 {

    public static void main(String[] args) {

        int vek;                                                             // deklarace promenne
        vek = 25;                                                            // definice promenne = prirazeni hodnoty
        System.out.println("Hodnota promenne vek: " + vek);

        int mujVek = 36;                                                     // deklarace + definice promenne
        System.out.println("Hodnota promenne muj vek: " + mujVek);

        int vyska = 165;
        System.out.println("Hodnota promenne vyska: " + vyska);
        vyska = 170;                                                            // zmena hodnoty promenne
        System.out.println("Nova hodnota promenne vyska: " + vyska);

        vyska = vyska + 5;
        System.out.println("Nejnovejsi hodnota promenne vyska: " + vyska);

                                                                                    //      operace s cisly
        int prvniCislo = 20;                                                        // = je symbol prirazeni
        int druheCislo = 45;
        int soucetCisel = prvniCislo + druheCislo;                                  // vyrazy se vyhodnucuji za =
        System.out.println("Vysledek souctu cisel: " + soucetCisel);

        int nasobek = prvniCislo * druheCislo;
        System.out.println("Vysledek nasobeni cisel: " + nasobek);


    }
}
