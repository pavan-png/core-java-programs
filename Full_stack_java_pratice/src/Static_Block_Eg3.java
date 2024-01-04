public class Static_Block_Eg3 {
    static {
        System.out.println("this is static block 1");
    }
    static {
        System.out.println("this is static block 2");
    }
    static {
        System.out.println("this is static block 3");
    }
    static {
        System.out.println("this is static block 4");
    }

    public static void main(String[] args) {
        Static_Block_Eg3 obj = new Static_Block_Eg3();
        System.out.println("this is  main method");
    }
}
