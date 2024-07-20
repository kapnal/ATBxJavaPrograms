package src.oops_14_3Feb;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Lab193 {
    public static void main(String[] args) {

        Set courseSets = new LinkedHashSet();
        courseSets.add("Java");
        courseSets.add("Python");
        courseSets.add("API");
        courseSets.add("Selenium");
        courseSets.add("TOSCA");

        System.out.println(courseSets);

        Iterator iterator = courseSets.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
