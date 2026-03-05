import java.util.HashMap;
import java.util.Map;

public class PollutionTracker {
    
    private Map<String, Sensor> njNetwork;

    public PollutionTracker() {
        this.njNetwork = new HashMap<>();
    }

    public void addSensor(Sensor s) {
        njNetwork.put(s.sensorID, s);
    }

    public void updateAndCheck(String id, double ph, double temp) {
        if (njNetwork.containsKey(id)) {
            Sensor s = njNetwork.get(id);
            s.updateReading(ph, temp);
            
            String status = s.getStatus();
            if (!status.equals("SAFE")) {
                System.out.println("!!! ALERT !!! " + s.locationName + " is " + status);
            }
        }
    }
}
