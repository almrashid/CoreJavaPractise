package Singleton.example;

public class TestCar {
    public static void main(String[] args) {
        Car c=Car.getOurInstance();
        System.out.println(c);
    }
}
