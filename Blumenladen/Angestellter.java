package Blumenladen;

public class Angestellter extends Person{
    
    String adresse, svNummer;
    double gehalt;

    Angestellter(String name, String adresse, double gehalt, String svNummer) {
        super(name);
        this.adresse = adresse;
        this.gehalt = gehalt;
        this.svNummer = svNummer;
    };
}


