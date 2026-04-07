import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Original bogie list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        System.out.println("\nOriginal Bogies:");
        bogies.forEach(System.out::println);

        // Stream filtering (capacity > 60)
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        System.out.println("\nFiltered Bogies (Capacity > 60):");
        filteredBogies.forEach(System.out::println);

        // Verify original list unchanged
        System.out.println("\nOriginal list remains unchanged:");
        bogies.forEach(System.out::println);

        System.out.println("\nProgram completed.");
    }
}