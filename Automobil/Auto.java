package Automobil;

public class Auto {
    
    double tankFuellung;
    double averageConsumption;
    double maxTankFuellung;

    Auto (double tankFuellung, double maxTankFuellung ,double averageConsumption) {
        this.legeMaxTankfuellungFest(maxTankFuellung);
        this.legeTankfuellungFest(tankFuellung);
        this.legeAverageConsumptionFest(averageConsumption);
    };

    public void legeTankfuellungFest(double tankFuellung) {
        if (tankFuellung > this.liefereMaxTankfuellung()) {
            System.out.println("So viel kannst Du nicht tanken.");
            return;
        }
        else {
            this.tankFuellung = tankFuellung;
        };
    };

    public void legeAverageConsumptionFest(double averageConsumption) {
        this.averageConsumption = averageConsumption;
    };

    public void legeMaxTankfuellungFest(double maxTankFuellung) {
        this.maxTankFuellung = maxTankFuellung;
    };

    public void tanken(double tankFuellung) {
        if (tankFuellung > this.liefereMaxTankfuellung()) {
            System.out.println("So viel kannst Du nicht tanken. Der Tank wird bis zum maximum voll getankt.");
            this.tankFuellung = this.liefereMaxTankfuellung();
        }
        else {
            this.tankFuellung += tankFuellung;
        };
    };

    public double liefereMaxTankfuellung() {
        return this.maxTankFuellung;
    };

    public double liefereTankfuellung() {
        return this.tankFuellung;
    };

    public double liefereAverageConsumption() {
        return this.averageConsumption;
    };

    private double liefereMaximalMöglicheKilometerLeistung(double kilometers) {
        return (this.liefereTankfuellung() / this.liefereAverageConsumption()) * 100;
    };

    private boolean kannKilometerFahren(double kilometers) {
        return kilometers * (this.liefereAverageConsumption() / 100) <= this.tankFuellung;
    };

    private double liefereTankVerbrauch(double kilometers) {
        return kilometers * (this.liefereAverageConsumption() / 100);
    };

    public String fahren(double kilometers) {
        if (this.liefereTankfuellung() <= 0) {
            return "Tank ist leer, Du kannst nicht mehr fahren.";
        }
        else if (this.kannKilometerFahren(kilometers)){
            double neuerTankStand = this.liefereTankfuellung() - this.liefereTankVerbrauch(kilometers);;
            this.legeTankfuellungFest(neuerTankStand);
            return "Du kannst die angegebene Strecke fahren. Danach hast Du noch " + this.liefereTankfuellung() + " L Benzin. Das reicht für " + this.liefereMaximalMöglicheKilometerLeistung(kilometers) + " weitere Kilometer aus.";
        }
        else {
            return "shit";
        }
    };



}
