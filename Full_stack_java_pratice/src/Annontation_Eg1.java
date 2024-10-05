@FunctionalInterface
/*
a functional should only contain one abstract method inorder to write a lambda expression,
there might be a case where a developer may write another abstract method , if it is marked with annotation
then compiler wil generate an error. so that other developer cant write another abstract method in interface
,if he attempts to write another abstract method compiler will give an error.
 */
interface Ann{
    void disp();
}
public class Annontation_Eg1 {
    public static void main(String[] args) {


        Ann ref = () -> {
            System.out.println();
        };
    }
}
