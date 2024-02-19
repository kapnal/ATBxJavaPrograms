package src.basics_01_10Dec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompStudents {
    public static void main(String[] args) {

        Compclass student = new Compclass(1,"Pramod");
        Compclass student2 = new Compclass(10,"Dutta");
        Compclass student3 = new Compclass(3,"Autta");

        List<Compclass> students = new ArrayList<>();

        students.add(student);
        students.add(student2);
        students.add(student3);
        System.out.println(students);

        Collections.sort(students);
        System.out.println(students);
    }
}
