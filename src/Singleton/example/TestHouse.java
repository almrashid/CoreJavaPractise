package Singleton.example;

public class TestHouse {
    public static void main(String[] args) {
        House house = House.getAccess();
        System.out.println( house.hashCode());
        House house1 = House.getAccess();
        System.out.println( house1.hashCode());



    }
}
