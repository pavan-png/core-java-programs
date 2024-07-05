public class String_Eg137 {
    public static void main(String[] args) {
        String s1 = "sachin ramesh tendulkar";
        System.out.println(s1.indexOf('a') + s1.indexOf("dulkar"));
        // index of 'a' : first occurance of a is 1
        // index of "dulkar" : whole index of word  is treated as 17, before index of "dulkar" is calculated character to character.
    }
}
