package day02inheritance;

public class Vehicle {
    protected String brand;
    protected double speed;

    Vehicle(String brand) {
        this.brand = brand;
        this.speed = 0;
    }

    public void accelerate(int amount) {
        this.speed += amount;
    }

    public void printInfo() {
        System.out.println("brand; " + this.brand);
        System.out.println("speed: " + this.speed);
    }
}
