public class Array_3_Dimensional_jagged_Eg3 {
    public static void main(String[] args) {
        int[][][] arr = {    {{1,2},{3,4,5,6,7}}  ,  {{8,9},{10,11,13}}    };
        for(int[][] a:arr){
            for (int[] b: a){
                for (int c : b ){
                    System.out.print(c +" ");
                }
                System.out.println();
            }
        }
    }
}
