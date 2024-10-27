package src.oops_13_21Jan;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lab184 {
    public static void main(String[] args) {

        List ttacourseList = new ArrayList();
        ttacourseList.add("ATB");
        ttacourseList.add("MTB");
        ttacourseList.add("LAPIT");
        ttacourseList.add("SDET Blueprint");
        ttacourseList.add("Java for Testers");

        ListIterator lt = ttacourseList.listIterator();
        while (lt.hasNext()){

            lt.add("GEN AI");  //Whenever we use ArrayList Iterator don;t modify the list it is not allowed
            System.out.println(lt.next());
        }

//        System.out.println(" --- ");
//
//       ListIterator lt2 = ttacourseList.listIterator(ttacourseList.size());
//        while (lt2.hasPrevious()){
//
//           // ttacourseList.add("Gen AI");  //ConcurrentModificationException
//           // lt2.add("Gen AI");  //this is allowed
//            System.out.println(lt2.previous());
//        }

    }
}
