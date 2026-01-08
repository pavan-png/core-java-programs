public class Array_Eg10 {
    public static void main(String[] args) {
    int[][] arr = new int[2][4];
    arr[0] = new int[]{1,3,5,7};
    arr[1] = new int[]{1,3};
        for (int[] i :arr){
            for (int j :i){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
