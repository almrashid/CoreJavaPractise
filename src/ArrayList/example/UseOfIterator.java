package ArrayList.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseOfIterator {

    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();


        list.add(10);
        list.add(30);
        list.add(40);


        Iterator it=list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        for (Integer nt: list) {
            System.out.println(nt);

        }
    }

}
