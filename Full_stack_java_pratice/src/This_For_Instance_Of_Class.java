class A1 {

    A1 method() {
        return this;
    }

    void display() {
        System.out.println("hello world");
    }
}
   public class This_For_Instance_Of_Class {
       public static void main(String[] args) {
           new A1().method().display();
       }
   }

