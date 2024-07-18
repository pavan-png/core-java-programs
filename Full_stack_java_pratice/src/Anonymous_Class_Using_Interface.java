interface Demo_1{
    void display();
    void add (int a , int b);
}
public class Anonymous_Class_Using_Interface {
    public static void main(String[] args) {
        Demo_1 obj = new Demo_1() {
            @Override
            public void display() {
                System.out.println("hello there");
            }

            @Override
            public void add(int a, int b) {
                int c = a+ b;
                System.out.println(c);
            }
        };
        obj.display();
        obj.add(5,10);
    }

}
