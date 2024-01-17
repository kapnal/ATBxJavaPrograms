package src.oops_11_14Jan.innerclass;

public class Lab157 {
    public static void main(String[] args) {

        Student s1 = new Student() {
            @Override
            public void setId() {

            }

            B b = new B() {
                // This is a Anonymous class
                // No Name
            };
        };
            s1.setId();
    }
}

abstract class B {
    int var_b = 12;
}

interface Student{
    int id = 11;
    void setId();

}
