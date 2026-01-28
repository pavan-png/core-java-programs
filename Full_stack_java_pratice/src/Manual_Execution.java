public class Manual_Execution {

    // instance variables
    int c;
    int d;

    // instance block
    {
        c = 10;
        d = 20;
        System.out.println("instance block executed");
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }

    // constructor
    Manual_Execution() {
        System.out.println("constructor executed");
    }

    // static method
    static void test() {
        System.out.println("static method executed");
    }

    // instance method
    void disp() {
        System.out.println("instance method executed");
    }

    public static void main(String[] args) {

        Manual_Execution obj = new Manual_Execution(); // triggers instance flow
        obj.disp();                                    // instance method
        test();                                        // static method
    }
}
