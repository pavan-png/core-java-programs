import java.util.*;

public class Array_3D_Jagged_Eg2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take the outer dimension (no. of colleges)
        System.out.println("Enter the number of colleges (outer array size): ");
        int colleges = sc.nextInt();

        // Create the outermost array with 'colleges' size
        int[][][] arr = new int[colleges][][];

        // Step 2: Take the number of classes for each college
        for (int i = 0; i < colleges; i++) {
            System.out.println("Enter the number of classes in college " + i + ": ");
            int classes = sc.nextInt();
            arr[i] = new int[classes][];
        }

        // Step 3: Take the number of students for each class in each college
        for (int i = 0; i < arr.length; i++) { // loop over colleges
            for (int j = 0; j < arr[i].length; j++) { // loop over classes
                System.out.println("Enter the number of students in college " + i + ", class " + j + ": ");
                int students = sc.nextInt();
                arr[i][j] = new int[students];
            }
        }

        // Step 4: Enter marks for each student
        for (int i = 0; i < arr.length; i++) { // colleges
            for (int j = 0; j < arr[i].length; j++) { // classes
                for (int k = 0; k < arr[i][j].length; k++) { // students
                    System.out.println("Enter marks for College " + i + ", Class " + j + ", Student " + k + ": ");
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        // Step 5: Display all data
        System.out.println("------------- Total Data Entered -------------");
        for (int i = 0; i < arr.length; i++) { // colleges
            for (int j = 0; j < arr[i].length; j++) { // classes
                for (int k = 0; k < arr[i][j].length; k++) { // students
                    System.out.println("College " + i + ", Class " + j + ", Student " + k + " -> " + arr[i][j][k]);
                }
            }
        }

        sc.close(); // good practice: close scanner
    }
}
