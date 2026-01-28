public class Return_Value {

    public static void main(String[] args) {

        int a = 10;

        a = add(a);

        System.out.println(a); // 11
    }

    static int add(int x) {
        return x + 1;
    }
}
