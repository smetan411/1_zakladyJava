package knihovnaBot;

public class Kniha {
    private String nazev;
    private String autor;

    public Kniha(String nazev, String autor) {
        this.nazev = nazev;
        this.autor = autor;
    }

    public String getNazev() {
        return this.nazev;
    }

    public String getAutor() {
        return this.autor;
    }

    public String toString() {
        return "Název: " + this.nazev + ", Autor: " + this.autor;
    }
}
