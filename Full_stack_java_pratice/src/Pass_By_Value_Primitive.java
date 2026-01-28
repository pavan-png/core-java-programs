public class Pass_By_Value_Primitive {

    public static void main(String[] args) {

        int a = 3;   // local variable in main stack frame

        modify(a);   // value 3 is copied

        System.out.println(a); // prints 3
    }

    static void modify(int x) {
        x = x + 2;   // modifies only local copy
    }
}
