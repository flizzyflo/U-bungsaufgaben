package Blumenladen;

public class Premiumkunde extends Kunden {
    
    String adresse;
    int kundennummer;

    Premiumkunde(String name, String adresse, int kundennummer) {
        super(name);
        this.adresse = adresse;
        this.kundennummer = kundennummer;
        
    }
}
