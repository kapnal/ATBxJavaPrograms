package src.oops_13_21Jan;

import java.util.Enumeration;
import java.util.Vector;

public class Lab185 {
    public static void main(String[] args) {

        Vector<String> v2 = new Vector();
        v2.add("pramod");
        v2.add("pr");
        v2.add("adsda"); // Array - can store similar only

        Enumeration e  = v2.elements();   //Enumerartion can only use with vector
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
