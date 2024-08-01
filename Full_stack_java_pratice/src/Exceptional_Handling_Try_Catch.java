import java.util.*;
public class Exceptional_Handling_Try_Catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("connection established ");
            System.out.println("enter the numerator : ");
            int a = sc.nextInt();
            System.out.println("enter the denominator : ");
            int b = sc.nextInt();
            int result = a / b;
            System.out.println("the result is : " +result);
        }
        catch (Exception e){
            System.out.println("dividing by zero is illegal");
        }
        System.out.println("connection terminated normally");


    }
}
