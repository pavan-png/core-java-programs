class Demo1{
    int a ;
    int b;
    int count ;
    Demo1(){
        count++;
    }

}
public class Count_No_Of_Objects {
    public static void main(String[] args) {
        Demo1 obj1 = new Demo1();
        Demo1 obj2 = new Demo1();
        Demo1 obj3 = new Demo1();
        System.out.println("total no of objects are " +obj1.count);
        System.out.println("total no of objects are " +obj2.count);
        System.out.println("total no of objects are " +obj3.count);
    }
}
