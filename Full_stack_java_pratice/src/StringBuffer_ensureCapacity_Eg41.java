public class StringBuffer_ensureCapacity_Eg41 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer();
        System.out.println(s.capacity());
        s.ensureCapacity(20);
        /*
        if capacity is given like this StringBuffer s = new StringBuffer(10);
        If the object reaches the maximum capacity,
        new capacity = (total current capacity +10)  here 10 is user defined size during above declaration .

        if ensureCapacity(18) method is used, when the data exceeds the minimum length given by the user
        it follows
        new capacity = (current capacity +1) *2;
        calculated with default value 16.
        means after the data exceeds 20 the  new capacity will be (16+1)*2
         */
        System.out.println(s.capacity() );
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.capacity());
    }
}
