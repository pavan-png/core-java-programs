class Shape{
    public Shape(){
        System.out.println("shape constructor");
    }

    public class Color{
        public Color(){
            System.out.println("color constructor");
        }
    }
}
public class Inner_Class_Eg2 {
    public static void main(String[] args) {
     /*   Shape.Color obj = new Shape().Color();
     if new operator is not given with color constructor , compiler treats color as a method and searches for it
     in the class. which leads to compile time error
      */


    }
}
