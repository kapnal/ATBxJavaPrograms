package src.oops_08_06Jan;

public class Lab134 {
    public static void main(String[] args) {

        // Immutable in nature (that can't changed)
        String password = "pass@123";

        // 1000 times I am going to change the password value
        // should I use the Sb, sb OR String  in this case we can use string buffer or string builder

        // Mutable - that can be changed!!
        StringBuilder password2 = new StringBuilder("kapil");
        password2.append(" nalwar");
        System.out.println(password2);

    }
}
