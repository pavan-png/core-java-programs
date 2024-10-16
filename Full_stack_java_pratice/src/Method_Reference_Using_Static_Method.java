public class Method_Reference_Using_Static_Method {
    public static void m1(){
        for (int i =0;i<=5;i++){
            System.out.println("child method");
        }
    }
    public static void main(String[] args) throws InterruptedException{
        Runnable r = Method_Reference_Using_Static_Method::m1;
        // For this  runnable interface r run() method go and check the logic available in this method

        Thread t = new Thread(r);
        t.start();

        for (int i =0;i<=5;i++){
            System.out.println("main method");
            Thread.sleep(1000);
        }

    }
}
