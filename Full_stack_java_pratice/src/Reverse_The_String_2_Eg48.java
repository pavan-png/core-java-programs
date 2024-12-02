import java.util.*;
public class Reverse_The_String_2_Eg48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s1 = sc.nextLine();
        String s2 = "";

        String[] arr = s1.split(" ");
        for (int i = 0 ; i<= arr.length-1;i++) {
            for (int j = arr[i].length() - 1; j >= 0; j--) {
                s2 = s2 + arr[i].charAt(j);
            }
            s2 = s2 + " ";
        }

        String[] arr1 = s2.split(" ");
        for (int i =0 ; i< arr1.length;i++){
            if(arr1[i].equals(arr[i])){
                System.out.println("index "+i+" is palindrome");
            }
            else {
                System.out.println("index " +i +"is not a palindrome ");
            }
        }
        System.out.println("original string : "+s1);
        System.out.println("Reversed String : "+s2);


    }
}
