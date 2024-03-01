public class Manual_Execution {
    static  int  a ;
    static int b ;
    static {
        System.out.println("this is static block");
    }

    int c ;
    int d;
    {
        System.out.println("this is  java block");
        c = 10;
        d = 20;
    }
    Manual_Execution(){
        System.out.println("this is constructor ");
    }
    void disp(){
        System.out.println("this is instance method");
    }
    public static void main(String[] args) {
        System.out.println("this is main method ");

    }
}
