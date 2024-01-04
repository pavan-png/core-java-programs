public class If_Else_12 {
    public static void main(String args[]) {


        /* here only first statement is a part of if statement , since we dont use curly braces compiler
        * will push the first statement inside as seen below
        * The second statement is independent of if    */
        if(true)
            System.out.println("hello");
        System.out.println("hi");
    }
}
