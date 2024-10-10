public class Exception_Handling_Eg28 {
  static {
      System.out.println(1/0);
  }
    public static void main(String[] args) {
        System.out.println("hello");
    }
}
/*
whenever there is a some problem in the static block it leads to ExceptionInInitializerError.
the core exception is  ArithmeticException.
 */
