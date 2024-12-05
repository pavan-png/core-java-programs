public class String_Eg140 {
    Boolean[] b1 = new Boolean[3];
    boolean b2;
    public static void main(String[] args) {
        Boolean[] b = new Boolean[2];
        // default value of wrapper class Boolean is null
        // here b is of object type the default value of object is null . we are not performing operation on null just acessing it .
        // so no null pointer exception.
        System.out.println(b[0] +" : "+b[1]);

        String_Eg140 obj = new String_Eg140();
        System.out.println(obj.b1[0] + " : " + obj.b1[1] +" : "+obj.b1[2]);

        // default value of primitive type boolean is false
        System.out.println(obj.b2);

    }
}
