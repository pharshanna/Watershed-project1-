public class WaterReading {
    double ph;
    double tempCelsius;

    public WaterReading(double ph, double tempCelsius) {
        this.ph = ph;
        this.tempCelsius = tempCelsius;
    }

    public boolean isAcidic() {
        return this.ph < 6.5;
    }

    public boolean isAlkaline() {
        return this.ph > 8.5;
    }
}
