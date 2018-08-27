package Singleton.example;

public class TestCar {
    public static void main(String[] args) {
        Car car=Car.getInstance();
        System.out.println(car.hashCode());
        Car car2=Car.getInstance();
        car.hashCode();
        System.out.println(car2.hashCode());

    }
}
