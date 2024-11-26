import java.util.Scanner;
public class Array_2_D_Jagged {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int outerArraySize;
        int innerArraySize;
        int[][] arr  = new int[3][];
        System.out.println("enter the outer array size");
        outerArraySize = sc.nextInt();
        for (int i = 0; i<outerArraySize;i++){
            System.out.println("enter the size of inner array arr:[ "+i+"]");
            innerArraySize = sc.nextInt();
            arr[i] = new int[innerArraySize];
        }
        
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
