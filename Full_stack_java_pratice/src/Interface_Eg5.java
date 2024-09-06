public class Interface_Eg5 {

    /* we can write an interface inside the class
    by default Object class methods are present in all child classes with predefined implementation from
    Object class, equals method is object class method with predefined implementation
    so below interface is  a functional interface since it has only one abstract method apply

     */
    interface lambda_Function{
        int apply(int j);
        boolean equals(java.lang.Object arg0);
    }
    public static void main(String[] args) {
        Interface_Eg5.lambda_Function obj = (i)->{
            i=i*i;
            return i;
        };
        // all the above code can be written as obj = i->i*i;
        System.out.println(obj.apply(10));

    }
}
