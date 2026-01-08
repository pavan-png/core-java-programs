public class Array_Eg22 {
    String[] x  ;
    // String[] x = new String[] { "Hello"};
    int[] a[] = {{1,2},{1}};
    Object c = new long[4]; //parent reference child object, but binding is done by jvm based on runtime object

    // since x is a instance variable default value is applied to it and no error ,
    // if the same is declared in the main method , it shows error since not intialized since variables must be intialized before its use .
    // both below lines have  valid syntax.
    Object d = x;
    // Object[] d = x;
    public static void main(String[] args) {
        Array_Eg22 obj = new Array_Eg22();
        System.out.println(obj.c);

    }
}
