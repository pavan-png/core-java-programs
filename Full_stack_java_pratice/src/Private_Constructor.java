class B {
    private  B(){
    }
    void b(){
        System.out.println("Hello java");
    }
}
public class  Private_Constructor{
    public static void main(String[] args) {
       // since constructor is private obj cannot be created
       // B obj = new B();

    }
}