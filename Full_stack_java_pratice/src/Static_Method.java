public class Static_Method {
    public static void main(String[] args) {
        int a = 3;
        m(++a,a++ );
        System.out.println(a);
    }
    // first 4 is applied as the argument to the j. And then incremented to 5  ( variable a)
    private static void m(int i , int j){
        i++;
        j++;
        System.out.println(j);

    }
}
