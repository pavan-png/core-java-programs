
class Super_Calc{
    protected static int multiply(int a , int b){
        return a*b;
    }
}

public class Inheritance_Eg6 extends Super_Calc {

    /* public static int multiply(int a , int b){  // since static is used it does not refers to method overriding, it is method hiding

        int c = super.multiply(a,b); // it always refers to object creation process .
             when object is created at that time child class constructor is called , which internally calls parent using super.
              here static means trying to call method without object, but super refers to object creation , which leads to compilation error.

          return 10;
    }
     */
    public static void main(String[] args) {
Inheritance_Eg6 obj = new Inheritance_Eg6();
        System.out.println(obj.multiply(3,4));
        System.out.println(Inheritance_Eg6.multiply(2,2));

    }
}
