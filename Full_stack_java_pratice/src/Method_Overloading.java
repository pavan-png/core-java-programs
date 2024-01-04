public class Method_Overloading {
    int add( int a , int b){
        return a+b;
    }
    // chained assignment is not possible in method parameters , you can do only  single assignment
    // semi-colon is not allowed in method parameters as well as arguments , it is  allowed in for loop declaration
    int add (int a, int b , int  c){
        return a+b+c;
    }

    // while using float and int , float should always be the return type since higher data type
    // implicit type casting
    float  add (int a , float b){
        return a+b;
    }
    float add (float a,float b){
        return a+b;
    }
    float add (float a, float b , float c){
        return a+b+c;
    }

    float add (int a , float b , long c){
        return a+b+c;
    }

    double add(int a, float b , double c){
        return a+b+c;
    }

    public static void main(String[] args) {
        int a = 30; int b = 40 ; int c = 30;
        float m = 30.3f ; float n = 10.3f ; float o = 5.33f;
        double x = 20.34; double y = 2.34 ; double z = 5.96;

        // we can give  arguments name as different , but internally they are stored as parameters names.
       Method_Overloading obj =  new Method_Overloading();
        System.out.println(obj.add(a,n,z));
        System.out.println(obj.add(a,m));

    }
}
