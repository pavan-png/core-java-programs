class Gen<T>{
    T obj;
    Gen( T obj){
        this.obj = obj;
    }
    public void show(){
        System.out.println("the type of object is : " +obj.getClass().getName());
    }
    public T getObject(){
        return obj;
    }
}

public class User_Defined_Generics {
    public static void main(String[] args) {
        Gen<Integer> g1 = new Gen<Integer>(1);
        g1.show();
        System.out.println(g1.getObject());

        Gen<String> g2 = new Gen<String>("Hello pavan");
        g2.show();
        System.out.println(g2.getObject());

        Gen<Double> g3 = new Gen<Double>(10.5);
        g3.show();
        System.out.println(g3.getObject());
    }
}
