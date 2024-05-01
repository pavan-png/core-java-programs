public class String_Eg104 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("SpaceStation");
        sb.delete(5,6).insert(5," S").toString().toUpperCase();
        System.out.println(sb);

    }
}
