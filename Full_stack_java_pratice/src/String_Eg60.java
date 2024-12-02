public class String_Eg60 {
    public static void main(String[] args) {
        String str = "pavan kalyan ";
        change(str);
        System.out.println(str);
    }
    private static void change(String s){
        s.concat(" good morning");
        // reference is not collected so garbage collector will remove the object.
    }

}
