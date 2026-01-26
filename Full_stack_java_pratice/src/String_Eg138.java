public class String_Eg138 {
    public static void main(String[] args) {

        // String array containing multiple elements
        String[] s1 = {"java", "jEE", "Hibernate", "Spring", "SpringBoot"};

        // String.join(delimiter, elements...)
        // "_" is the delimiter
        // It is placed BETWEEN each element of the array
        // Array s1 is passed as the elements parameter
        // Resulting String will be:
        // "java_jEE_Hibernate_Spring_SpringBoot"
        String s2 = String.join("_", s1);

        // Prints the joined String
        System.out.println(s2);
    }
}
