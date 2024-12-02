public class String_Eg61 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder ("pavan kalyan ");
        change(str);
        System.out.println(str);
    }
    private static void change(StringBuilder s){

        s.append(" good morning");
    }
}
