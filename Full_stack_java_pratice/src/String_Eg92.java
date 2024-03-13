public class String_Eg92 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(5);
        String s = "";
        if (sb.equals(s)){
            System.out.println("match 1");
        } else if (sb.toString().equals(s.toString())) {
            System.out.println("match 2");
        }
        else {
            System.out.println("match");
        }
    }
}
