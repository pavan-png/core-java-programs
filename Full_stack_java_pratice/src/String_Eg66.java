public class String_Eg66 {
    public static void main(String[] args) {

        // RULE:
        // Before a String is encountered, '+' performs arithmetic addition.
        // Once a String is encountered, all subsequent '+' operations
        // perform STRING CONCATENATION (left to right).

        // Here, "Hello" appears first,
        // so every '+' after that is concatenation
        System.out.println("Hello" + 1 + 2 + 3 + 4); // Hello1234
    }
}
