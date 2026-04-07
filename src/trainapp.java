import java.util.HashMap;
import java.util.Map;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create HashMap for bogie -> capacity
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // Adding bogie capacities
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 50);
        bogieCapacityMap.put("First Class", 24);

        // Display bogie capacities
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> Capacity: " + entry.getValue());
        }

        System.out.println("\nTotal bogie types: " + bogieCapacityMap.size());

        System.out.println("\nProgram completed.");
    }
}