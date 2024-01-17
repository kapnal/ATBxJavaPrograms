package src.oops_11_14Jan.wrapperclass;

public class Lab163 {
    public static void main(String[] args) {

        int a = 10;
        //Integer a2 = a;
        Integer a2 = Integer.valueOf(a);
        // wrapper class we use in collection framework
        //We use wrapper classes in Collection Framework -> Class -> Hate primitive data type
        //You have to use the Wrapper classes in Collection.

        Character ch = 'a';  //wrapper
        // unboxing - Character object to primitive conversion
        char a3 = ch;  //This is primitive

        System.out.println(Integer.valueOf("55"));
        System.out.println(Integer.max(34,54));
        System.out.println(Integer.min(34,54));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        double d = 90.87;
        String st2 = String.valueOf(d);
        Double st = Double.valueOf(d);
        Integer a22 = st.intValue();
        System.out.println(a22);


    }
}
