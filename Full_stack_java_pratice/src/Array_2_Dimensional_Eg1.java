import java.util.Scanner;
public class Array_2_Dimensional_Eg1 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter the no classes ");
        int classes = sc.nextInt();

        System.out.println("Enter the no student marks ");
        int students = sc.nextInt();

        // Step 1: Create 2D array
        int [][] arr = new int[classes][students];

        // Step 2: Take input
        for (int i = 0; i < arr.length; i++) { // i = class index
            for (int j = 0; j < arr[i].length; j++) { // j = student index
                System.out.println("Enter the class " + i + " student " + j + " marks");
                arr[i][j] = sc.nextInt();
            }
        }

        // Step 3: Print output
        System.out.println("----------- The total classes and marks are -----------");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Class " + i + " student " + j + " marks are ");
                System.out.println(arr[i][j]);
            }
        }
    }
}
