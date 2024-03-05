import java.lang.reflect.Method;
class Check {
    private void private_Method(){
        System.out.println("private method");
    }
}
class Check1 extends Check {
   void access() throws Exception {
       Check obj = new Check();

       // method name is  passed as string argument.
       Method ref = Check.class.getDeclaredMethod("private_Method");
       ref.setAccessible(true);
       ref.invoke(obj);
   }
}
public class Private_Method_Inheritance {
    public static void main(String[] args) throws Exception {
        Check1 child_obj = new Check1();
        child_obj.access();
    }
}