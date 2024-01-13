public class Array_Eg9 {
    public static void main(String[] args) {
        int[] numbers ;
        numbers = new int[2];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers = new int[4];
        numbers[2] = 30;
        numbers[3] = 40;
        for (int i :numbers){
            System.out.println(i);
        }

        /*  int[] a = {2,3,4};
            a = {20,6,7,8};

            here in same array object we are trying to increase the size which is compilation error , but in the numbers array .
            array is declared once and 2 objects are declared with different sizes.

         */


    }
}
