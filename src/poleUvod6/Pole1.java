package poleUvod6;

import java.util.Arrays;

public class Pole1 {
    public static void main(String[] args) {
//       vytvorPoleCisel();
//       vytvorPoleJmen();
//       poleCyklem();
//       vytvorNahodnePole();
    }

    // vytvorte pole cisel, pole vytiskni
    // mame tri zpusoby jak pole vytisknout - for, foreach, Arrays.toString
    public static void vytvorPoleCisel() {
        int[] pole = {5, 66, 94, 5, 2, 11, 87, 30, 50};
        //tisk s for
        for (int i = 0; i < pole.length; i++) {
            System.out.print(pole[i] + " ");
        }
        System.out.println();
        // tisk s foreach
        for (int s : pole) {
            System.out.print(s + " ");
        }
        System.out.println();
        // tisk s Arrays.toString()
        System.out.println(Arrays.toString(pole));
    }

    //vytvoř pole jmen
    // seřaď jména podle veliosti a toto pole vytiskni
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
        int[] suda = new int[20];
        for (int i = 0; i < suda.length; i++) {
            suda[i] = i + 1;
        }
        System.out.println("Tisk pole pomoci foreach - dobre");
        for (int s : suda) {
            System.out.print(s + " ");
        }
        System.out.println("\nTisk pomoci Arrays.toString() - dobre");
        System.out.println(Arrays.toString(suda));

        System.out.println("\nTisk pole spatne - vytiskne se odkaz na misto v pameti");
        System.out.println(suda);
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
