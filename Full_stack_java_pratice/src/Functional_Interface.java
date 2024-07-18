interface  Fun{
    public void display();
}
public class Functional_Interface {
    public static void main(String[] args) {
        Fun obj = () ->{
            System.out.println("hello there ");
        };
        obj.display();
    }
}
