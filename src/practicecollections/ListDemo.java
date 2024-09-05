package src.practicecollections;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.Stack;

public class ListDemo {

    public static void main(String[] args) {

        //Maintain the order of insertion
        //List allowes duplicate values
        //

           List mylist = new LinkedList();
//        List<String> mylist = new LinkedList();
//        List<Integer> mylist = new LinkedList();
//        List<Object> mylist = new LinkedList();

//        List mylist = new ArrayList();
//         List<String> mylist = new LinkedList();
//        List<Integer> mylist = new LinkedList();
//        List<Object> mylist = new LinkedList();

        mylist.add("Java");
        mylist.add("Net");
        mylist.add("Python");
        mylist.add("Ruby");
        mylist.add("Robotic");
        mylist.add(null);
        mylist.add(123);
        mylist.add(null);

        System.out.println(mylist);
//        System.out.println(mylist.size());
//        System.out.println(mylist.indexOf("Python"));
//        System.out.println(mylist.get(1));
//        System.out.println(mylist.isEmpty());
//        System.out.println(mylist.contains("Ruby"));
//        mylist.remove("Net");
//        System.out.println(mylist);
//        mylist.add("C#");
//        System.out.println(mylist);
//        mylist.set(3,"Java");
//        System.out.println(mylist);
//        mylist.add(4,"C#");
//        System.out.println(mylist);
//       mylist.remove(4);
//        System.out.println(mylist);


        for(int i = 0; i < mylist.size(); i++){
            System.out.println(mylist.get(i));
        }

//        for (Object o : mylist){
//            System.out.println(o);
//        }

//        Iterator iterator = mylist.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        //Vector and Stack are legacy classes
        Vector v = new Vector<>();
        v.add("Pramod");
        v.add("Amit");
        v.add("Lucky");
        System.out.println(v);

        Stack st = new Stack<>();
        st.push("A");
        st.push("B");
        st.push("C");
        st.push("D");

        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st);

    }
}
