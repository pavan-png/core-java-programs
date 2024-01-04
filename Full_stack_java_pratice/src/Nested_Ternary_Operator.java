public class Nested_Ternary_Operator {
    public static void main(final String[] args) {
        int x = 100;
        int a = x++;
        int b = ++x;
        int c = x++;
        int d = (a<b)?(a<c)?a:(b<c)?b:c:x;
        System.out.println(d);

    }
}
