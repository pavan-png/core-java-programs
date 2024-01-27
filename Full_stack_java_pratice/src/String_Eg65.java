public class String_Eg65 {
    public static void main(String[] args) {
        final String fname = "james";
        String Lname ="Gosling";
        String name1 = fname+Lname;
        String name2 = fname + "Gosling";
        String name3 = "james" + "Gosling";
        System.out.println(name1 == name2);
        System.out.println(name2 == name3);
    }
}
