public class Array_Eg14 {
    public static void main(String[] args) {
        int[][] a = new int[3][4];

        // printing a 2D array reference
        // prints class name + @ + hashcode
        // example output: [[I@15db9742
        // [[ → 2-dimensional array, I → int
        System.out.println(a);

        // printing a[0], which is a 1D int array reference
        // prints class name + @ + hashcode
        // example output: [I@6d06d69c
        System.out.println(a[0]);

        // printing the actual element at row 0, column 0
        // default value of int is 0
        System.out.println(a[0][0]);
    }
}
