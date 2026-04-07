case 7 -> {
        try {
        System.out.print("Enter Bogie ID to search: ");
String searchId = sc.next();

boolean found = service.searchBogieById(searchId);

        System.out.println(found ? "✅ Bogie found!" : "❌ Bogie not found!");

    } catch (IllegalStateException e) {
        System.out.println("⚠️ " + e.getMessage());
        }
        }