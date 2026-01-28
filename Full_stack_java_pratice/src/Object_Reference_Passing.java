class Fizz {
    int x = 5;
}

public class Object_Reference_Passing {

    public static void main(String[] args) {

        Fizz f1 = new Fizz();

        modify(f1);

        System.out.println(f1.x); // prints 6
    }

    static void modify(Fizz obj) {
        obj.x = 6;   // modifies the object data
    }
}
