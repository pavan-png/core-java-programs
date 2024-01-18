public class Array_Eg12 {
    public static void main(String[] args){
        String[][] arr = {{"A","B","C"},{"C","D"}};
        for (int i =0 ; i<arr.length;i++){
            for (int j = 0 ; j<arr[i].length;j++){
                System.out.print(arr[i][j] +" ");
                if (arr[i][j].equals("B"))
                    break;
            }
            continue;
        }
    }
}
