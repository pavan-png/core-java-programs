import java.util.Scanner;

public class Opposite_Case_Converting_Eg46 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println(" Enter the String in a mixed case of upper and  lower and not other than them ");
        String s1 = sc.nextLine();
        String s2 = " ";
        boolean flaag = true;
        for (int i = 0; i < s1.length(); i++) {
            if ((s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z')) {
                s2 = s2 + (char) (s1.charAt(i) - 32);
            } else if (s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z') {
                s2 = s2 + (char) (s1.charAt(i) + 32);
            } else if (s1.charAt(i) == ' ') {
                s2 = s2 + " ";
            }
            else {
                flaag = false;
            }

        }
        if (flaag == true) {
            System.out.println(s2);
        } else {
            System.out.println("please enter correct format");
        }
    }
}




