package src.practiceoops;

public class Test {

    public static void main(String[] args) {

        Student s = new Student();

        s.setName("kapil");

        System.out.println(s.getName());
        System.out.println(s.getCollege());
        s.setCollege("MGM");
        System.out.println(s.getCollege());



    }
}
