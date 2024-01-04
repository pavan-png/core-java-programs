import java.util.*;
public class Arrays_Utility_Class_Fill_Method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the sze of  the array                                                                   : ");
        int size = sc.nextInt();
        int[] arr = new int[4];
        System.out.print("printing array without intilization (default values of int given)                             : ");
        for (int i : arr){
            System.out.print(i + "  ");
        }
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------using Arrays fill method------------------------------------------------------------------------------------------------");
        System.out.print("Enter the number to use int the fill method                                                   : ");
        int fill = sc.nextInt();
        System.out.print("printing array using Arrays fill method                                                       : ");
        Arrays.fill(arr,fill);
        for (int i : arr){
            System.out.print(i + "  ");
        }

    }
}
