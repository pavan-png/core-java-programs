class Demo4{
    int a ;
    int b;
    static int  count ;
    {
        System.out.println("This is java block ");
        count++;
    }
    Demo4(){
        this(10);
        System.out.println("constructor 1");
    }
    Demo4(int a ){
        this.a = a;
        System.out.println("constructor 2");
    }
    Demo4(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("constructor 3");
    }
}
public class Java_Block_Execution {
    public static void main(String[] args) {

        Demo4 obj1 = new Demo4();
        Demo4 obj2 = new Demo4(10);
        Demo4 obj3 = new Demo4(10, 20);

        // static variables. methods are called using class name.
        System.out.println("total no of objects are " + Demo4.count);
    }
}
