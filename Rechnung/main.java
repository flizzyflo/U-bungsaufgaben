package Rechnung;

public class main {
    
    public static void main(String[] args) {
        
        Artikel testart = new Artikel(69, "Penispumpe", 250);
        Artikel testart2 = new Artikel(70, "Ball", 20);
        Artikel testart3 = new Artikel(71, "Test", 10);
        Artikel testart4= new Artikel(72, "Kabel", 20);
        Artikel testart5 = new Artikel(73, "Bolzenschneider", 100);

        Rechnungsposten repo1 = new Rechnungsposten(1, testart);
        Rechnungsposten repo2 = new Rechnungsposten(1, testart2);
        Rechnungsposten repo3 = new Rechnungsposten(1, testart3);

        Rechnungsposten repo4 = new Rechnungsposten(10, testart4);
        Rechnungsposten repo5 = new Rechnungsposten(3, testart5);

        Kunde Meier = new Kunde("Meier", "Compton Street 5");
        Kunde Mueller = new Kunde("Mueller", "Compton Street 5");
       
        Rechnung rechnung1 = new Rechnung(repo1, Meier);
        Rechnung rechnung2 = new Rechnung(repo4, Mueller);
        
        rechnung1.fuegeRechnungspostenHinzu(repo2);
        rechnung1.fuegeRechnungspostenHinzu(repo3);

        rechnung2.fuegeRechnungspostenHinzu(repo5);

        Rechnung[] rechs = {rechnung1, rechnung2};

        Rechnungssammlung rechnungssamml = new Rechnungssammlung();
        rechnungssamml.fuegeRechnungHinzu(rechs);

        System.out.println(rechnungssamml.berechneKundenRechnungsSumme("Meier"));
        System.out.println(rechnungssamml.berechneKundenRechnungsSumme("Mueller"));

        System.out.println(rechnungssamml.findeTeuersteRechnung().liefereRechnungsKunde().liefereKundenname());

    }
}
