package src.practiceoops;

import java.util.*;

public class Lab008 {

    public static void main(String[] args) {

        //If we declare Object then we can add any data types String,Integer,boolean

        List<Object> CourseList = new ArrayList<>();

        //List<String> CourseList = new ArrayList<>();
        //List<Integer> CourseList = new ArrayList<>();
        CourseList.add("Java");
        CourseList.add("Rest API");
        CourseList.add("Selenium");
        CourseList.add("Python");
        CourseList.add("Java");
        CourseList.remove("Python");
        CourseList.set(1,"RESTAPI");
        CourseList.add("TOSCA");

        List<Integer> numList = new ArrayList();
        numList.add(145);
        numList.add(500);
        numList.add(457);

        CourseList.addAll(numList);
        //CourseList.add(30);
        //CourseList.add(true);

        System.out.println(CourseList);
        System.out.println(CourseList.size());
        System.out.println(CourseList.indexOf("Selenium"));
        System.out.println(CourseList.get(4));
        System.out.println(CourseList.isEmpty());


        //For loop

//        for(int i = 0; i < CourseList.size(); i++){
//            System.out.println(CourseList.get(i));
//        }

        //For Each loop

//        for(Object O: CourseList){
//            System.out.println(O);
//        }

        //Iterator
        Iterator iterator = CourseList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
