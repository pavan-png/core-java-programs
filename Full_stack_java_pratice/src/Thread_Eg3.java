public class Thread_Eg3 extends Thread{
    final StringBuffer sb1 = new StringBuffer();
    final StringBuffer sb2 = new StringBuffer();
    public static void main(String[] args) {
        final Thread_Eg3 t = new Thread_Eg3();
        new Thread_Eg3(){
          public void  run(){
            synchronized (this){
                t.sb1.append("java");
                t.sb2.append("thread");
                System.out.println(t.sb1);
                System.out.println(t.sb2);
            }
          }
        }.start();

        new Thread_Eg3(){
            @Override
            public void run() {
                synchronized (this){
                    t.sb1.append("Multi-threading");
                    t.sb2.append("Example");
                    System.out.println(t.sb2);
                    System.out.println(t.sb1);
                }
            }
        }.start();

    }
}
