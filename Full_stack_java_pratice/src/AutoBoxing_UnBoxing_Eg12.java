public class AutoBoxing_UnBoxing_Eg12 {

    public static void doSum(int x ,int y){
        System.out.println("int sum is "+(x+y) );
    }

    public static void doSum(Integer x ,Integer y){
        System.out.println("Integer sum is "+(x+y) );
    }

    public static void doSum(double x ,double y){
        System.out.println("double sum is "+(x+y) );
    }

    public static void doSum(float x ,float y){
        System.out.println("float sum is "+(x+y) );
    }
    public static void main(String[] args) {
        doSum(10,20);
        // since parameters are of primitive type int jvm searches for related method and method that takes int arguments that method will be executed

        doSum(10.00,20.00);
        // since parameters are of double type jvm searches for related method and method that takes double  arguments that method will be  executed
    }
}
