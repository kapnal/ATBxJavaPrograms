package src.practicecollections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

    public static void main(String[] args) {

        Map<String ,Object>  map = new HashMap<>();
//        Map<String ,Object>  map = new LinkedHashMap<>();
  //      Map<String ,Object>  map = new TreeMap<>();

        map.put("FirstName", "Kapil");
        map.put("LastName", "Nalwar");
        map.put("City", "Hingoli");
        map.put("City", "Pune");
        map.put("Age", 32);
        map.put("Country", "India");



        System.out.println(map);
//        System.out.println(map.size());
//        System.out.println(map.get("City"));
//        System.out.println(map.keySet());
//        System.out.println(map.values());

        for(Map.Entry<String,Object> item: map.entrySet()){
            System.out.println(item.getKey() + "->" + item.getValue());
        }

    }
}
