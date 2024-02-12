public class Array_Eg22 {
    String[] x  ;
    // String[] x = new String[] { "Hello"};
    int[] a[] = {{1,2},{1}};
    Object c = new long[4];

    // since x is a instance variable default value is applied to it and no error ,
    // if the same is declared in the main method , it shows error since not intialized since variables must be intialized before its use .
    // both below lines have  valid syntax.
    Object d = x;
    // Object[] d = x;
    public static void main(String[] args) {

    }
}
