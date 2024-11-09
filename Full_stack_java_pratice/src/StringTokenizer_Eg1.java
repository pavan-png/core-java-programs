import java.util.StringTokenizer;

public class StringTokenizer_Eg1 {
    public static void main(String[] args) {
        String s = "hello pavan how are you";
        StringTokenizer st = new StringTokenizer(s," ");
        System.out.println(st);
        int no_Of_Words = st.countTokens();
        System.out.println(no_Of_Words);
        while (st.hasMoreTokens()){
            String s1 = st.nextToken();
            System.out.println(s1);
        }
    }
}
