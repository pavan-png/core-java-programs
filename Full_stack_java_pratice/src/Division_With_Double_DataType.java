public class Division_With_Double_DataType{

    public static void main(String[] args) {

        double a = 23;

        // Case 1: 0 divided by a double
        // 0.0 / 23.0 → 0.0 (Valid in floating-point arithmetic)
        System.out.println("0 divided by a double: " + 0 / a);

        // Case 2: double divided by 0
        // 23.0 / 0.0 → Infinity (IEEE 754 rule, no exception)
        System.out.println("double divided by 0: " + a / 0);

        double b = 0;
        double c = 0;

        // Case 3: 0.0 divided by 0.0
        // This is an undefined form → NaN (Not a Number)
        System.out.println("double 0 divided by double 0: " + b / c);

        // Case 4: 0 / 0
        // Here both 0 and 0 are int literals, so this becomes integer division.
        // Integer division by zero ALWAYS throws ArithmeticException.
        //
        // NOTE:
        // If you want floating-point division (which gives NaN), write:
        // System.out.println(0.0 / 0.0);
        //
        // But 0/0 (int division) will always crash.
        System.out.println("int 0 divided by int 0: " + 0 / 0);
    }
}
