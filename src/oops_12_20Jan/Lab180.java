package src.oops_12_20Jan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab180 {
    public static void main(String[] args) {

        //List mylist = new List();

        List<String> mylist = new ArrayList();   //We declared String int not allowed
        mylist.add("Pramod");
        mylist.add("Amit");
        mylist.add("Kapil");
        mylist.add("Nalwar");
        //mylist.add(123);   //int not allowed we declare String
        //mylist.add(true);


        System.out.println(mylist);
        mylist.set(1,"Yak");
        System.out.println(mylist);
        mylist.remove("Yak");
        System.out.println(mylist);
        System.out.println(mylist.get(2));

        System.out.println(" --- ");

        // For Loop

        for (int i = 0; i < mylist.size() ; i++) {
            System.out.println(mylist.get(i));
        }

        System.out.println(" --- ");

        // For Each Loop

        for(String o :mylist){
            System.out.println(o);
        }

        System.out.println(" --- ");

        // Iterator
        Iterator iterator = mylist.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
