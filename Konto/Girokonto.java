package Konto;

public class Girokonto extends Konto{
    
    double dispoRahmen;

    Girokonto(double kontostand) {
        super(kontostand);
    }

    public boolean kannAbheben(double auszahlung) {
        return !(((this.liefereDispoKreditRahmen() + this.liefereKontostand()) - auszahlung) < 0);
    };

    public void zahleGeldAus(double auszahlung) {
        if (!this.kannAbheben(auszahlung)){
            System.out.println("keine Auszahlung möglich.");
        }
        else{
            this.kontostand -= auszahlung;
        }
    };

    public double liefereDispoKreditRahmen() {
        return this.dispoRahmen;
    }

    public void legeDispoKreditFest(double dispoKredit) {
        this.dispoRahmen = dispoKredit;
    }
        
}
