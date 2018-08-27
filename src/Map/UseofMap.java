package Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class UseofMap {
    public static void main(String[] args) {


        Map<String,Integer> login=new Hashtable<>();
        login.put("almrashid",122333);
        login.put("june5252",1383838);

        for (Map.Entry<String,Integer> data: login.entrySet())
            System.out.println(data.getKey()+data.getValue());

         {
             //for(Map.Entry<String, String> state:cityNcountry.entrySet()){
             //            System.out.println(state.getKey() + "---> " + state.getValue());
             //        }

        }



    }
}
