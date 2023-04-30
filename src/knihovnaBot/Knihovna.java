package knihovnaBot;

import java.util.ArrayList;
import java.util.List;

public class Knihovna {

    private List<Kniha> seznamKnih;

    public Knihovna() {
        this.seznamKnih = new ArrayList<>();
    }

    public void pridatKnihu(Kniha kniha) {
        this.seznamKnih.add(kniha);
    }

    public void odebratKnihu(Kniha kniha) {
        this.seznamKnih.remove(kniha);
    }

    public List<Kniha> vyhledatKnihu(String nazev) {
        List<Kniha> nalezeno = new ArrayList<>();
        for (Kniha kniha : this.seznamKnih) {
            if (kniha.getNazev().equals(nazev)) {
                nalezeno.add(kniha);
            }
        }
        return nalezeno;
    }

    public void vypisatKnihy() {
        for (Kniha kniha : this.seznamKnih) {
            System.out.println(kniha);
        }
    }
}

