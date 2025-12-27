public class Incrementation_1 {
    public static void main(String[] args) {

        int a = 7;

        // Rule 1:
        // If incrementation is written as a separate statement,
        // both post-increment (a++) and pre-increment (++a) give the SAME final value.
        // Here, a becomes 8.
        a++;  // (or) ++a would also make a = 8
        System.out.println(a); // prints 8



        // Rule 2:
        // Post-increment inside print statement:
        // First the CURRENT value is printed, then it is incremented.
        // So it prints 8, and then a becomes 9.
        System.out.println("post increment in print statement " + a++);



        // Pre-increment inside print statement:
        // First increment happens, then the incremented value is printed.
        // a was 9 → becomes 10 → prints 10
        System.out.println("pre increment in print statement  " + ++a);



        // Rule 3:
        // Post-increment while assigning:
        // First the OLD value of a goes to b, then a is incremented.
        // a was 10 → b gets 10 → then a becomes 11
        int b = a++;
        System.out.println("post incrementation after assigning " + b); // prints 10

        // Now printing a (which is incremented),
        // so this prints 11
        System.out.println("post incremented and printing incremented variable ,but not assigned one " + a);



        // Rule 4:
        // Pre-increment while assigning:
        // First a is incremented, then the incremented value is stored in c.
        // a was 11 → becomes 12 → c = 12
        int c = ++a;
        System.out.println("pre increment after assigning to c is " + c); // prints 12
        System.out.println(a); // prints 12



        // Complex Expression:
        // a is currently 12
        //
        // a++ → returns 12, then a becomes 13
        // a++ → returns 13, then a becomes 14
        // ++a → a becomes 15, returns 15
        //
        // So d = 12 + 13 + 15 = 40
        int d = a++ + a++ + ++a;

        // Printing final value of a which is 15
        System.out.println(a);

        // Printing calculated value of d which is 40
        System.out.println("value of d is : " + d);
    }
}
