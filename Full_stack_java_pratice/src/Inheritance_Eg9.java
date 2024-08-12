class X {
    X(){
        System.out.println(1);
    }
    X(int x){
        this(); // calls current class constructor
        System.out.println(2);
    }
}
public class Inheritance_Eg9 extends X {
    Inheritance_Eg9(){
    super(6); // calls parent class constructor  with arguments
        System.out.println(3);
    }
    Inheritance_Eg9(int y){
        this();
        System.out.println(4);
    }

    public static void main(String[] args) {
        new Inheritance_Eg9(5);
    }
}
