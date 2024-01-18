public class Array_Eg11 {
    public static void main(String[] args) {
        String[] arr = new String[2];
      //  arr[0] = "hello";
     //   arr[1] = "pavan";
        int idx =0;
        for (String str : arr){
            arr[idx].concat("element " +idx);
        }
        for ( idx =0 ; idx<arr.length; idx++){
            System.out.println(arr[idx]);
        }
    }
}
