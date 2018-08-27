package Singleton.example;

public class Car {
    public static Car getOurInstance() {
        return ourInstance;
    }

    private static Car ourInstance = new Car();

    private Car() {
    }
}
