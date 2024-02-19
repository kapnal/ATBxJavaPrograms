package src.oops_14_3Feb;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lab191 {
    public static void main(String[] args) {

        Set courseSets = new HashSet();
        courseSets.add("Java");
        courseSets.add("Python");
        courseSets.add("API");
        courseSets.add("Selenium");
        courseSets.add("TOSCA");

        System.out.println(courseSets);
        for (Object o : courseSets) {
            System.out.println(o);
        }

        System.out.println("----------------------------");

        Iterator it = courseSets.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
