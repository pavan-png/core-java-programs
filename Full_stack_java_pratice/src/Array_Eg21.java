public class Array_Eg21 {
    public static void main(String[] args) {
        int[][] a = {{1,2},{3,4}};
        int[] b = (int[]) (a[1]); // we can type cast from 2d array to 1d array.
        Object o1 = a;
        int[][]  a2 = (int[][]) (o1); /*
         implicit type casting cannot be done from object to array. so done explicitly
         to type cast there must be parent to child (or) child to parent relation. object is a
         higher type and array is a lower type, so explicit typecasting is done
        */
        System.out.println(b[1]);
        System.out.println(b);
        System.out.println(o1);
    }
}
