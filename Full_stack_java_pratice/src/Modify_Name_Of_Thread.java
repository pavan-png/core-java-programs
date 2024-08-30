
public class Modify_Name_Of_Thread extends Thread {
    public static void main(String[] args) {
        Modify_Name_Of_Thread t = new Modify_Name_Of_Thread();
        t.start();
        System.out.println(t.getName());
        Thread.currentThread().setName("pavan-one-man-army");
        System.out.println(Thread.currentThread().getName());
        System.out.println(10/0);
    }


    }

