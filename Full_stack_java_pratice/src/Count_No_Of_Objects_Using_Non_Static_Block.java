class Demo3{
    int a ;
    int b;
    int result;
    {
        System.out.println("this is is the common code in non static block");
        a =10;
        b= 15;
        result = a+b;
    }
    public Demo3(){
        System.out.println(result);
    }
}
public class Count_No_Of_Objects_Using_Non_Static_Block {
    public static void main(String[] args) {
        Demo3 obj1 = new Demo3();
        Demo3 obj2 = new Demo3();
        Demo3 obj3 = new Demo3();

    }

}
