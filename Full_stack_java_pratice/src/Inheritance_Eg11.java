class sub extends Inheritance_Eg11{
    public static final String Foo = "bar";
}
public class Inheritance_Eg11 {
    public static final String Foo = "foo";

    public static void main(String[] args) {
        Inheritance_Eg11 obj = new Inheritance_Eg11();
        sub obj1 = new sub();
        System.out.println(Inheritance_Eg11.Foo);
        System.out.println(sub.Foo);
        System.out.println(obj.Foo);
        System.out.println(obj1.Foo);
        System.out.println(((Inheritance_Eg11)obj1).Foo);

    }


}
