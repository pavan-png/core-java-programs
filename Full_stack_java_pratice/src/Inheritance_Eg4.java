class Building{

}
public class Inheritance_Eg4 extends Building{
    public static void main(String[] args) {
        Building obj = new Building();
        Inheritance_Eg4 obj1 = new Inheritance_Eg4();
        Inheritance_Eg4 obj2  = (Inheritance_Eg4) obj;
        Object obj3 = (Object) obj;
        // no need of type casting it is done automatically       Object obj3 = obj   this  is also correct

        //   String str1 = (String) obj; leads to compile time error


        Building obj4 = (Building) obj1;
        //no need of type casting it is done automatically       Building obj4 = obj1   this  is also correct
    }
}
