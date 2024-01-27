import java.util.*;
public class Reverse_The_String_Eg47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to reverse");
        String s1  = sc.nextLine();
        String s2 = "";
        //  length method starts from 1 to end , so end should  be n-1 since  we are iterating from 0th index
        for (int i = s1.length()-1;i>=0;i--){
            s2 = s2+s1.charAt(i);
            if (s1.charAt(i)==' '){
                s2 = s2+ " ";
            }
        }
        System.out.println(s2);
    }
}
