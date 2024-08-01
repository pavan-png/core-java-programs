import java.util.Scanner;
public class Excpetional_Handling_Eg2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           try {
               System.out.println("connection established ");
               System.out.println("enter the numerator : ");
               int a = sc.nextInt();
               System.out.println("enter the denominator : ");
               int b = sc.nextInt();
               int result = a / b;
               System.out.println("the result is : " + result);

               System.out.println("enter the size of the array");
               int size = sc.nextInt();
               int[] arr = new int[size];
               System.out.println("enter the element to be inserted in the array ");
               int element = sc.nextInt();
               System.out.println("enter position to which the element should be inserted");
               int position = sc.nextInt();

               arr[position] = element;
               System.out.println(element + " inserted at position " + position + "successfully");
           }
           catch (Exception e){
               System.out.println("incorrect input");
           }

           System.out.println("connection terminated normally");

    }
}
