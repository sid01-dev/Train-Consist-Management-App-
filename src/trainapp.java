import java.util.*;
import java.util.stream.Collectors;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create bogie list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("Sleeper", 72));   // duplicate type
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("AC Chair", 56));  // duplicate type

        System.out.println("\nOriginal Bogies:");
        bogies.forEach(System.out::println);

        // Grouping by bogie name/type
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        System.out.println("\nGrouped Bogies:");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("\nType: " + entry.getKey());
            entry.getValue().forEach(System.out::println);
        }

        // Verify original list unchanged
        System.out.println("\nOriginal list remains unchanged:");
        bogies.forEach(System.out::println);

        System.out.println("\nProgram completed.");
    }
}