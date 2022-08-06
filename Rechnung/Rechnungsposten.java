package Rechnung;


public class Rechnungsposten {
    
    int anzahl;
    Artikel artikel;

    Rechnungsposten(int anzahl) {
        this.anzahl = anzahl;
    };

    Rechnungsposten(int anzahl, Artikel artikel) {
        this.anzahl = anzahl;
        this.artikel = artikel;
    };

    public void legeAnzahlFest(int neueAnzahl) {
        this.anzahl = neueAnzahl;
    };

    public void legeArtikelFest (Artikel neuerArtikel) {
        this.artikel = neuerArtikel;
    };

    public double berechneGesamtbetrag () {
        return this.liefereAnzahl() * this.liefereArtikel().lieferePreis();
    };

    public int liefereAnzahl() {
        return this.anzahl;
    };

    public Artikel liefereArtikel() {
        return this.artikel;
    };

    @Override
    public String toString() {
        return "(Anzahl Artikel: " + this.liefereAnzahl() + ", " + this.liefereArtikel() + ")";
    }
}
