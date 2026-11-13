package task09;

import java.util.HashMap;
import java.util.Map;


public class FineCalculator {
    private Map<String, Double> fines = new HashMap<>();

    public FineCalculator() {
        fines.put("STU-01", 0.0);
        fines.put("STU-02", 15.50);
    }

    public double getUnpaidFines(String studentId) {
        return fines.getOrDefault(studentId, 0.0);
    }
}