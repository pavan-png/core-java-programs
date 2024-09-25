interface DoNothing{
    /*from  java 1.8 interface can have concrete methods , only if the access modifier is default.
    if default modifier is not added public abstract will be the normal nature  which leads to compile time
    error.
     */

    default void doNothing(){
        System.out.println("do nothing");
    }
}
//functional interface
interface DontDoAnything extends DoNothing{
    /* default doNothing method is present in DontDoNothing interface since there is a parent child relation.
but there is only one abstract method in the interface , in an interface has only one abstract method it is a
functional interface
     */
    public abstract void doNothing();
    // the default methods gets inherited in the child class
}
public class Interface_Eg3 {
    public static void main(String[] args) {
        //lambda expression is always binded to abstract method
        DontDoAnything obj =() ->{
            System.out.println("iam idle");
        };
        obj.doNothing();
        // the above code is executed lambda expression code is executed.
    }
}
