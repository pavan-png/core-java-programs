class Demo1 {
    int count;

    Demo1() {
        count++;
    }
}

public class Count_No_Of_Objects {
    public static void main(String[] args) {

        Demo1 obj1 = new Demo1();
        Demo1 obj2 = new Demo1();
        Demo1 obj3 = new Demo1();

        System.out.println(obj1.count); // 1
        System.out.println(obj2.count); // 1
        System.out.println(obj3.count); // 1
    }
}
