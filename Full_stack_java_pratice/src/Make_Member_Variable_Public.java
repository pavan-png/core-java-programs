public class Make_Member_Variable_Public {

    // making a public member variable
    public int a;

    public Make_Member_Variable_Public() {
        a = 10;
    }

    public static void main(String[] args) {

        Make_Member_Variable_Public eg = new Make_Member_Variable_Public();

        // Before calling the add() method
        System.out.println("Before calling method: " +eg.a);

        // calling method
        add(eg);

        // After calling the add() method
        System.out.println("after calling method: " +eg.a);

    }

    // add() method starts here that increments 'a' by 1
    public static void add(Make_Member_Variable_Public obj) {
        obj.a++;
    }

}