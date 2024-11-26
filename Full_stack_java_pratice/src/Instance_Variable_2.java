public class Instance_Variable_2 {
    int i = 10;

//  driving code -> automatically called by jvm.
    public static void main(String[] args) {
        // System.out.println(i); compile time error
        // cannot access instance variable without object (or) non-static field cannot be referenced from static context
        Instance_Variable_2 obj = new Instance_Variable_2();// object created i =10 stored in heap area
        // to access the i value stored in heap area , we use reference variable obj ,the reference variable contains
        // hashcode (address) of heap area.
        System.out.println(obj.i);
    }
    public void methodOne(){
        // inside instance method instance variable can be directly accessed without object//.
        System.out.println(i);
    }
}

