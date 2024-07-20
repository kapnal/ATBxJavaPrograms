package src.oops_13_21Jan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab183 {
    public static void main(String[] args) {

        List<String> courseList = new ArrayList();
        courseList.add("ATB");
        courseList.add("MTB");
        courseList.add("PyATB");
        courseList.add("LAPIB");

        List numList = new ArrayList();
        numList.add(150);
        numList.add(100);
        numList.add(100);
        numList.add(399);


        courseList.addAll(numList);
        System.out.println(courseList);

        Iterator iterator = courseList.iterator();
        while (iterator.hasNext()){

                    //    courseList.add("GEN AI");  //ConcurrentModificationException
            System.out.println(iterator.next());
        }

    }

}
