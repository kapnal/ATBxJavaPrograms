package src.practiceFunction;

public class diagonaleme2darray {
    public static void main(String[] args) {

        int [][] array_2d = new int[3][3];
        array_2d[0][0]=5;
        array_2d[0][1]=12;
        array_2d[0][2]=8;
        array_2d[1][0]=1;
        array_2d[1][1]=42;
        array_2d[1][2]=13;
        array_2d[2][0]=9;
        array_2d[2][1]=23;
        array_2d[2][2]=4;

        for (int i = 0; i < array_2d.length; i++){
            System.out.println(array_2d[i][i]);
        }


    }
}
