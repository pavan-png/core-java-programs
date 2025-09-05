import java.util.Scanner;
public class Array_2_D_Jagged {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int outerArraySize;
        int innerArraySize;

        // Step 1: Take number of rows (outer array size)
        System.out.println("enter the outer array size");
        outerArraySize = sc.nextInt();

        // Step 2: Create jagged array with only row size fixed
        int[][] arr  = new int[outerArraySize][];

        // Step 3: For each row, define different column size
        for (int i = 0; i < outerArraySize; i++) {
            System.out.println("enter the size of inner array arr:[ " + i + " ]");
            innerArraySize = sc.nextInt();
            arr[i] = new int[innerArraySize];
        }

        // Step 4: Input values into jagged array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("enter the marks for " + i + " class and " + j + " student ");
                arr[i][j] = sc.nextInt();
            }
        }

        // Step 5: Print values
        System.out.println("----------- total elements are -----------");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(i + " class and " + j + " student marks are " + arr[i][j]);
            }
        }
    }
}
