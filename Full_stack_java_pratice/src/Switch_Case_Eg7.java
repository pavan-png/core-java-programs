public class Switch_Case_Eg7 {
    public static void main(String[] args) {
        byte x =10;

        // byte + int -> int , but we are not storing that  again in byte , so no C.E
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
