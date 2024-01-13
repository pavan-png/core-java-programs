public class String_Eg17 {
    public static void main(String[] args) {
        String[] str = {"A","B"};
        int idx = 0;
        for (String s :str){
            str[idx].concat("element" +idx);
            idx++;
        }

        for (idx =0; idx < str.length;idx++){
            System.out.print(str[idx] + " ");
        }



    }
}
