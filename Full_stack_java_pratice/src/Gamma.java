class Foo_0{
    private int x ;
    public Foo_0(int x){
        this.x = x;
    }
    public void setX(int x){
        this.x = x;
    }

    public int getX() {
        return x ;
    }
}
public class Gamma {
    static Foo_0 fooBar(Foo_0 foo){
        foo = new Foo_0 (100);
        return foo;
    }
    public static void main(String[] args) {
        Foo_0 foo = new Foo_0(300);
        System.out.print(foo.getX()+"-");
        Foo_0 fooFoo = fooBar(foo); // since it is a static method and we are calling it from the same class, it can be called directly.
        System.out.print(foo.getX()+"-");
        System.out.print(fooFoo.getX() + "-");
        foo = fooBar(fooFoo);
        System.out.print(foo.getX()+"-");
        System.out.print(fooFoo.getX());

    }
}
