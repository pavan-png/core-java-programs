public class Method_With_Return_Type_And_Parameters {
    // properties , fields ,instance variables
    int c;

    // method , activity , behaviour , does-part
    // if variables are declared inside class and used in the method as parameter . it will show data type error .
    // so declare with datatypes in the parameter.
    int  add( int a, int b){ // parameters
        c = a+b;
        return c;
    }

    public static void main(String[] args) {
        Method_With_Return_Type_And_Parameters obj = new Method_With_Return_Type_And_Parameters();
        int result  = obj.add(10,20); // arguments
        System.out.println(result);

    }

}
