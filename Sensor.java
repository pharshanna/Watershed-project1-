public class Sensor {
    String sensorID;
    String locationName;
    WaterReading currentReading;

    public Sensor(String id, String location) {
        this.sensorID = id;
        this.locationName = location;
        this.currentReading = null;
    }

    public void updateReading(double ph, double temp) {
        this.currentReading = new WaterReading(ph, temp);
    }

    public String getStatus() {
        if (currentReading == null) {
            return "NO DATA";
        }

        if (currentReading.ph < 6.0 || currentReading.ph > 9.0 || currentReading.tempCelsius > 31.0) {
            return "CRITICAL";
        } else if (currentReading.ph < 6.5 || currentReading.ph > 8.5 || currentReading.tempCelsius > 28.0) {
            return "WARNING";
        } else {
            return "SAFE";
        }
    }

    public void displayReport() {
        System.out.println("Report for " + sensorID + " (" + locationName + ")");
        if (currentReading != null) {
            System.out.println("Status: " + getStatus());
            System.out.println("pH: " + currentReading.ph);
            System.out.println("Temp: " + currentReading.tempCelsius + "°C");
        } else {
            System.out.println("Status: Waiting for data...");
        }
    }
}
