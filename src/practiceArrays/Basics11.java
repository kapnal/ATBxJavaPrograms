package src.practiceArrays;

public class Basics11 {

    public static void main(String[] args) {

//        int a[] = {1,2,3};

        int[] [] arr = new int[3][3];

        arr[0][0] = 12;
        arr[0][1] = 25;
        arr[0][2] = 46;
        arr[1][0] = 11;
        arr[1][1] = 22;
        arr[1][2] = 67;
        arr[2][0] = 34;
        arr[2][1] = 50;
        arr[2][2] = 14;

        for(int i =0; i < arr.length; i++){
            for(int j =0; j < arr[i].length;j++){
                System.out.print(arr[i][j]+ "\t");
            }
            System.out.println("");
        }

    }
}
