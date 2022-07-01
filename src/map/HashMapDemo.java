package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        map.put("a" , 1);
        map.put("b" , 1);
        map.put("c" , 1);
        map.put("d" , 1);

        for (Map.Entry<String , Integer> entry: map.entrySet()) {

            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " " + value);
        }


    }

}
