
// Java program to illustrate
// loose coupling concept
/*
 cannot have public interface and public class , only one interface (or) class should be marked as public
 otherwise it will ead to compile time error
 */
interface Topic_1
{
    void understand();
}
class Topic1 implements Topic_1 {
    public void understand()
    {
        System.out.println("Got it");
    }
} class Topic2 implements Topic_1 {
    public void understand()
    {
        System.out.println("understand");
    }
} public class Subject_1{
    public static void main(String[] args)
    {
        Topic_1 t = new Topic1();
        t.understand();
    }
}

/* In the above example, Topic1 and Topic2 objects are loosely coupled.
It means Topic_1 is an interface and we can inject any of the implemented classes at run time
 and we can provide service to the end user.
 */
