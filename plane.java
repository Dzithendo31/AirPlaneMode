public class plane {
    private String model;
    private int capacity;
    private String airline;

    public plane(String model, int capacity, String airline) {
        this.model = model;
        this.capacity = capacity;
        this.airline = airline;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getAirline() {
        return airline;
    }
    public String status() {
        return "undefined";
    }
    @Override
    public String toString() {
        return "Model: " + model + "\n" +
                "Capacity: " + capacity + "\n" +
                "Airline: " + airline;
    }
}
