package src.oops_07_30Dec;

public class Lab126 {
    public static void main(String[] args) {

        //Print diagonal elements 2D array by using 2 for loop

        int [][] array_2d = new int [3][3];
        array_2d[0][0] = 1;
        array_2d[0][1] = 2;
        array_2d[0][2] = 3;
        array_2d[1][0] = 4;
        array_2d[1][1] = 5;
        array_2d[1][2] = 6;
        array_2d[2][0] = 7;
        array_2d[2][1] = 8;
        array_2d[2][2] = 9;

         //1 2 3     //1,5,9 is diagonal elements i=j
        // 4 5 6
        // 7 8 9

        for (int i = 0; i < array_2d.length; i++) {
            for (int j = 0; j < array_2d[i].length; j++) {
                if (i == j) {
                    System.out.println(array_2d[i][j]);
                }
            }
        }

    }
}
