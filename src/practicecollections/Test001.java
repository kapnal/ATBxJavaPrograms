package src.practicecollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test001 {

    public static void main (String[] args){

        List myList = new ArrayList();

        myList.add("Kapil");
        myList.add("Nikhil");
        myList.add("Nalwar");
        myList.add(123);
        myList.add(true);
        myList.add(" ");
        myList.add(null);

        System.out.println(myList);
//        System.out.println(myList.size());
//        System.out.println(myList.get(2));
//        myList.set(1,"Ganesh");
//        myList.remove("123");
//        System.out.println(myList);
//        System.out.println(myList.contains("Nalwar"));

//        for (int i = 0; i < myList.size(); i++) {
//            System.out.println(myList.get(i));
//        }
//
//        for (Object o : myList){
//            System.out.println(o);
//        }
//
//        Iterator it = myList.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }



    }
}
