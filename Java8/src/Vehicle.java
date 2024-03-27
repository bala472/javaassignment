import java.awt.*;

public class Vehicle {
   public String brandName="Parent";

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
    public void  musicSpeaker(){
        System.out.println("Has no music player");
    }
}
class Car extends Vehicle{
   String brandName = "Ford";
   String lightColour="White";
    public void musicSpeaker(){
       System.out.println("Yes it has inbuilt music player");
   }
}
class Bike extends Vehicle{
    double price = 55000.232;

    public void canTravelWithFamily(){
        System.out.println("Atmost two people can travel");
    }
}
class displayResult{
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Car car1 = new Car();
        Bike bike1 = new Bike();
        vehicle.brandName="Test";
        System.out.println(vehicle.brandName);
        System.out.println(car.brandName);
        bike.musicSpeaker();
        System.out.println(car1.brandName);
        bike1.canTravelWithFamily();
    }
}
