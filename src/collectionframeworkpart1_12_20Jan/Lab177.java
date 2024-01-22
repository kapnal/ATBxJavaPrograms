package src.collectionframeworkpart1_12_20Jan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab177 {
    public static void main(String[] args) {

        String path = "C:/a.txt";
        try {
            FileInputStream f = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
