package src.basics_01_10Dec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompStudents1 {
    public static void main(String[] args) {

        Compclass1 student = new Compclass1(1,"Pramod");
        Compclass1 student2 = new Compclass1(10,"Dutta");
        Compclass1 student3 = new Compclass1(3,"Autta");

        List<Compclass1> students = new ArrayList<>();

        students.add(student);
        students.add(student2);
        students.add(student3);
       // System.out.println(students);

        Collections.sort(students,new SortByName());  //Sort by name asc
        System.out.println(students);
        Collections.sort(students,new ASC());     //Sort by id asc
        System.out.println(students);
        Collections.sort(students,new DES());  //Sort by id desc
        System.out.println(students);

    }
}
