public class String_Eg129 {
    public static void main(String[] args) {
        String s = "hello";
        boolean[] flag = new boolean[1];
        if (flag[0]){ // control never comes here
            s = "welcome";
        }
        System.out.println(s);
    }
}
