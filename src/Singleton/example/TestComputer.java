package Singleton.example;

    public class TestComputer {
        public static void main(String[] args) {

            Computer computer = Computer.getOurInstance();
                int s=computer.hashCode();
            System.out.println("Second Objects ref:" + s);
         Computer  computer1= computer.getOurInstance();
            int s1=computer1.hashCode();
            System.out.println(s1);




    }
}
