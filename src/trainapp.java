import java.util.ArrayList;
import java.util.List;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Passenger bogies list
        List<String> passengerBogies = new ArrayList<>();

        // Adding bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("\nPassenger bogies after addition:");
        System.out.println(passengerBogies);

        // Removing a bogie
        passengerBogies.remove("AC Chair");

        System.out.println("\nPassenger bogies after removal:");
        System.out.println(passengerBogies);

        // Checking existence
        boolean exists = passengerBogies.contains("Sleeper");

        System.out.println("\nDoes Sleeper exist? " + exists);

        // Final state
        System.out.println("\nFinal passenger bogie list:");
        System.out.println(passengerBogies);

        System.out.println("\nProgram completed.");
    }
}
