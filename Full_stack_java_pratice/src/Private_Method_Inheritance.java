import java.lang.reflect.Method;
class A9 {

    private void secretLogic() {
        System.out.println("Secret logic from parent");
    }
}

class A10 extends A9 {

    void disp() throws Exception {

        // 1️⃣ get Class object of parent
        Class<?> cls = A111.class;

        // 2️⃣ get private method
        Method m = cls.getDeclaredMethod("secretLogic");

        // 3️⃣ disable access checking
        m.setAccessible(true);

        // 4️⃣ invoke private method
        m.invoke(this);
    }
}
public class Private_Method_Inheritance {
    public static void main(String[] args) throws Exception {

        A112 obj = new A112();
        obj.disp();
    }
}