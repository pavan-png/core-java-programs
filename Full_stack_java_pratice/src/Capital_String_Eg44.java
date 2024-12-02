import java.util.Scanner;
public class Capital_String_Eg44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s1 = sc.nextLine();
        String s2 ="";
        boolean flag = true;
        for (int i =0;i<s1.length();i++){

            /*  public char charAt(int);           it takes int type as  parameter , and returns char
               // internal working
            =>    s1.charAt(0)-32
            =>     104 - 32
            =>       72
            =>     (char) (72)
            =>       H

             */
            if (s1.charAt(i)>='a' && s1.charAt(i)<='z'){
                s2 = s2 + (char) (s1.charAt(i) - 32);
            }
            else if (s1.charAt(i)==' '){
                s2 = s2 + ' ';
            }
            else if ((char)(s1.charAt(i)-32)<65){
                System.out.println("please enter the string only in lower case");
               flag =false;
                break;
            }
        }
        if (flag==true) {
            System.out.println("The original String is : " + s1);
            System.out.println("converted to : "+s2);
        }

    }
}
