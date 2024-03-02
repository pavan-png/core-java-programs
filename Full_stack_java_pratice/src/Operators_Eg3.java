public class Operators_Eg3 {
    public static void main(String[] args) {
        boolean flag = true;

        // evaluation  true|false -> true since short OR operator , if 1st condition is true it will not check other .
        System.out.println((flag = true)|(flag = false  )|| (flag = true));

        // actual value of flag is false
        System.out.println(flag);
    }
}
