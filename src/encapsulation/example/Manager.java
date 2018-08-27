package encapsulation.example;

public class Manager {
   public static void main(String[] args) {

   Employee emp= new Employee("Smith");
      System.out.println(emp.getName());
      Employee emp2= new Employee("Smith1");
      System.out.println(emp.getName());
      System.out.println(emp.hashCode());
      System.out.println(emp2.hashCode());





   }



public static void work(){
   System.out.println("Smith work 40 hours");

}

}

