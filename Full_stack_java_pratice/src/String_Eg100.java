public class String_Eg100 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello pavan how are you");
        sb.delete(0,100);
        // here we are deleting data from 0 index to 100th index so there will be no data in sb , so length will be 0.

        System.out.println(sb.length());

    }
}
