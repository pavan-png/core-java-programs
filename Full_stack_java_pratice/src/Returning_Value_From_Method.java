public class Returning_Value_From_Method {

    public static void main(String[] args) {

        int a = 10;

        // Before calling the add() method
        System.out.println("Before calling method: " +a);

        // calling method
        a = add(a);

        // After calling the add() method
        System.out.println("after calling method: " +a);

    }

    // add() method starts here that increments 'a' by 1
    public static int add(int a) {
        a++;
        return a;
    }

}