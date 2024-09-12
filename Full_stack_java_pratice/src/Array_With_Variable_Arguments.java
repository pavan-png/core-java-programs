public class Array_With_Variable_Arguments {
    int[] x = {1,2,3};
    int y[] = {4,5,6};
    void go(int[]...  z){
        for (int[] a:z){
            System.out.println(a[0]);
            System.out.println(a[1]);
            System.out.println(a[2]);
        }
    }
    public static void main(String[] args) {
        Array_With_Variable_Arguments obj = new Array_With_Variable_Arguments();

        // since x and y are non-static , it should be accessed with object.
        obj.go(obj.x, obj.y);

    }
}
