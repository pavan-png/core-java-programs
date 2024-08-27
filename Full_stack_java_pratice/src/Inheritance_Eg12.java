abstract class c1{
    c1(){
        System.out.print(1);
    }
}
class c2 extends c1{
    c2(){
        System.out.print(2);
    }
}
class c3 extends c2{
    c3(){
        System.out.print(3);
    }
}

public class Inheritance_Eg12 {
    public static void main(String[] args) {
        new c3();
    }
}
