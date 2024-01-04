import java.util.Scanner;
public class Array_2_Dimensional_Eg2 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the no classes ");
        int classes = sc.nextInt();
        System.out.println("Enter the no student marks ");
        int students = sc.nextInt();

         int [][] arr = new int[classes][students];
         for (int i = 0 ; i<arr.length;i++){
             for (int j=0; j<arr[i].length;j++){
                 System.out.println("Enter the class " + i + " student " +j + " marks");
                 arr[i][j] = sc.nextInt();
             }
         }
        System.out.println("--------------------------------------- the total classes and marks are------------------------------------ ");
         for (int i = 0; i<arr.length;i++){
             for (int j =0;j<arr[i].length;j++){
                 System.out.println("  class " + i + " student " +j + " marks are ");
                 System.out.println(arr[i][j]);
             }
         }


    }
}
