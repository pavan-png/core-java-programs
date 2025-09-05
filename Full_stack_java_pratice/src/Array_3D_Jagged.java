import java.util.*;

public class Array_3D_Jagged {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take outer dimension (colleges)
        System.out.println("Enter the number of colleges: ");
        int colleges = sc.nextInt();

        int[][][] arr = new int[colleges][][];  // jagged 3D array

        // Step 2: For each college, ask no. of classes
        for (int i = 0; i < colleges; i++) {
            System.out.println("Enter the number of classes in college " + i + ": ");
            int classes = sc.nextInt();
            arr[i] = new int[classes][];

            // Step 3: For each class, ask no. of students
            for (int j = 0; j < classes; j++) {
                System.out.println("Enter the number of students in college " + i + ", class " + j + ": ");
                int students = sc.nextInt();
                arr[i][j] = new int[students];
            }
        }

        // Step 4: Fill the marks
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print("Enter marks for college " + i + ", class " + j + ", student " + k + ": ");
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        // Step 5: Display the marks
        System.out.println("------------- Total Data -------------");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.println("College " + i + ", Class " + j + ", Student " + k + " -> " + arr[i][j][k]);
                }
            }
        }
    }
}
