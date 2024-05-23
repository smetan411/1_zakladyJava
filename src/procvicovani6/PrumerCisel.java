package procvicovani6;

// vytvor třídu, která vypočítá průměr ze zadaných čísel
// projedte kod pomoci debug a sledujte stav promennych

import java.util.Scanner;

public class PrumerCisel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pocet = 0;
        double soucet = 0.0;
        System.out.println("Zadej cisla pro vypocet prumeru.\n" + "Zadani ukonci pismenem.");
        boolean pokracovani = true;
        while (pokracovani) {
            System.out.println("Zadej cislo: ");
            if (sc.hasNextDouble()) {
                double zadaneCislo = sc.nextDouble();
                soucet += zadaneCislo;
                pocet++;
            } else {

                pokracovani = false;
            }
        }
        if (pocet > 0) {
            double prumer = soucet / pocet;
            System.out.println("Prumer je: " + prumer);
            System.out.println("Zadali jste " + pocet + " cisel.");
        } else {
            System.out.println("Byla zadana neplatna cisla.");
        }
    }
}
