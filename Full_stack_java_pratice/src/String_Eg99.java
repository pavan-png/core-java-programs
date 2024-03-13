public class String_Eg99 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(5);
        sb.append("0123456789");
        sb.delete(8,1000);
        System.out.println(sb);
        /* here the capacity is full , so the  new capacity will be (5+1)*2 = 12, and we are trying to delete
         data from 8 index to 1000 , so data present between 8 index to 1000 will be deleted . here only 8 and 9th positions are
         present the remaining  will not cause any error or exception . */
    }
}
