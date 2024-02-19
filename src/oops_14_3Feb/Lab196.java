package src.oops_14_3Feb;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab196 {
    public static void main(String[] args) {

        //Map<String,Integer> map = new HashMap<>();
        //Map<String,Integer> map = new LinkedHashMap<>();
        Map<String,Integer> map = new TreeMap<>();
        map.put("id1",2);
        map.put("id3",9);
        map.put("id2",7);

        System.out.println(map);
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println(map.containsKey("id2"));
        System.out.println(map.containsValue(2));
        System.out.println(map.get("id3"));
        System.out.println(map.keySet());
        System.out.println(map.values());

        for(Map.Entry<String,Integer> item: map.entrySet()){
            System.out.println(item.getKey() + " -> " + item
                    .getValue());
        }




    }
}
