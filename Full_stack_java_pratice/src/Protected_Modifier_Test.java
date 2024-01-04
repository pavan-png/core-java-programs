import pack.*;
// another package class is visible only when declared with public
public class Protected_Modifier_Test extends Protected_Modifier{
    public static void main(String[] args) {
        Protected_Modifier_Test obj = new Protected_Modifier_Test();
        // only protected data is acessed through object.
       // object of present class should be made not inherited one
        obj.msg();
        System.out.println(obj.a);

    }
}