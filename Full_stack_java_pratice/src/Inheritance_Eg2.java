class Atom{
public Atom(){
    System.out.println("atom");
}
}
class Rock extends Atom{
    public  Rock(String type){
        System.out.println(type);
    }
}
public class Inheritance_Eg2 extends Rock {
    public Inheritance_Eg2(){
        super("granite");
        new Rock("granite");
    }


    public static void main(String[] args) {
            new Inheritance_Eg2();
    }
}
