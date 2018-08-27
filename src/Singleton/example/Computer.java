package Singleton.example;

public class Computer {
    private static Computer ourInstance = new Computer();

    private Computer() { //make constructor
    }

    public static Computer getOurInstance() {
        return ourInstance;
    }

    public static void setOurInstance(Computer ourInstance) {
        Computer.ourInstance = ourInstance;
    }
}
