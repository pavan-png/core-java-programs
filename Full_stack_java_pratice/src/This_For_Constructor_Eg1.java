public class This_For_Constructor_Eg1 {
    This_For_Constructor_Eg1(){
       // this must be first statement of the body
        this(5);
        System.out.println("hello");
    }
    This_For_Constructor_Eg1(int a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        This_For_Constructor_Eg1 obj = new This_For_Constructor_Eg1();

    }
}
