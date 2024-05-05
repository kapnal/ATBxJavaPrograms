package src.practiceoops;

import java.util.*;

public class Lab010 {

    public static void main(String[] args) {

        //Map<String,Integer> map = new HashMap<>();
        //Map<String,Integer> map = new LinkedHashMap<>();
        Map<String,Integer> map = new TreeMap<>();
        map.put("id2",3);
        map.put("id",7);
        map.put("id1",5);

        System.out.println(map);
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("id"));
        System.out.println(map.containsValue(5));
        System.out.println(map.get("id2"));
        System.out.println(map.keySet());
        System.out.println(map.values());

        for(Map.Entry<String,Integer> item: map.entrySet()){
            System.out.println(item.getKey() + " --> " + item.getValue());
        }



    }
}
