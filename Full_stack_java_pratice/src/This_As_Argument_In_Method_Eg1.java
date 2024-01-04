 class A2 {
    int a =15;
    void print1 (A2 obj){
        System.out.println("the number is " +a);
    }
    void invoke(){
        print1(this);
    }
}
public class This_As_Argument_In_Method_Eg1 {
    public static void main(String[] args) {


        A2 obj1 = new A2();
obj1.invoke();
    }
}

