package procvicovani6;

import java.util.Random;
import java.util.Scanner;

public class HadaniCisla {


    public static void main(String[] args) {
        Random rand = new Random();
        int cislo = rand.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int pokus = 0;
        int tip = 0;

        System.out.println("Vítejte ve hře 'Hádej číslo'!");
        System.out.println("Myslím si číslo mezi 1 a 100. Dokážete ho uhodnout?");

        while (tip != cislo) {
            System.out.print("Zadejte svůj tip: ");
            tip = scanner.nextInt();
            pokus++;

            if (tip < cislo) {
                System.out.println("Moje číslo je větší.");
            } else if (tip > cislo) {
                System.out.println("Moje číslo je menší.");
            } else {
                System.out.println("Gratuluji! Uhodli jste číslo za " + pokus + " pokusů.");
            }
        }

        scanner.close();
    }
}
