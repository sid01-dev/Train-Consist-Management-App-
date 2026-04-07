public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        try {
            // Valid bogie
            PassengerBogie sleeper = new PassengerBogie("Sleeper", 72);
            System.out.println("\nCreated: " + sleeper);

            // Invalid bogie (negative capacity)
            PassengerBogie invalid = new PassengerBogie("AC Chair", -10);
            System.out.println("Created: " + invalid);

        } catch (InvalidCapacityException e) {
            System.out.println("\nException Occurred: " + e.getMessage());
        }

        System.out.println("\nProgram completed.");
    }
}