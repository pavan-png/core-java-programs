import java.util.Scanner;
public class Array_1_Dimensional_Eg1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of the array");
        int size = sc.nextInt();

         int[] ar = new int[size];

         for(int i = 0;i<ar.length;i++){ // length is a predefined variable/property, gives the length of the array
             System.out.println("Enter the "+i + "element ");
             ar[i] = sc.nextInt();
         }
        System.out.println("the array consists of elements");
          for(int i = 0;i<ar.length;i++){
              System.out.println(ar[i]);
          }


    }
}
