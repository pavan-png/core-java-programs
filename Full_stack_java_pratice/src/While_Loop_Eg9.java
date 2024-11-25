public class While_Loop_Eg9 {
    public static void main(String[] args) {
        int x = 5;
      while ( isAvailable(x)){ // here x is a local variable of main method

            System.out.println(x--);
        }

    }
    public static boolean isAvailable(int x) { // here x is a local variable from isAvailable() does not reflect its value updation of x value in main method.
        return x-- >0 ?true : false;
    }
}
