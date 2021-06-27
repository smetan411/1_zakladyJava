import java.util.Date;

class TiskFormatovany {

    public static void main(String[] args) {

        int a = 5;      // d jako decimal
        int b = 10;
        int c = a + b;
        System.out.printf("Soucet cisel %d a %d je %d.", a, b, c);
        System.out.println();

        char znak1 = 'a';  //c jako char - prvni pismeno
        char znak2 = 'b';
        System.out.printf("Tisknu pismeno %c a pismeno %c.", znak1, znak2);
        System.out.println();

        String slovo1 = "ahoj"; // s jako String, S velkymi pismeny
        String slovo2 = "nazdar";
        System.out.printf("Pozdravim bud %s nebo %s.\n", slovo1, slovo2);
        System.out.printf("Pozdravim bud %S nebo %S.", slovo1, slovo2);
        System.out.println();

        float desetinneCislo = 2.58821f;  //f jako float
        System.out.printf("Tisknu cislo %f na urcity pocet desetinnych mist, napr. %.2f \n", desetinneCislo, desetinneCislo);

        boolean mamPravdu = true;       //b, B jako boolean
        System.out.printf("Mam pravdu? %b %B", mamPravdu, mamPravdu);

        Date datum = new Date();          //tc jako time, char
        System.out.printf("Dnesni datum je: %tc\n", datum);
        System.out.printf("hodiny %tH , minuty %tm, sekundy %tS %n", datum, datum, datum);
        System.out.printf("cas %tT\n",  datum);
        System.out.printf("den %tA  mesic %tB  rok %tY %n", datum, datum, datum);


    }
}

