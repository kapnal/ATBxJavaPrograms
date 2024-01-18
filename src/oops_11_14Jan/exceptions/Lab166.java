package src.oops_11_14Jan.exceptions;

import java.io.FileInputStream;

public class Lab166 {
    public static void main(String[] args) {

        //Unchecked Exception , Runtime
        String name = null;
        name.trim(); // Unchecked? Runtime

        //Checked Exception , Compile Time -/JVM? If Knows about it, - Checked Exception
        try {
            FileInputStream f = new FileInputStream("dasda.txt");
        }catch (Exception e){
            System.out.println();
        }


    }
}
