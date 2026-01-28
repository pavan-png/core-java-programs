public class Static_Method {

    public static void main(String[] args) {
        int a = 3;
        m(++a, a++);
        System.out.println(a);
    }

    private static void m(int i, int j) {
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}
