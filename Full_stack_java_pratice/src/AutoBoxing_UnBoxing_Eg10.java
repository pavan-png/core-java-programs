interface Foo{}
class Aplha implements Foo{}
class Beta_0 extends Aplha{}



public class AutoBoxing_UnBoxing_Eg10 extends Beta_0 {
    public static void main(String[] args) {
        Beta_0 x = new Beta_0();
        Aplha a = x;  // child object can be collected by parent reference
        Foo f = (AutoBoxing_UnBoxing_Eg10) x;  // invalid because collecting type is of Foo (Interface )  ( which is not directly related to AutoBoxing_UnBoxing_Eg10 )
        Foo f1 = (Aplha) x;
        Beta_0 b = (Beta_0) (Aplha)x;

    }
}
