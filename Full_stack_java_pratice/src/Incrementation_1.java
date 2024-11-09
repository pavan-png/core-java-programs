public class Incrementation_1 {
    public static void main(String[] args) {
        int a = 7;
       //Rule1:  incrementation will be done whether it is post (or) pre o/p will be same . if declared as below
        a++; // (or) ++a same output  ,  ouput will be 8
        System.out.println( a );

        //Rule 2:  if increment is directly written in the print statement , and if it is post increment first a is printed
        //  and then incremented , output will be  8 and a incremented to 9
        System.out.println( "post increment in print statement " + a++);

        // if it is pre increment first incremented and then printed , output is 10
        System.out.println( "pre increment in print statement  " + ++a);

        // Rule 3 :  whenever post incrementation is assigned to variable first r.h.s variable
        // is stored in l.h.s and then incremented , output is 10 and incremented to 11
        int b = a++;
        System.out.println("post incrementation after assigning " + b);
        // here were are printing incremented variable , not the one which is assigned
        // so output will be 11
        System.out.println("post incremented and printing incremented variable ,but not assigned one "+a);

        //Rule 4 : whenever pre increment is assigned to variable first incremented and then stored
        // in l.h.s  , output is 12
        int c = ++a;
        System.out.println("pre increment after assigning "+c);

        int d = a++ + a++ + ++a ;
        // prints  the incremented value of a o/p is 15
        System.out.println(a);

        // adds the incremented value every time and stores in d
        System.out.println(d);



    }
}
