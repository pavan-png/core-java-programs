interface Demo_2 {
    void display();
}

public class Anonymous_Inner_Class_Using_Interface  {
    public static void main(String[] args) {

        Demo_2 obj = new Demo_2() {
            public void display() {
                System.out.println("Hello");
            }
        };

        obj.display();
    }
}