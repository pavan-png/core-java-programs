public class Method_Overloading_With_Implicit_TypeCasting {
    double add (int a , float b){
        return a+b;
    }

    float add (float a , int b){
        return a+b;
    }
    public static void main(String[] args) {
        Method_Overloading_With_Implicit_TypeCasting obj = new Method_Overloading_With_Implicit_TypeCasting();
        obj.add(20,30.3f);
        /* if the compiler doesn't find the method that accepts suitable arguments
        it checks whether there is any typecasting possible. if it finds a higher data type,it will type cast
        automatically.
         */



    }
}
