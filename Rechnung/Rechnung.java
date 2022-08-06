package Rechnung;

import java.util.Arrays;

public class Rechnung {
    
    private double mehrWertSteuerSatz = 0.19;
    private Rechnungsposten[] rechnungsposten = new Rechnungsposten[100];
    private int counter = 0;
    private Kunde rechnungsKunde;

    Rechnung() {
    
    };

    Rechnung(Rechnungsposten rechnungsposten, Kunde rechnungsKunde) {
        this.fuegeRechnungspostenHinzu(rechnungsposten);
        this.fuegeRechnungsKundeHinzu(rechnungsKunde);
    };

    public void fuegeRechnungsKundeHinzu(Kunde rechnungsKunde) {
        this.rechnungsKunde = rechnungsKunde;
    };

    public Kunde liefereRechnungsKunde() {
        return this.rechnungsKunde;
    };

    public void fuegeRechnungspostenHinzu (Rechnungsposten rechnungsposten) {
        this.rechnungsposten[counter] = rechnungsposten;
        this.counter ++;
    };

    public Rechnungsposten[] liefereRechnungspostenListe() {
        return this.rechnungsposten;
    };

    
    public double liefereGesamtSumme() {
        double rechnungsBetrag = 0;
        try {
            for (Rechnungsposten repos: this.rechnungsposten) {
                rechnungsBetrag += repos.berechneGesamtbetrag();
            };

        }
        catch (NullPointerException exception){
            ;
        };
        return rechnungsBetrag;
    };

    public double berechneNettopreis(int rechnungspostennummer) {
        return this.liefereRechnungspostenListe()[rechnungspostennummer].berechneGesamtbetrag();
    };

    public double liefereMehrwertSteuerSatz() {
        return this.mehrWertSteuerSatz;
    };

    public double berechneMehrwertSteuer(int rechnungspostennummer) {
        return this.berechneNettopreis(rechnungspostennummer) * this.liefereMehrwertSteuerSatz();
    };

    public double berchneBruttopreis(int rechnungspostennummer) {
        return this.berechneNettopreis(rechnungspostennummer) * (1 + this.liefereMehrwertSteuerSatz());
    };

}
