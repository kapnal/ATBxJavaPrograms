package src.oops_12_20Jan;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lab182 {
    public static void main(String[] args) {

        List<String> myList = new LinkedList();

        myList.add("Kapil");
        myList.add("Nalwar");
        System.out.println(myList);

        List<Integer> I = new LinkedList<Integer>();
        // Now add elements to the Link List
        I.add(2);
        I.add(3);
        I.add(4);

        Iterator iterator = I.iterator();
        while (iterator.hasNext()){ //t,t,t,f
            //l.add(5); Not possible
            System.out.println(iterator.next()); //2,3,4
        }




    }
}
