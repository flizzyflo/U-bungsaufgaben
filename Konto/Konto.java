package Konto;

public abstract class Konto {
    
    double kontostand;

    Konto(double kontostand) {
        this.kontostand = kontostand;
    }

    public void zahleGeldEin(double einzahlung) {
        this.kontostand += einzahlung;
    };

    public double liefereKontostand() {
        return this.kontostand;
    };

    abstract public boolean kannAbheben(double auszahlung);

    abstract public void zahleGeldAus(double auszahlung);

}

