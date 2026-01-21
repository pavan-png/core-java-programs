public class Array_Class {

    public static void main(String[] args) {

        /* =====================================================
           1️⃣ ONE-DIMENSIONAL PRIMITIVE ARRAYS
           ===================================================== */

        // Creating 1-D arrays of all primitive types
        // Each array is an OBJECT created in heap memory
        // Variables (arr, arr1, ...) are reference variables

        byte[]    arr  = new byte[3];
        short[]   arr1 = new short[3];
        int[]     arr2 = new int[3];
        long[]    arr3 = new long[3];
        float[]   arr4 = new float[3];
        double[]  arr5 = new double[3];
        char[]    arr6 = new char[3];
        boolean[] arr7 = new boolean[3];

        // getClass() returns the runtime class of the array object
        // getName() prints the internal JVM class name
        // Prefix meanings:
        // [  → array
        // B  → byte, S → short, I → int, J → long
        // F  → float, D → double, C → char, Z → boolean

        System.out.println("1 dimensional byte array class is   : " + arr.getClass().getName());
        System.out.println("1 dimensional short array class is  : " + arr1.getClass().getName());
        System.out.println("1 dimensional int array class is    : " + arr2.getClass().getName());
        System.out.println("1 dimensional long array class is   : " + arr3.getClass().getName());
        System.out.println("1 dimensional float array class is  : " + arr4.getClass().getName());
        System.out.println("1 dimensional double array class is : " + arr5.getClass().getName());
        System.out.println("1 dimensional char array class is   : " + arr6.getClass().getName());
        System.out.println("1 dimensional boolean array class is: " + arr7.getClass().getName());


        /* =====================================================
           2️⃣ TWO-DIMENSIONAL PRIMITIVE ARRAYS
           ===================================================== */

        // 2-D array = array of 1-D array references
        // Each dimension adds one '[' in the class name

        byte[][]    arr8  = new byte[3][2];
        short[][]   arr9  = new short[3][2];
        int[][]     arr10 = new int[3][2];
        long[][]    arr11 = new long[3][2];
        float[][]   arr12 = new float[3][2];
        double[][]  arr13 = new double[3][2];
        char[][]    arr14 = new char[3][2];
        boolean[][] arr15 = new boolean[3][2];

        System.out.println();
        System.out.println("----------------  2 dimensional  ----------------");
        System.out.println();

        System.out.println("2 dimensional byte array class is   : " + arr8.getClass().getName());
        System.out.println("2 dimensional short array class is  : " + arr9.getClass().getName());
        System.out.println("2 dimensional int array class is    : " + arr10.getClass().getName());
        System.out.println("2 dimensional long array class is   : " + arr11.getClass().getName());
        System.out.println("2 dimensional float array class is  : " + arr12.getClass().getName());
        System.out.println("2 dimensional double array class is : " + arr13.getClass().getName());
        System.out.println("2 dimensional char array class is   : " + arr14.getClass().getName());
        System.out.println("2 dimensional boolean array class is: " + arr15.getClass().getName());


        /* =====================================================
           3️⃣ THREE-DIMENSIONAL PRIMITIVE ARRAYS
           ===================================================== */

        // 3-D array = array of 2-D array references
        // Each additional dimension adds another '['

        byte[][][]    arr16 = new byte[3][2][2];
        short[][][]   arr17 = new short[3][2][2];
        int[][][]     arr18 = new int[3][2][2];
        long[][][]    arr19 = new long[3][2][2];
        float[][][]   arr20 = new float[3][2][2];
        double[][][]  arr21 = new double[3][2][2];
        char[][][]    arr22 = new char[3][2][2];
        boolean[][][] arr23 = new boolean[3][2][2];

        System.out.println();
        System.out.println("----------------  3 dimensional  ----------------");
        System.out.println();

        System.out.println("3 dimensional byte array class is   : " + arr16.getClass().getName());
        System.out.println("3 dimensional short array class is  : " + arr17.getClass().getName());
        System.out.println("3 dimensional int array class is    : " + arr18.getClass().getName());
        System.out.println("3 dimensional long array class is   : " + arr19.getClass().getName());
        System.out.println("3 dimensional float array class is  : " + arr20.getClass().getName());
        System.out.println("3 dimensional double array class is : " + arr21.getClass().getName());
        System.out.println("3 dimensional char array class is   : " + arr22.getClass().getName());
        System.out.println("3 dimensional boolean array class is: " + arr23.getClass().getName());
    }
}
