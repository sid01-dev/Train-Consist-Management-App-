public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create bogies
        GoodsBogie cylindrical = new GoodsBogie("Cylindrical");
        GoodsBogie rectangular = new GoodsBogie("Rectangular");

        // Safe assignment
        cylindrical.assignCargo("Petroleum");

        // Unsafe assignment
        rectangular.assignCargo("Petroleum");

        // Continue program
        rectangular.assignCargo("Coal");

        System.out.println("\nFinal Bogie States:");
        System.out.println(cylindrical);
        System.out.println(rectangular);

        System.out.println("\nProgram completed.");
    }
}