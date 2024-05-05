package src.oops_14_3Feb;

import java.util.HashSet;
import java.util.Set;

public class Lab190 {
    public static void main(String[] args) {

        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("orange");
        fruits.add("apple");
        fruits.add("WaterMelon");

        System.out.println(fruits);
        System.out.println(fruits.size());   //Duplicate element is not considered & it is case sensitive orange & Orange are diff
        System.out.println(fruits.isEmpty());
        System.out.println(fruits.contains("apple"));


    }
}
