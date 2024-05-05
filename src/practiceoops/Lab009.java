package src.practiceoops;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab009 {

    public static void main(String[] args) {

        Set courseSets = new HashSet();
        courseSets.add("Java");
        courseSets.add("Python");
        courseSets.add("API");
        courseSets.add("Selenium");
        courseSets.add("TOSCA");

        System.out.println(courseSets);
    }
}
