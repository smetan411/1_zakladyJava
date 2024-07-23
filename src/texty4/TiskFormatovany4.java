package texty4;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

class TiskFormatovany4 {

    public static void main(String[] args) {

//         tiskniCisla();
//         tiskniDesetinnaCisla();
//         tiskniPismena();
//         tiskniStringy();
//         tiskniPravduNepravdu();
//        tiskniDatum();
        tiskniDatumNove();

    }

    static void tiskniCisla() {
        int a = 5;      // d jako decimal
        int b = 10;
        int c = a + b;
        System.out.printf("Soucet cisel %d a %d je %d.", a, b, c);
        System.out.printf("");
        System.out.println();
    }

    static void tiskniDesetinnaCisla() {
        float desetinneCislo = 2.58821f;  //f jako float
        System.out.printf("Tisknu cislo %f na urcity pocet desetinnych mist, napr. %.2f \n", desetinneCislo, desetinneCislo);
    }

    static void tiskniPismena() {
        char znak1 = 'a';  //c jako char - prvni pismeno
        char znak2 = 'b';
        System.out.printf("Tisknu pismeno %c a pismeno %c.", znak1, znak2);
        System.out.println();
    }

    static void tiskniStringy() {
        String slovo1 = "ahoj"; // s jako String, S velkymi pismeny
        String slovo2 = "nazdar";
        System.out.printf("Pozdravim bud %s nebo %s.\n", slovo1, slovo2);
        System.out.printf("Pozdravim bud %S nebo %S.", slovo1, slovo2);
        System.out.println();
    }

    static void tiskniPravduNepravdu() {
        boolean mamPravdu = true;       //b, B jako boolean
        System.out.printf("Mam pravdu? %b %B\n", mamPravdu, mamPravdu);
    }

// tisk s java.util
    static void tiskniDatum() {
        Date datum = new Date();          //tc jako time, char
        System.out.printf("Dnesni datum je: %tc\n", datum);
        System.out.printf("hodiny %tH , minuty %tM, sekundy %tS \n", datum, datum, datum);
        System.out.printf("cas %tT\n", datum);
        System.out.printf("den %tA  mesic %tB  rok %tY \n", datum, datum, datum);
    }

    // tisk s java.time
    static void tiskniDatumNove() {
        LocalDate datum = LocalDate.now();
        LocalTime cas = LocalTime.now();
        DateTimeFormatter formatData = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        DateTimeFormatter formatCasu = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.printf("Dnešní datum je: %s\n", datum.format(formatData));
        System.out.printf("Hodiny %02d, minuty %02d, sekundy %02d\n", cas.getHour(), cas.getMinute(), cas.getSecond());
        System.out.printf("Čas %s\n", cas.format(formatCasu));
        System.out.printf("Den %tA, měsíc %tB, rok %tY\n", datum, datum, datum);
    }



    //     retezec muzeme formatovat take pomoci metody String.format()
    //     %s  String - text,   %c  char - znak,    %d  celá číslo,  % f   desetinne číslo - float
    public static void tiskniSFormatem() {
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
        String v = String.format("Když sečteme %.2f a %.2f, dostaneme %.2f", d, e, f);
        System.out.println(v);
    }


}

