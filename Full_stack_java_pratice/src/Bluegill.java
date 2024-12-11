interface Fish{

}
class Perch implements Fish{

}
class Walleye extends Perch{

}
public class Bluegill {
    public static void main(String[] args) {
        Fish f = new Walleye();
        Walleye w = new Walleye();
        Bluegill b = new Bluegill();
        if (f instanceof Perch)
            System.out.print("f-p");
        if (w instanceof Fish)
            System.out.print("w-f");
        if (b instanceof Fish)
            System.out.print("b-f");


    }
}
