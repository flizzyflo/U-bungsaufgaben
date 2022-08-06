package Rechnung;

public class Rechnungssammlung {
    private Rechnung[] rechnungen = new Rechnung[2];

    
    
    public double berechneKundenRechnungsSumme(String kundenname) {
        double totalSum = 0;

        for (Rechnung rechnungen : this.rechnungen) {

            if (rechnungen.liefereRechnungsKunde().liefereKundenname().equals(kundenname)) {
                totalSum += rechnungen.liefereGesamtSumme(); 
            }
        }
        return totalSum;
    };

    public void fuegeRechnungHinzu(Rechnung[] rechnungen) {
        int counter = 0;
        for (Rechnung rechnung: rechnungen) {
            this.rechnungen[counter] = rechnung;
            counter ++;
        }
    };

    public Rechnung findeTeuersteRechnung() {
        
        Rechnung teuersteRechnung = null;
        for (Rechnung rech: this.rechnungen) {

            if (teuersteRechnung == null) {
                teuersteRechnung = rech;
            }

            else if (rech.liefereGesamtSumme() > teuersteRechnung.liefereGesamtSumme()){
                teuersteRechnung = rech;
            };
        }
        return teuersteRechnung;
    }
}
