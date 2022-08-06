package Angestellter;

public class Angestellter {
    
    String name, abteilungsname;
    double gehalt;
    int abteilungsnummer;
    Abteilung abteilung;

    Angestellter(final String name, final double gehalt) {
        this.legeNameFest(name);
        this.legeGehaltFest(gehalt);
    };

    Angestellter(final String name, final double gehalt, Abteilung abteilung) {
        this.legeNameFest(name);
        this.legeGehaltFest(gehalt);
        this.legeAbteilungFest(abteilung);
        this.legeAbteilungsNamenFest();
        this.legeAbteilungsNummerFest();
    };

    public void legeNameFest(String name) {
        this.name = name;
    };

    public void legeGehaltFest(double gehalt) {
        this.gehalt = gehalt;
    };

    public void legeAbteilungFest(Abteilung abteilung) {
        this.abteilung = abteilung;
    };

    public Abteilung liefereAbteilung() {
        return this.abteilung;
    };

    public void legeAbteilungsNummerFest() {
        this.abteilungsnummer = this.liefereAbteilung().liefereAbeitlungsnummer();
    };
    
    public void legeAbteilungsNamenFest() {
        this.abteilungsname = this.liefereAbteilung().liefereAbteilungsNamen();
    };

    public void erhoeheGehalt (double erhoehung) {
        this.gehalt = this.liefereGehalt() * (1 + erhoehung);
    };

    public String liefereAbteilungsNamen() {
        return this.abteilungsname;
    };

    public String liefereAngestelltenNamen() {
        return this.name;
    };

    public double liefereGehalt() {
        return this.gehalt;
    };

    public int liefereAbeitlungsnummer() {
        return this.abteilungsnummer;
    };

    @Override
    public String toString() {
        String employee = new String(this.liefereAbteilungsNamen() + ", ");
        employee += this.liefereAbeitlungsnummer() + ", ";
        employee += this.liefereAngestelltenNamen() + ", "; 
        employee += this.liefereGehalt();
        return employee;
    }
 
    public static void main(String[] args) {
        Abteilung test = new Abteilung("Tax Transformation", 110);
        Angestellter fl = new Angestellter("Florian Lübke", 44000, test);
        System.out.println(fl);
    }
}
