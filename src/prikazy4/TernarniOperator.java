package prikazy4;

import java.util.Scanner;

public class TernarniOperator {

    public static void main(String[] args) {
//        porovnejCisla();
//        zjistiVelikostCisla();
//        porovnejHeslo();
        porovnejText();
    }

    // napiste metodu, ktera vygeneruje dve nahodna cela cisla 0 az 10
    // pomoci prikazu ternarniho operatoru vytisknete vetsi cislo
    static void tiskniVetsi() {
        int prvniCislo = (int) Math.round(Math.random() * 10);
        int druheCislo = (int) Math.round(Math.random() * 10);
        System.out.println(prvniCislo);
        System.out.println(druheCislo);
        System.out.println((prvniCislo > druheCislo) ? prvniCislo : druheCislo);
    }

    // napiste metodu, ktera si vyzada od uzivatele cislo
    // pomoci ternarniho operatoru zjistete, jestli je cislo
    // vetsi nebo mensi nez vami zadane cislo
    // a vysledek vytisknete
    static void zjistiVelikostCisla() {
        System.out.println("Zadej cislo, zjistim kde lezi na ciselne ose.");
        double cislo = Double.parseDouble(new Scanner(System.in).nextLine());
        if (cislo != 0) {
            System.out.println(cislo < 0 ? "Cislo je zaporne" : "Cislo je kladne.");
        }
        else System.out.println("Cislo je nula.");;
    }

    // napiste metodu, ktera si vyzada od uzivatele heslo
    // a porovna ho se zadanym heslem
    // pro porovnani pouzijte ternarni operator
    // informujte uzivatele o vysledku porovnani
    static void porovnejHeslo(){
        System.out.println("Zadej heslo.");
        String heslo = new Scanner(System.in).nextLine();
        boolean hesloSouhlasi = heslo.equals("tohleJeMojeHeslo123")? true: false;
        System.out.println("Porovnani zadaneho hesla (true/false):  " + hesloSouhlasi);
        //varianta tisku
        System.out.println(heslo.equals("tohleJeMojeHeslo123")? "Heslo je v poradku.": "Nespravne heslo.");
    }

    // napiste metodu, ktera si vyzada od uzivatele text
    // pomoci ternarniho operatoru zjisti delku textu
    // nebo rekne ze v textu neni zadny znak
    static void porovnejText() {
        System.out.println("Napis na dalsi radek text.");
        //Scanner scanner = new Scanner(System.in);
        //String text = scanner.nextLine();
        String text = new Scanner(System.in).nextLine();
        System.out.println(text.isEmpty() ? "V textu neni zadny znak." : "Delka textu je " + text.length() + " znaky/znaku.");
    }

}
