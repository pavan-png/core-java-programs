@FunctionalInterface
interface  Add{

    public void  addition(int a , int b);
}
public class Functional_Interface_With_Optional_Parameters_DataType {
    public static void main(String[] args) {

        Add obj = (a,b)->{
            int c = a+b;
            System.out.println(c);

        };
        obj.addition(5,10);

    }
}
