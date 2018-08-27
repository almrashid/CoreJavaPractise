package UseLoop;

public class NestedLoop {

    public static void main(String[] args) {


        for(int table=1; table<=20;table++) {
            System.out.println("Table no: " + table);
            System.out.println("-------");


            for (int num = 1; num <= 10; num++) {

                System.out.println(table+"*" + num + "=" + table * num); //10 times
            }
        }
    }
}
