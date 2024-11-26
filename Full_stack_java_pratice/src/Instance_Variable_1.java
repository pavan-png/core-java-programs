public class Instance_Variable_1 {
    boolean b ;
    char c ;
    int i = 10;
    public static void main(String[] args) {
     Instance_Variable_1   obj= new Instance_Variable_1();
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.i);
    }
    // scope of reference variable "obj" is  only until this line . once control comes to this line the reference
    // variable obj loses its value i.e (hashcode)


}
