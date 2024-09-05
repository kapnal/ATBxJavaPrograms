package src.interview;

import java.io.FileInputStream;

public class Test {

    public static void main(String[] args) {

        try {

            FileInputStream f = new FileInputStream("dasasa.txt");
        } catch (Exception e){
            System.out.println("File not found");
        }

    }
}
