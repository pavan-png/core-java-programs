public class Static_Block_Eg2 {
    static {
        System.out.println("this is static block");
    }
    Static_Block_Eg2(){
        System.out.println("this is contructor");
    }

    public static void main(String[] args) {
        System.out.println("this is main method");
        Static_Block_Eg2 obj = new Static_Block_Eg2();

    }
}
