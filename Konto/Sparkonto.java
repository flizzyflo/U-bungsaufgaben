package Konto;

public class Sparkonto extends Konto{
    
    Sparkonto (double kontostand){
        super(kontostand);
    }

    public boolean kannAbheben(double auszahlung) {
        return this.liefereKontostand() - auszahlung < 0;
    }

    public void zahleGeldAus(double auszahlung) {
        if (this.kannAbheben(auszahlung)) {
            System.out.println("Nicht genug Geld auf dem Konto.");
        }
        else {
            System.out.println("geld ausgezahlt.");
            return;
        };
    };
}
