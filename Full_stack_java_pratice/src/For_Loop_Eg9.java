public class For_Loop_Eg9 {
    public static void main(String[] args) {
        int a = 10,b =20;
        for (int i =0;a<b;i++){
            /* in the condition block if direct boolean literals are used then the concept of un-reachability comes into
             picture, and compiler evaluates them and gives compile time error.
              here since operands are used compiler will never evaluate them jvm do that job.
            */
            System.out.println("hello");
        }
        System.out.println("hi");
    }
}
