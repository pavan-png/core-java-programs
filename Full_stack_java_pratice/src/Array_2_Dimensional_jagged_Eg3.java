public class Array_2_Dimensional_jagged_Eg3 {
    public static void main(String[] args) {

        // 2-dimensional jagged array
         // int arr[][] = new int[][]{{10,20},{20,30,40},{50,60,70,80,90}};
        int[][] arr = {{10,20},{30,40,50},{60,70,80,90}};

        for (int a[] : arr){
            for (int b : a){
                System.out.print(b+ " ");
            }
            System.out.println( );
        }


    }
}
