package Haltbarkeit;

public class Pflegemittel extends Zubehör implements BegrenztHaltbar {

    private Datum haltbarkeit;
    private boolean abgelaufen = false;

    Pflegemittel (Datum haltbarkeit) {
        this.legeHaltbarkeitFest(haltbarkeit);
    };

    public void legeHaltbarkeitFest(Datum haltbarkeit) {
        this.haltbarkeit = haltbarkeit;
    };

    @Override
    public Datum liefereHaltbarkeit() {

        return this.haltbarkeit;
    };

    public boolean liefereZustand() {
        return this.abgelaufen;
    };

    public void legeZustandFest(boolean abgelaufen) {
        this.abgelaufen = abgelaufen;
    };

    public static void main(String[] args) {
        System.out.println("413" + (2+4));
    }
    
}
