public class StringBuffer_Constructor_Eg28 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer();
        System.out.println("default capacity is "+s.length());
        s.append("abcdefghijklmnopqrst");
        System.out.println("increased length of StringBuffer "+s.length());
        System.out.println(s.capacity());
        s.append('q');
        System.out.println(s.length());
        System.out.println(s.capacity());
        /*
         here the default capacity is 16 but we have added 20 characters, now the increased capacity is
         16 ( current capacity  + 1 ) * 2
         new capacity is equal to 34
         we can new data to it when the size crosses 34 then the new size is
         34 ( current capacity + 1 ) *2
         new capacity will be 70.

         */
    }
}
