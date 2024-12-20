import java.util.Scanner;
class Alpha {
    public void handle() throws ArithmeticException , ArrayIndexOutOfBoundsException , NegativeArraySizeException {
        Scanner sc = new Scanner(System.in);
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
}
class Beta  {
    void beta() throws ArithmeticException , ArrayIndexOutOfBoundsException , NegativeArraySizeException {
        Alpha obj = new Alpha();
        obj.handle();
    }
}
public class Ducking_Exception {
    public static void main(String[] args) {
       try {
           Beta obj1 = new Beta();
           obj1.beta();
       }
       catch (Exception e){
           System.out.println("incorrect input");
       }

    }
}
