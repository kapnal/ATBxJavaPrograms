package src.practiceArrays;

public class Basics02 {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};

        System.out.println(arr1 == arr2);
        System.out.println(arr1.equals(arr2));  //In Arrays we don't compare values we only compares references


    }
}
