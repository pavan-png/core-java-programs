public class Operators {
    public static void main(String[] args) {
        int mask = 0;
        int count =0;
        // here since 5<7 evaluates to true next condition (count) is not evelauted , and since | ( bitwise or operator )
        // evaluates both conditions mask is also evaluated
        // here mask is first used to check condition and then incremented
        if(((5<7) || (++count>1))| mask++<10) mask = mask+1;

        //go through the table
        if((6>8)^false) mask= mask +10;

        // here mask is  greater than 1  but since ! it evaluates to false ,  short circuit AND operator will not check other condition , if first condition is false
        if(!(mask>1) && ++count >1) mask = mask +100;
        System.out.println(mask + " " + count);
    }
}
