class Parent01{
    int add(int a , int b){
        System.out.println("this is  parent add method ");
        return a+b;

    }

    int multiply(int a , int b){
        System.out.println("this is parent multiply method");
        return a*b;
    }

}
class Child02 extends Parent01{
    int add(int a , int b , int c){
        System.out.println("this is child add method");
        return a+b+c;
    }
    int multiply(int a , int b){
        System.out.println("this is child multiply method");
        return a*b;
    }
}
public class Override_Rule_4 {
    public static void main(String[] args) {
        Child02 obj = new Child02();
        obj.multiply(9,5);
        obj.add(5,6);
    }
}
