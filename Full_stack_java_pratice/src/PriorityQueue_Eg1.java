import java.util.PriorityQueue;

public class PriorityQueue_Eg1 {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add(10);
        pq.add(25);
        pq.add(55);
        pq.add(20);
        pq.add(55);
        System.out.println(pq);
        PriorityQueue pq1 = new PriorityQueue();
        pq1.add(10.5);
        pq1.add(4.3);
        pq1.add(14.4);
        pq1.add(18.0);
        System.out.println(pq1);
        pq1.remove(18.0);
        System.out.println(pq1);
        PriorityQueue pq2 = new PriorityQueue();
        pq2.add("hello");
        pq2.add("hi");
        pq2.add("pavan");
        pq2.add("kalyan");
        System.out.println(pq2);
        pq2.remove("hi");
        System.out.println(pq2);



    }
}
