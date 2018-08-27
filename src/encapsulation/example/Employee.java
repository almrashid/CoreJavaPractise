package encapsulation.example;

public class Employee {
    String name="";

    public String getName() {
        return name;
    }

    public Employee(String name) {
        this.name = name;
    }

   private Employee() {
   }
}

