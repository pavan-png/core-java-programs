import java.util.Scanner;

public class Array_3_Dimensional_Eg1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input for sizes
        System.out.println("enter the no of collages ");
        int collages = sc.nextInt();

        System.out.println("enter the no of classes ");
        int classes = sc.nextInt();

        System.out.println("enter the no of students ");
        int students = sc.nextInt();

        // Step 2: Create 3D array
        int[][][] arr = new int[collages][classes][students];

        // Step 3: Input data
        for (int i = 0; i < arr.length; i++) {              // i -> college
            for (int j = 0; j < arr[i].length; j++) {       // j -> class
                for (int k = 0; k < arr[i][j].length; k++) {// k -> student
                    System.out.println("enter the marks of "
                            + i + " collage "
                            + j + " class and "
                            + k + " student ");
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        // Step 4: Output data
        System.out.println("----------- total data entered is -----------");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.println("marks of "
                            + i + " collage "
                            + j + " class and "
                            + k + " student ");
                    System.out.println(arr[i][j][k]);
                }
            }
        }
    }
}
