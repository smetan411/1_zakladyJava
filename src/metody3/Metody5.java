package metody3;

public class Metody5 {

    // vytvorte hlavni metodu s hlavickou  public static void main(String[] args)
    // hlavidku metody si vysvetlete
    // vytvorte ctyri metody pro scitani, odcitani, nasobeni a deleni
    // zavolejte tyto metody z main pro urcite hodnoty parametru a vytisknete vysledky
    public static void main(String[] args) {
        int soucet = scitani(5, 6);
        System.out.println("soucet cisel je: " + soucet);
        int rozdil = odcitani(7, 8);
        System.out.println("rozcil cisel je: " + rozdil);
        int soucin = nasobeni(9, 3);
        System.out.println("soucin cisel je: " + soucin);
        int podil = deleni(4, 2);
        System.out.println("podil cisel je: " + podil);
    }
    static int scitani(int a, int b) {
        int c = a + b;
        return c;
    }
    static int odcitani(int a, int b) {
        int c = a - b;
        return c;
    }
    static int nasobeni(int a, int b) {
        int c = a * b;
        return c;
    }
    static int deleni(int a, int b) {
        int c = a / b;
        return c;
    }
}
