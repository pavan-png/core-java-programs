public class String_Eg138 {
    public static void main(String[] args) {
        String[] s1 = {"java","jEE","Hibernate","Spring","SpringBoot"};
        String s2 = String.join("_",s1);
        // delimiter repeats the given character after element , and array s1 is passed as parameter in elements.
        System.out.println(s2);

    }
}
