public class String_Eg108 {
    public static void main(String[] args) {
        boolean flag1 = "Java" == "Java".replace('J','J');
        boolean flag2 = "Java" == "Java".replace('J','J');
        System.out.println(flag1&&flag2);
    }
}
