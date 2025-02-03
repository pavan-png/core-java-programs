@FunctionalInterface
interface  Add{

    public void  addition(int a , int b);
}
public class Functional_Interface_With_Optional_Parameters_DataType {
    public static void main(String[] args) {

        Add obj = (  a,  b)->{
            // data types should be given to all the parameters (or) should not be declared for all the parameters
            // we cannot specify data types only for some parameters, it leads to compile time error
            int c = a+b;
            System.out.println(c);

        };
        obj.addition(5,10);

    }
}
