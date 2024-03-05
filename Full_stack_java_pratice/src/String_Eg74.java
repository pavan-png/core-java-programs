public class String_Eg74 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("B");
        sb.append(sb.append("A"));
        System.out.println(sb);
    }
}
