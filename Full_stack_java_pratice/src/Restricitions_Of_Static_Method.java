public class Restricitions_Of_Static_Method {
    void msg() {
        System.out.println("hello this is instance method");
    }

    static void msg1(){
         // Calling the non-static method from the static method
        // This will cause an error
        //msg();

    }

    public static void main(String[] args) {
        Restricitions_Of_Static_Method.msg1();
    }
}