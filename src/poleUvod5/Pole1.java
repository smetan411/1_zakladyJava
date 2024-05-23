package poleUvod5;

import java.util.Arrays;

public class Pole1 {
    public static void main(String[] args) {
//       vytvorPoleCisel();
//       vytvorPoleJmen();
       poleCyklem();
//       vytvorNahodnePole();
    }

    // vytvorte pole celych cisel, pole vytisknete
    // mame tri zpusoby jak pole vytisknout - for, foreach, Arrays.toString
    public static void vytvorPoleCisel() {
        int[] poleCisel = {5, 66, 94, 5, 2, 11, 87, 30, 50};
        //tisk s for
        for (int i = 0; i < poleCisel.length; i++) {
            System.out.print(poleCisel[i] + " ");
        }
        System.out.println();
        // tisk s foreach
        for (int prvekPole : poleCisel) {
            System.out.print(prvekPole + " ");
        }
        System.out.println();
        // tisk s Arrays.toString()
        System.out.println(Arrays.toString(poleCisel));
    }

    //vytvoř pole jmen
    // seřaď jména podle abecedy a toto pole vytiskni
    // způsob tisku si zvol podle předchozího příkladu
    public static void vytvorPoleJmen(){
        String[] jmena = {"Pavel", "Eva", "Hana", "Jitka", "Libor"};
        Arrays.sort(jmena);
        //tisk s for
        for (int i = 0; i < jmena.length; i++) {
            System.out.print(jmena[i] + " ");
        }
        System.out.println();
        // tisk s foreach
        for (String s : jmena) {
            System.out.print(s + " ");
        }
        System.out.println();
        // tisk s Arrays.toString()
        System.out.println(Arrays.toString(jmena));
    }


    // naplńte pole pomocí cyklu tak, aby obsahovala čísle od 1 do 20
    // predvedte tisk spatne a dobre - pomoci foreach a Arrays.toString()
    public static void poleCyklem() {
        int[] cisla = new int[20];
        for (int i = 0; i < cisla.length; i++) {
            cisla[i] = i + 1;
        }
        System.out.println("Tisk pole pomoci foreach - dobre");
        for (int s : cisla) {
            System.out.print(s + " ");
        }
        System.out.println("\nTisk pomoci Arrays.toString() - dobre");
        System.out.println(Arrays.toString(cisla));

        System.out.println("\nTisk pole spatne - vytiskne se odkaz na misto v pameti");
        System.out.println(cisla);
    }

    // vytvořte pole deseti celých čísel tak, aby čísla byla náhodná
    // velikost čísel mezi 0 a 100
    // vytisknete toto pole
    // seřaďte pole podle velikosti a opět ho vytisknete
    public static void vytvorNahodnePole() {
        int[] poleCisel = new int[10];
        for (int i = 0; i < 10; i++) {
            poleCisel[i] = (int) Math.round(Math.random() * 100);
        }
        for (int prvek : poleCisel) {
            System.out.print(prvek + " ");
        }
        System.out.println();
        Arrays.sort(poleCisel);
        System.out.println(Arrays.toString(poleCisel));
    }
}
