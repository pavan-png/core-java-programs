final class Test_2{
    // if the class is not made AS there is a possibility that it can participate in inheritance and the core immutability
    // logic of modify can be changed.
    int i ;
    Test_2(int i){
        this.i = i;
    }
    public Test_2 modify(int x){
        if (this.i == x){
            System.out.println(this); // gives object address
            return this;
        }
        else return new Test_2(x);
    }
}
public class Immutable_Class {
    public static void main(String[] args) {
        Test_2 obj = new Test_2(10);
        Test_2 obj1 = obj.modify(10);
        Test_2 obj2 = obj.modify(100);
        System.out.println(obj == obj1);
        System.out.println(obj == obj2);


    }
}
