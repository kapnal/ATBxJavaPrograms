package src.oops_08_06Jan;

public class Lab131 {
    public static void main(String[] args) {

        String name = "Kapil";
        System.out.println(name.concat(" Nalwar"));
        System.out.println(name + " Nalwar");
        System.out.println(name);  //Original string remains same because of strings are Immutable in nature
        System.out.println(name.contains("p"));

        String name2 = new String("Dutta");  //when we use new it will create in Heap area

        String expected_result = "password@123";
        String actual_result  = "Password@123";
        if(expected_result.equalsIgnoreCase(actual_result)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }




    }
}
