import java.util.*;
public class Array_3_D_Jagged {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][][] arr = new int[3][][];
       arr[0] = new int[2][];
        arr[1] = new int[4][];
        arr[2] = new int[3][];
        arr[0][0] = new int[4];
        arr[0][1] = new int[2];
        arr[1][0] = new int[3];
        arr[1][1] = new int[1];
        arr[1][2] = new int[5];
        arr[1][3] = new int[2];
        arr[2][0] = new int[3];
        arr[2][1] = new int[4];
        arr[2][2] = new int[3];


        for (int i = 0; i < arr.length; i++) {
         for (int j = 0 ; j<arr[i].length;j++){
             for (int k =0 ; k<arr[i][j].length;k++){
                 System.out.println("enter the " +i +" collage " + j + " class " + k + " student marks " );
                 arr[i][j][k] = sc.nextInt();
             }
           }
         }
        System.out.println("---------------------------------total list is -----------------------------------------------");
        for(int i = 0 ; i<arr.length;i++){
            for (int j = 0; j<arr[i].length;j++ ){
                for (int k = 0;k<arr[i][j].length ; k++ ){
                    System.out.println(+ i +" collage " + j + " class " + k + " student marks "+arr[i][j][k] );
                }
            }
        }
    }
}
