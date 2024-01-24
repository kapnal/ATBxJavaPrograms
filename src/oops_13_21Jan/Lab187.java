package src.oops_13_21Jan;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lab187 {
    public static void main(String[] args) {

        List<Integer> myMakrs = new ArrayList<>();
        myMakrs.add(91);
        myMakrs.add(84);
        myMakrs.add(80);

        Collections.sort(myMakrs);
        System.out.println(myMakrs);
    }
}
