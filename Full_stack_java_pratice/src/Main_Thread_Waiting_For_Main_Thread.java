public class Main_Thread_Waiting_For_Main_Thread {
    public static void main(String[] args)  throws InterruptedException{
        Thread.currentThread().join();
    }
}
