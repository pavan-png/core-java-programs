public class Anonymous_Object_Eg1 {
    int squares = 81;
    public static void main(String[] args) {
        new Anonymous_Object_Eg1().go();
    }
    void go(){
        incr(++squares);
        System.out.println(squares);
    }
    void incr(int squares){
        squares +=10;
    } // here squares is a local variable, scope is only until this block execution
    // gets completed.
}
