interface Sample{
    default void disp(){
        System.out.println("this is displap-1  method of sample interface");
        System.out.println("==========================================================");
        System.out.println();
    }
    default void disp_1(){
        System.out.println();
        System.out.println(" this is display-2 method of sample interface");
        System.out.println("=======================================================");
    }


    /*
    from java 8 inside interface we can have static methods.
    it will not participate in the inheritance in the inherited classes.
     */
    // default modifier cannot be used for static method of interface
    static  void disp_2(){
        System.out.println("=============================================================");
        System.out.println();
        System.out.println("this is  static method of the interface ");
        /*
        private static method can be called in static method of interface
         */
        System.out.println("calling the private static method from default method ");
        disp_4();
        System.out.println("================================================================================");

    }


    /* private methods will not participate in the inheritance
    private methods cant be called outside the interface
     */
    private void disp_3(){
        System.out.println();
        System.out.println("this is private method of interface ");
        System.out.println("===========================================================================");
    }

    static void hello(){
        System.out.println("static method of interface ");
    }

    /*
    we can have private static methods in the interface
     */
    private static void disp_4(){
        System.out.println();
        System.out.println("this is  private static method of the interface  ");
        /*
        static method can be called from private static method.
         */
        System.out.println("calling static method from private static method ");

        System.out.println("===============================================================");

    }
    private static void disp_5(){
        disp_2();
    }

}

class Impl_Class implements Sample{

    /* the overriding concrete method of interface should public modifier in implementation class
    to override the method
     */
   public void disp(){
       System.out.println();
       System.out.println("display method of implementation class");
       System.out.println("==================================================================================");
    }


}
public class Interface_Concrete_Static_Private_Methods {
    public static void main(String[] args) {
        Sample obj = new Impl_Class();
        obj.disp();

        // inherited method  disp_1()
        obj.disp_1();

        // to invoke static methods of interface call with Interface.methodName
        Sample.disp_2();
        


    }
}
