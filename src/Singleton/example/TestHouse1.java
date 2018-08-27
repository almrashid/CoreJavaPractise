package Singleton.example;

public class TestHouse1 {
    public static void main(String[] args) {
        House1 house=House1.getHouse();
        System.out.println(house.hashCode());

        House1 house1=House1.getHouse();
        System.out.println(house1.hashCode());
    }
}
