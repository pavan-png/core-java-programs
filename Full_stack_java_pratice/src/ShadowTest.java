// Interface
interface ITest_1 {
    int value = 100;   // public static final
}

public class ShadowTest implements ITest_1 {

    // Static variable
    static int value = 200;

    void display() {

        // Local variable
        int value = 400;

        System.out.println("Local variable: " + value);
        // OUTPUT → 400
        // Local shadows everything

        System.out.println("Static variable: " + ShadowTest.value);
        // OUTPUT → 200

        System.out.println("Interface variable: " + ITest_1.value);
        // OUTPUT → 100
    }

    public static void main(String[] args) {
        ShadowTest obj = new ShadowTest();
        obj.display();
    }
}
