package Automobil;

public class Autofahrt {
    
    public static void main(String[] args) {
        Auto corsi = new Auto(20, 60, 10);
        System.out.println(corsi.fahren(100));
        System.out.println(corsi.liefereTankfuellung());
        
        corsi.tanken(70);
        System.out.println(corsi.liefereTankfuellung());
        System.out.println(corsi.fahren(250));
    };
}
