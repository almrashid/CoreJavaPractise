package Singleton.example;

public class Car {
    private static Car ourInstance = new Car();
    public static Car getInstance() {
        return ourInstance;
    }
    private Car() {
    }
}
