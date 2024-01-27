import java.util.Scanner;
public class SmallerCase_String_Eg45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter thr string only in Upper case  ");
        String s = sc.nextLine();
        String s1 = "";
        boolean flag = true;
        for (int i = 0; i<s.length() ; i++){
           if (s.charAt(i)>='A' && s.charAt(i)<'Z') {
               s1 = s1 + (char) (s.charAt(i) + 32);
           }
            else if (s.charAt(i)==' '){
                s1 = s1 + ' ';
            }
            else if (s1.charAt(i)>122){
                System.out.println("please enter the string only in the upper case ");
                flag = false;
                break;
            }
        }
        if (flag==true){
            System.out.println("Original string is : "+s);
            System.out.println("their lower case is : "+s1);
        }

    }
}
