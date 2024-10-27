package src.oops_14_3Feb;

import java.util.Set;
import java.util.TreeSet;

public class Lab192 {
    public static void main(String[] args) {

        Set courseSets = new TreeSet();
        courseSets.add("Java");
        courseSets.add("Python");
        courseSets.add("API");
        courseSets.add("Selenium");
        courseSets.add("TOSCA");
        //courseSets.add(null);      NullPointerException

        System.out.println(courseSets);

    }
}
