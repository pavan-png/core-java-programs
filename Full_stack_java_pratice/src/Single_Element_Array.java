public class Single_Element_Array {

    public static void main(String[] args) {

        int[] a = {10};

        update(a);

        System.out.println(a[0]); // 11
    }

    static void update(int[] arr) {
        arr[0]++;
    }
}
