public class Switch_Case_Eg7 {
    public static void main(String[] args) {
        byte x =10;

        // byte + int -> int so range is as of int data type but not byte.
        switch (x+1){
            case 10:
                System.out.println("hello");
                break;
            case 100:
                System.out.println("hi");
                break;
            case 1000:
                System.out.println("bye");
                break;

        }
    }
}
