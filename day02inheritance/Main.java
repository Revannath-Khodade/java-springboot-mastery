package day02inheritance;

public class Main {
    public static void main(String[] args) {
        
        Vehicle vehicle = new Vehicle("Honda");
        vehicle.accelerate(50);
        System.out.println("-------------Vehicle------------");
        vehicle.printInfo();

        Car car = new Car("Toyota", 4);
        car.accelerate(40);
        System.out.println("---------------Car---------------");
        car.printInfo();

        ElectricCar electricCar = new ElectricCar("Tesla", 4, 100);
        System.out.println("--------=ElectricCar--------------");
        electricCar.printInfo();

        electricCar.accelerate(70);

        System.out.println("----------Electric Car After Accelerating------------");
        electricCar.printInfo();
    }
}
