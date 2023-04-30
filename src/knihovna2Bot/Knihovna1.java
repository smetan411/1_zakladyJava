package knihovna2Bot;

import java.util.HashMap;
import java.util.Map;

public class Knihovna1 {
    private Map<String, String> knihy;

    public Knihovna1() {
        knihy = new HashMap<String, String>();
    }

    public void pridatKnihu(String nazev, String autor) {
        knihy.put(nazev, autor);
    }

    public void odebratKnihu(String nazev) {
        knihy.remove(nazev);
    }

    public void vypisKnihy() {
        for (String nazev : knihy.keySet()) {
            System.out.println(nazev + " - " + knihy.get(nazev));
        }
    }

    public void najitKnihu(String hledanyNazev) {
        for (String nazev : knihy.keySet()) {
            if (nazev.equals(hledanyNazev)) {
                System.out.println(nazev + " - " + knihy.get(nazev));
                return;
            }
        }
        System.out.println("Kniha nenalezena.");
    }
}

