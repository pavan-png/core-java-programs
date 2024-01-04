 class This_As_Argument_In_Constructor_Call {
     // instance variable
     B1 tmp;

     This_As_Argument_In_Constructor_Call(B1 tmp) {
         this.tmp = tmp;
     }

     void print() {
         System.out.println("the number is " + " "+tmp.a);
     }
 }

     class B1 {
         int a = 5;

         B1() {
             This_As_Argument_In_Constructor_Call obj = new This_As_Argument_In_Constructor_Call(this);
             obj.print();
         }
     }

     public class This_As_Arg_In_Cons_Call {
         public static void main(String[] args) {

B1 obj = new B1();


     }
 }