public class Main {
    public static void main(String[] args) {
        PollutionTracker njSentinel = new PollutionTracker();

        Sensor s1 = new Sensor("NJ-RAR-01", "Raritan River - New Brunswick");
        Sensor s2 = new Sensor("NJ-PAS-05", "Passaic River - Paterson");
        Sensor s3 = new Sensor("NJ-DEL-12", "Delaware River - Trenton");

        njSentinel.addSensor(s1);
        njSentinel.addSensor(s2);
        njSentinel.addSensor(s3);

        System.out.println("--- Starting NJ Watershed Monitoring Simulation ---\n");

        System.out.println("LOG: Updating Raritan River data..."); //perfect 
        njSentinel.updateAndCheck("NJ-RAR-01", 7.4, 18.2); 

        System.out.println("LOG: Updating Passaic River data..."); //acidic 
        njSentinel.updateAndCheck("NJ-PAS-05", 5.8, 24.5); 

        System.out.println("LOG: Updating Delaware River data..."); //high temp
        njSentinel.updateAndCheck("NJ-DEL-12", 8.2, 31.0); 

        System.out.println("\n--- Simulation Complete ---");
    }
}