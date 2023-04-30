package knihovna2Bot;

public class Knihovna1Main {
    public static void main(String[] args) {


        Knihovna1 knihovna = new Knihovna1();

        knihovna.pridatKnihu("Válka světů", "H.G. Wells");
        knihovna.pridatKnihu("1984", "George Orwell");
        knihovna.pridatKnihu("Malý princ", "Antoine de Saint-Exupéry");

        knihovna.vypisKnihy();
// Válka světů - H.G. Wells
// 1984 - George Orwell
// Malý princ - Antoine de Saint-Exupéry

        knihovna.najitKnihu("1984"); // 1984 - George Orwell
        knihovna.najitKnihu("Harry Potter"); // Kniha nenalezena.

        knihovna.odebratKnihu("Malý princ");

        knihovna.vypisKnihy();
// Válka světů - H.G. Wells
// 1984 - George Orwell
    }
}