public class Static_Array {
    private static int[] arr ;
    /*
    static variable will get the life during the loading of class so arr = null
    */
    public static void main(String[] args) {
        if ( arr.length>0 && arr != null)
            /*
            here on a null we are trying to perform operation (arr.length)  which leads to NullPointerException
            */
            System.out.println(arr[0]);
    }
}
