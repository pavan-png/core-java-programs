import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "a gentle man";
        String s2 = "elegant man";

        s1= s1.replace(" ", "");
        s2 = s2.replace(" ","");

        s1= s1.toLowerCase();
        s2 = s2.toLowerCase();

       char[] arr = s1.toCharArray();
       char[] arr1 = s2.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr1);

        if (Arrays.equals(arr,arr1)){
            System.out.println("anagram");
        }
        else{
            System.out.println(" not a anagram");
        }

    }
}
