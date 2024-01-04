public class Do_While_Eg10 {
    public static void main(String[] args) {
        final int a = 10,b= 20;
        do {
            System.out.println("hello");
        }
        while(a<b);
       /* System.out.println("hello");
       compile time error since final variables are evaluated by compiler at compile time.
        */
    }
}
