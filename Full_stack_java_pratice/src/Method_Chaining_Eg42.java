public class Method_Chaining_Eg42 {
    public static void main(String[] args) {
        String name  = "pavan";
        String data = name.toUpperCase();
        int count  = data.length();
        System.out.println(count);

        // method chaining
        System.out.println(name.toUpperCase().length());

        StringBuffer s = new StringBuffer("pavan");

        // method chaining
        s.append("kalyan")
                .insert(5,'1')
                .reverse()
                .append("Hello")
                .insert(s.length(),"Hello")
                .reverse()
                .delete(0,4);
        System.out.println(s);

    }
}
