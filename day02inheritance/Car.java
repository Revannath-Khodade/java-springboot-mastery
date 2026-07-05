package day02inheritance;

public class Car extends Vehicle {
    protected int numDoors;

    Car(String brand, int numDoors) {
        super(brand);
        this.numDoors = numDoors;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Doors: " + numDoors);
    }
}
