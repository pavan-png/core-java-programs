public class Array_Eg13 {
    public static void main(String[] args) {
       //  int[] a = new int[]; Size should be given compulsorily during array creation .
        int[] b = new int[0];  // no compile time error ,
        // compiler will not check thew number it checks only the size is given or not , no runtime exceptions also

        int[] c = new int[-4];
        // no compile time error but NegativeArraySizeException at runtime
    }
}
