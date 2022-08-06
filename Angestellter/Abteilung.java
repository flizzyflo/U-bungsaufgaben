package Angestellter;

public class Abteilung {
    
    String abteilungsname;
    int abteilungsnummer;

    Abteilung(String abteilungsname, int abteilungsnummer) {
        this.legeAbteilungsNamenFest(abteilungsname);
        this.legeAbteilungsNummerFest(abteilungsnummer);

    };

    public void legeAbteilungsNummerFest(int abteilungsnummer) {
        this.abteilungsnummer = abteilungsnummer;
    };
    
    public void legeAbteilungsNamenFest(String abteilungsname) {
        this.abteilungsname = abteilungsname;
    };

    public String liefereAbteilungsNamen() {
        return this.abteilungsname;
    };
    
    public int liefereAbeitlungsnummer() {
        return this.abteilungsnummer;
    };
}
