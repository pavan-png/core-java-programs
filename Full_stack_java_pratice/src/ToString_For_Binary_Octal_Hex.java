public class ToString_For_Binary_Octal_Hex {
    public static void main(String[] args) {


        String s1 = Integer.toBinaryString(22);
        String s2 = Integer.toOctalString(74);
        String s3 = Integer.toHexString(45);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println();
        System.out.println("alternative way");
        // in both the ways  the answer is same.
        String s4 = Integer.toString(22,2);
        String s5 = Integer.toString(74,8);
        String s6 = Integer.toString(45,16);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);

    }
}
