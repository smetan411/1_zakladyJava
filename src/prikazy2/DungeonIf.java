package prikazy2;

import java.util.Random;
import java.util.Scanner;

public class DungeonIf {

    public static void main(String[] args) {
        DungeonIf dungeonIf = new DungeonIf();
        monstrum();
        zivoty();
        ktereMonstrumJeVetsi();
    }
    //porovnami cisel
    //nahodna cisla
    //porovnani retezcu

    //nahodna retezcu
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

    static int zivoty()
    {
        String monstrum = monstrum();
        if (monstrum == null) {
            System.out.println("Monstrum neexistuje");
            return 0;
        }
        int zivoty = new Random().nextInt(6) + 1;
        System.out.println(monstrum + " ma " + zivoty + " zivotu");
        return zivoty;
    }

    static void ktereMonstrumJeVetsi()
    {
        String monstrumPrvni = monstrum();
        System.out.println("Zadej pocet zivotu pro: " + monstrumPrvni);
        Scanner sc = new Scanner(System.in);
        int zivotyProPrivniMosntrum = Integer.parseInt(sc.nextLine());

        String monstrumDruhe = monstrum();
        System.out.println("Zadej pocet zivotu pro: " + monstrumDruhe);
        Scanner scdva = new Scanner(System.in);
        int zivotyProDruheMosntrum = Integer.parseInt(scdva.nextLine());

        if (zivotyProDruheMosntrum > zivotyProPrivniMosntrum) {
            System.out.println(monstrumPrvni + " je vetsi nez " + monstrumDruhe);
        } else if (zivotyProDruheMosntrum == zivotyProPrivniMosntrum) {
            System.out.println("Obe monstra jsou stejně velká.");
        }
    }
}
