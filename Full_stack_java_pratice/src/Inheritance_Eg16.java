class Animal_1 {
    public String noise() {
        return "peep";
    }
}

 class Dog_4 extends Animal_1 {
    public String noise() {
        return "bark";
    }
}

class Cat_1 extends Animal_1 {
    public String noise() {
        return "meow";
    }
}
public class Inheritance_Eg16
{
    public static void main(String[] args) {
        Animal_1  obj = new Cat_1();
        Animal_1 obj1 = new Dog_4();
        /*
        to type cast compulsorily upcasting should be done before.
        after that we can perform downcasting

        and to typecast there should be parent-child or child-parent relationship
         */
        Cat_1 c = (Cat_1) obj ;
        System.out.println(c.noise());

    }
}