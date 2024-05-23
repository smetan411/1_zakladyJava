package poleUvod5;

import java.util.Arrays;

public class Pole2 {
    public static void main(String[] args) {
//        plnimePole();
//        radimePole();
        poleChar();
    }

    // vytvořte pole celých čísel dvěma způsoby - výpisem prvků a cyklem
    // obě pole vytiskněte pomocí cyklu Arrays.toString()
    public static void plnimePole() {
        int[] prvniPole = {5, 6, 9, 5, 78, 2};

        int[] druhePole = new int[10];
        for (int i = 0; i < druhePole.length; i++) {
            druhePole[i] = (i + 1) * 4;
        }

        System.out.println(Arrays.toString(prvniPole));
        System.out.println(Arrays.toString(druhePole));
    }

    // vytvořte pole Stringů a seřaďte ho podle abecedy
    // vytvořte pole deseti čísel typu float a seřaďte je podle velikosti
    // obě pole vytiskněte pomocí foreach
    public static void radimePole() {
        String[] prvniPole = {"Beda", "Anezka", "Hana", "Zbynek"};
        Arrays.sort(prvniPole);
        float[] druhePole = new float[10];
        for (int i = 0; i < druhePole.length; i++) {
            druhePole[i] = i * 1.125f;
        }
        for (String b : prvniPole) {
            System.out.print(b + "; ");
        }
        System.out.println();
        for (float b : druhePole) {
            System.out.print(b + "; ");
        }
    }

    // vytvořte pole prvků typu char
    // podívejte se na tabulku ASCII a naplňte pole cyklem
    // pole vytiskněte pomoci for
    public static void poleChar() {
        char[] druhePole = new char[26];
        for (int i = 0; i < 26; i++) {
            druhePole[i] = (char)(i+97);
            System.out.println(druhePole[i] + ")");
        }
    }
}
