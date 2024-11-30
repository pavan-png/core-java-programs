public class String_Eg17 {
    public static void main(String[] args) {
        String[] str = {"A","B"};
        int idx = 0;

        for (String s :str){
             str[idx].concat("element" +idx);
            // since reference is not collected, garbage collector will clear it. new object with concatenated
            // data is removed by garbage collector.
            idx++;
        }

        for (idx =0; idx < str.length;idx++){
            System.out.print(str[idx] + " ");
        }



    }
}
