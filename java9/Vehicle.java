
public class Vehicle {
    public String brandName = "Parent";
    public String getBrandName() {
        return brandName;
    }
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
    public void musicSpeaker() {
        System.out.println("Has no music player");
    }
    public void start() {
        System.out.println("Vehicle started.");
    }
    public void stop() {
        System.out.println("Vehicle stopped.");
    }
}

class Car extends Vehicle {
    String brandName = "Ford";
    String lightColour = "White";
    public void musicSpeaker() {
        System.out.println("Yes, it has an inbuilt music player");
    }
    public void start() {
        System.out.println("Car started.");
    }
    public void stop() {
        System.out.println("Car stopped.");
    }
}

class Bike extends Vehicle {
    double price = 55000.232;

    public void canTravelWithFamily() {
        System.out.println("At most two people can travel");
    }
    public void start() {
        System.out.println("Bike started.");
    }
    public void stop() {
        System.out.println("Bike stopped.");
    }
}

class displayResult {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Car car1 = new Car();
        Bike bike1 = new Bike();
        vehicle.brandName = "Test";
        System.out.println(vehicle.brandName);
        System.out.println(car.brandName);
        bike.musicSpeaker();
        System.out.println(car1.brandName);
        bike1.canTravelWithFamily();
        vehicle.start();
        vehicle.stop();
        car.start();
        car.stop();
        bike.start();
        bike.stop();
    }
}
