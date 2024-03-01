class Demo3{
    int a ;
    int b;
    static int  count ;
    {
        count++;
    }
    Demo3(){

    }
    Demo3(int a ){
        this.a = a;
    }
    Demo3(int a, int b){
        this.a = a;
        this.b = b;
    }
}
public class Count_No_Of_Objects_Using_Non_Static_Block {
    public static void main(String[] args) {
        Demo3 obj1 = new Demo3();
        Demo3 obj2 = new Demo3(10);
        Demo3 obj3 = new Demo3(10,20);

        // static variables. methods are called using class name.
        System.out.println("total no of objects are " + Demo3.count);
    }

}
