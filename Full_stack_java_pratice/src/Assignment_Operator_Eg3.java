public class Assignment_Operator_Eg3 {
    public static void main(String[] args) {
        // literal (number) increment is not possible.
        int x = 5;
        x *= 3*5 + 7*x-1+ ++x;
        int y = x+++1;
        System.out.println(x);

    }
}
