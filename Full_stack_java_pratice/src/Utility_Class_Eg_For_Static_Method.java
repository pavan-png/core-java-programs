public class Utility_Class_Eg_For_Static_Method {
    public static int add(int a,int b){
        return a+b;
    }
    public static int sub(int a,int b){
        return a-b;
    }
    public static int mul(int a,int b){
        return a*b;
    }
    public static int div(int a,int b){
        return a/b;
    }

    public static void main(String[] args) {
        int result = Utility_Class_Eg_For_Static_Method.add(2,3);
        System.out.println(result);
        result = Utility_Class_Eg_For_Static_Method.sub(5,4);
        System.out.println(result);
        result = Utility_Class_Eg_For_Static_Method.mul(2,3);
        System.out.println(result);
        result = Utility_Class_Eg_For_Static_Method.div(10,2);
        System.out.println(result);
    }
}
