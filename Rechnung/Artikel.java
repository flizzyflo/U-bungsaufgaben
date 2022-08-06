package Rechnung;
public class Artikel {
    
    long artikelnr;
    double preis;
    String beschreibung;
    
    Artikel(long artikelnr, String beschreibung, double preis) {
        this.artikelnr = artikelnr;
        this.beschreibung = beschreibung;
        this.preis = preis;
    };

    public void legeArtikelnummerFest(long neueNr) {
        this.artikelnr = neueNr;
    };

    public void legeBeschreibungFest (String neueB) {
        this.beschreibung = neueB;
    };

    public void legePreisFest(double neuerPreis) {
        this.preis = neuerPreis;
    };

    public long liefereArtikenummer () {
        return this.artikelnr;
    };

    public String liefereBeschreibung() {
        return this.beschreibung;
    };

    public double lieferePreis () {
        return this.preis;
    };

    @Override
    public String toString() {
        return "(Artikel: "+ this.liefereBeschreibung() + ", Preis: " + this.lieferePreis() + ", Art.Nr.: " + this.liefereArtikenummer() + ")";
    };
}
