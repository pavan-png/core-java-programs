public class While_Loop_Eg9 {
    public static void main(String[] args) {

        // 'x' is a LOCAL variable of the main() method
        int x = 5;

        // while loop condition:
        // isAvailable(x) is called repeatedly
        // The value of 'x' from main is PASSED to the method
        while (isAvailable(x)) {

            // This prints the current value of 'x' from main()
            // Then x is decremented INSIDE main()
            System.out.println(x--);
        }

        // Loop ends when isAvailable(x) returns false
    }

    public static boolean isAvailable(int x) {

        // 'x' here is a DIFFERENT local variable
        // It receives a COPY of the value passed from main()
        // Any change to this 'x' affects ONLY this method

        // x-- > 0 :
        // - old value of x is compared with 0
        // - then x is decremented locally
        // - the decremented value is LOST when method returns
        return x-- > 0 ? true : false;
    }
}
