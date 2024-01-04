public class Method_Overloading_With_Numeric_Type_Casting {
    float add (int a , float b){
        return a+b;
    }

    float add (float a , float b , int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Method_Overloading_With_Numeric_Type_Casting obj = new Method_Overloading_With_Numeric_Type_Casting();
        System.out.println(obj.add(20,30));
    }
}
