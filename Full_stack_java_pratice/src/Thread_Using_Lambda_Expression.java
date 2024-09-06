public class Thread_Using_Lambda_Expression {
    public static void main(String[] args) {
       Runnable r = ()->{
            for (int i = 1 ; i<=5;i++){
                System.out.println("child thread");
            }
       };
       Thread t = new Thread(r);
       t.start();
        for (int i = 1 ; i<=5;i++){
            System.out.println("main thread ");
        }

    }
}
