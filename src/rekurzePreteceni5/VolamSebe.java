package rekurzePreteceni5;

public class VolamSebe {

    public static void main(String[] args) {

        int n = 5;
        System.out.println("faktorial cisla " + n + " je: " + faktorial(n));

        int a = 15, b = 25;
        System.out.println("nejvetsi spolecny delitel pro " + a +
                " a " + b + " je: " + nejvetsiSpolDelitel(a, b));

        int zaklad = 2, exponent = 30;
        System.out.println("vypocet mocniny: " + zaklad + "^"
                + exponent + " = " + mocnina(zaklad, exponent));
    }
    // Rekurzivní funkce pro výpočet faktorialu
    static int faktorial(int n) {
        int vysledek;
        if (n == 1)
            return 1;
        vysledek = faktorial(n - 1) * n;
        return vysledek;
    }

    // Rekurzivní funkce pro výpočet nejvetsiho spolecneho delitele
    public static int nejvetsiSpolDelitel(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return nejvetsiSpolDelitel(b, a % b);
        }
    }

    // Rekurzivni funkce pro vypocet mocniny
    public static int mocnina(int zaklad, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return zaklad * mocnina(zaklad, exponent - 1);
        }
    }
}

