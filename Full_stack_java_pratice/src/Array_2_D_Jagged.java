import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class Array_2_D_Jagged {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr  = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[2];
        arr[2] = new int[1];
        for (int i = 0; i <arr.length;i++){
            for (int j = 0; j<arr[i].length;j++){
                System.out.println("enter the marks for " + i + " class and " +j+" student ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("-------------------------------total elelemts are------------------------------------ ");
        for (int i = 0; i <arr.length;i++){
            for (int j = 0; j<arr[i].length;j++){
                System.out.println(i+" class and " +j +"  student marks are " +arr[i][j] );
            }
        }

    }
}
