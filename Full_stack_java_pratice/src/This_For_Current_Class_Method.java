public class This_For_Current_Class_Method {
    void a(){
        System.out.println("this is method a ");
    }
    void b(){
        System.out.println("this is method  b");
       // compiler automatically generates this.a() even if this is not used as below
        a();
    }

    public static void main(String[] args) {
        This_For_Current_Class_Method obj = new This_For_Current_Class_Method();
        obj.b();
    }
}
