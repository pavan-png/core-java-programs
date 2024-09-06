public class Thread_Using_Anonymous_Inner_Class {
    public static void main(String[] args) {
        Runnable r = new Runnable(){
            @Override
            public void run() {
                for (int i = 1;i<=5;i++){
                    System.out.println("child thread");
                }
            }
        };
        Thread t = new Thread(r);
        t.start();
        for (int i = 1 ; i<=5;i++ ){
            System.out.println("main thread");
        }

    }
}
