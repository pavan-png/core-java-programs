public class Without_Static_import {
    // since Math is present in lang package , which is  included by default for every java program.
    public static void main(String[] args) {
        System.out.println(Math.sqrt(4));
        System.out.println(Math.max(10,20));
        System.out.println(Math.random());
    }
}
