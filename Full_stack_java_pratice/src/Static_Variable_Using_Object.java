public class Static_Variable_Using_Object {
static int  a = 25;

    public static void main(String[] args) {
        System.out.println(a);
        Static_Variable_Using_Object obj = new Static_Variable_Using_Object();

        System.out.println(obj.a);
    }

}