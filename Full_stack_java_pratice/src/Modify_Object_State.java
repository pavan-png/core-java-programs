class Box_2 {
    int value;
}

public class Modify_Object_State {

    public static void main(String[] args) {

        Box_2 b = new Box_2();
        b.value = 10;

        update(b);

        System.out.println(b.value); // 11
    }

    static void update(Box_2 obj) {
        obj.value++;
    }
}
