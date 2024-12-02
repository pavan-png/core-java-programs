public class String_Eg71 {
    public static void main(String[] args) {
        String res = "";
        String[] arr  = {"Dog",null,"Friendly"};
        for (String s :arr){
            // if null.join means it would lead to null pointer exception . but below way will not throw exception.
            res += String.join("-",s);
        }
        System.out.println(res);
        System.out.println(String.join("-","hello","pavan","kalyan"));
        // de-limiter not wroking on array of elements, it is working directly on elements

    }
}
