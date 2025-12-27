class Local_Variable_Eg1 {

    public static void main(String[] args) {

        int i = 0;
        // i is a local variable of the main() method
        // Scope of i is the entire main() method
        // It is created when main() starts and destroyed when main() ends

        for (int j = 0; j <= 5; j++) {
            // j is a local variable of the for-loop
            // Scope of j is ONLY inside this for-loop block
            // j is created when the loop starts
            // j is destroyed after the loop ends

            System.out.println(j);
            // Valid: j is accessible inside the for-loop
        }

        // System.out.println(j);
        // ❌ Compile Time Error
        // Reason:
        // j is a local (block-level) variable
        // Its scope is limited to the for-loop block only
        // Outside the loop, j does not exist

        System.out.println(i);
        // Valid
        // i is still accessible here because
        // its scope is the entire main() method
    }
}
