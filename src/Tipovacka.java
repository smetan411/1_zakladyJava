import java.util.Scanner;

public class Tipovacka {
    public static void main(String[] args) {
        hraLogik();
    }


    public static void hraLogik() {
        int pocetCisel = 3;
        int cisla[] = new int[pocetCisel];
        for (int i = 0; i < pocetCisel; i++) {
            cisla[i] = (int) (Math.random() * 10);
        }

        String volba;
        int presne = 0;
        int priblizne = 0;
        Scanner sc = new Scanner(System.in, "UTF-8");
        for (int a = 0; a < 10; a++) {
            System.out.printf("Zadej dalsi kombinaci: ");
            volba = sc.nextLine() + "    ";
            presne = priblizne = 0;
            for (int i = 0; i < pocetCisel; i++) {
                if (cisla[i] == prevodCharNaCislo(volba.charAt(i))) {
                    presne++;
                } else {
                    for (int j = 0; j < pocetCisel; j++) {
                        if (cisla[i] == volba.charAt(j) - 48) {
                            priblizne++;
                            j = 10;
                        }
                    }
                }
            }

            if (presne == pocetCisel) {
                System.out.println("Gratuluji, vyhral jsi");
                a = 10;
            } else {
                System.out.printf("Spravne: %d, priblizne: %d\n\n", presne, priblizne);
            }
        }

        if (presne != pocetCisel) {
            System.out.printf("Prohral jsi, hledana kombinace byla: ");
            for (int i : cisla) {
                System.out.printf("%d", i);
            }
        }
    }

    static int prevodCharNaCislo(char c) {
        return c - 48;
    }
}
