class Demo2{
    int a ;
    int b;
    static int  count ;
    Demo2(){
        count++;
    }

}
public class Count_No_Of_Objects_Using_Static_Variable_In_Constructor {
    public static void main(String[] args) {
        Demo2 obj1 = new Demo2();
        Demo2 obj2 = new Demo2();
        Demo2 obj3 = new Demo2();

        // static variables. methods are called using class name.
        System.out.println("total no of objects are " + Demo2.count);
    }
}

