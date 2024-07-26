package prikazy2;

import java.util.Random;
import java.util.Scanner;

public class DungeonIf {

    public static void main(String[] args) {
        String monstrum1 = monstrum();
        if (monstrum1 == null) return;
        String monstrum2 = monstrum();
        if (monstrum2 == null) return;
        ktereMonstrumJeVetsi(monstrum1, monstrum2);
    }

    // vytvořte metodu, která definuje monstrum
    // do if si napíšeme, která monstra známe
    // metoda si vyžádá monstrum a zjistí, jestli je to naše monstrum
    static String monstrum()
    {
        System.out.println("Zadej monstrum");
        Scanner sc = new Scanner(System.in);
        String monstrum = sc.nextLine();

        if (monstrum.isEmpty()) {
            System.out.println("Monstrum  nebylo zadano");
            return null;
        } else if ("vlk".equals(monstrum) || "trpaslik".equals(monstrum)) {
            System.out.println("Monstrum zname a jmenuje se " + monstrum);
            return monstrum;
        }
        else {
            System.out.println("Zadali jste nezname monstrum");
            return null;
        }
    }

    static int zivot(String monstrum){
        if ("vlk".equals(monstrum)) {
            return 10;
        } else if ("trpaslik".equals(monstrum)) {
            return 5;
        } else {
            return -1;
        }
    }

    static void ktereMonstrumJeVetsi(String monstrumPrvni, String monstrumDruhe)
    {
        if (zivot(monstrumPrvni) > zivot(monstrumDruhe)) {
            System.out.println(monstrumPrvni + " je vetsi nez " + monstrumDruhe);
        } else if (zivot(monstrumPrvni) == zivot(monstrumDruhe)) {
            System.out.println("Obe monstra jsou stejně velká.");
        } else {
            System.out.println(monstrumDruhe + " je vetsi nez " + monstrumPrvni);
        }
    }
}
