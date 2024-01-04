class A3 {
    b3 temp;
    A3(b3 temp){
        this.temp = temp;
    }
    void display(){
        System.out.println(temp.a);
    }
}
class b3{
    int a = 10;
    b3(){
        A3 obj = new A3(this);
        obj.display();
    }

}
public class This_As_Arg_In_Cons_Call_Eg1{
    public static void main(String[] args) {
        b3 obj1 = new b3();
    }
}
