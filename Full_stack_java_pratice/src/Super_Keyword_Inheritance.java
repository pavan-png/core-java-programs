class A01{
    int var = 10;
}
class B02 extends A01{
   int var = 20;
   void display(){
       System.out.println(" this is class B02");
       System.out.println(super.var);
       System.out.println("-----------------------------------------------------------------------------------");
   }
}
class C03 extends B02{
    int var = 30;
    void disp(){
        System.out.println(" this is class C03 .");
        System.out.println(super.var);
        System.out.println("-----------------------------------------------------------------------------------");
    }
}
public class Super_Keyword_Inheritance {
    public static void main(String[] args) {
        C03 obj = new C03();
        obj.disp();
        obj.display();

    }
}
