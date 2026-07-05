package day02inheritance;

public class ElectricCar extends Car {
    protected double batteryLevel;

    ElectricCar(String brand, int numDoors, double batteryLevel) {
        super(brand, numDoors);
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void accelerate(int amount) {
        super.accelerate(amount);
        this.batteryLevel -= amount/10;

        if(batteryLevel < 0) {
            batteryLevel = 0;
        }
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Battery Level: " + this.batteryLevel);
    }
}
