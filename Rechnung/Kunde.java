package Rechnung;
public class Kunde {
    
    private String name, anschrift;

    Kunde(String name, String anschrift) {
        this.legeNameFest(name);
        this.legeAnschriftFest(anschrift);;
    };

    public void legeNameFest(String name) {
        this.name = name;
    };

    public void legeAnschriftFest (String anschrift) {
        this.anschrift = anschrift;
    };

    public String liefereKundenname() {
        return this.name;
    };

}
