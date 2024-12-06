public class Manual_Execution {
    int c ;
    int d;
    {
        System.out.println("this is  java block");
        c = 10;
        d = 20;
    }
    static void test(){
        System.out.println("static method");
    }
    Manual_Execution(){

        System.out.println("this is constructor ");
    }
    void disp(){

        System.out.println("this is instance method");
    }
    public static void main(String[] args) {
        Manual_Execution obj = new Manual_Execution();
        obj.disp();
        test();

    }
}
