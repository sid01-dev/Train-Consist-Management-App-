class Bogie {
    String name;
    int capacity;

    // Constructor
    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // toString() for printing
    @Override
    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}