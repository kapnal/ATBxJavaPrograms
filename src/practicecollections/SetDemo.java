package src.practicecollections;


import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String[] args) {

        //Maintain the order of insertion
        //List allowes duplicate values
        //

//           Set mylist = new HashSet();
//           Set mylist = new LinkedHashSet();
             Set mylist = new TreeSet();
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
        mylist.add("Java");
       // mylist.add(null);  //TreeSet null not allowed

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


//        for(int i = 0; i < mylist.size(); i++){
//            System.out.println(mylist.get(i));
//        }

        for (Object o : mylist) {
            System.out.println(o);
        }

//        Iterator iterator = mylist.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }


    }
}
