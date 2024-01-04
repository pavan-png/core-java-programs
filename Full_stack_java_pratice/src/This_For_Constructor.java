public class This_For_Constructor {
    This_For_Constructor(){
        System.out.println("This is a constructor");
    }
    This_For_Constructor(int a){
        this();
        System.out.println(a);
    }

    public static void main(String[] args) {
        This_For_Constructor obj = new This_For_Constructor(50);

    }
}
