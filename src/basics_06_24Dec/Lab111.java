package src.basics_06_24Dec;

public class Lab111 {
    public static void main(String[] args) {

//        int arr2 [][] = new int [2][3];
//        int arr3[][] = new int[3][2];
//        int arr4[][] = new int[5][3];
//        int arr5[][] = new int[10][1];
//        int arr6[][] = new int[10][11];

        int a[] = {1, 2, 3};
        int[][] mat = {{1, 2, 3},{4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length ; j++) {
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println("");

            }



    }
}
