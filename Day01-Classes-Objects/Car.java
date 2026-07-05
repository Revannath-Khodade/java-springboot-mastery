public class Car {
    private String model;
    private double fuelLevel;

    public void setModel(String model) {
        this.model = model;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    // Drive method
    public void drive(double distance) {
        double fuelUsed = distance * 0.1; // Assume 0.1 liters per km

        if (fuelLevel >= fuelUsed) {
            fuelLevel -= fuelUsed;
            System.out.println(model + " drove " + distance + " km.");
        } else {
            System.out.println("Not enough fuel!");
        }
    }

    // Refuel method
    public void refuel(double amount) {
        fuelLevel += amount;
        System.out.println("Refueled " + amount + " liters.");
    }

    public void display() {
        System.out.println("Model: " + model);
        System.out.println("Fuel Level: " + fuelLevel + " liters");
    }

    public static void main(String[] args) {
        Car car = new Car();

        car.setModel("Toyota");
        car.setFuelLevel(20);

        car.display();

        car.drive(50);

        car.display();

        car.refuel(10);

        car.display();
    }
}