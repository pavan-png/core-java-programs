public class Parameterized_Constructor {
    int id ;
    String name ;
    Parameterized_Constructor(int i , String n){
        id = i;
        name = n;
    }
    void display(){
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Parameterized_Constructor obj = new Parameterized_Constructor(123,"pavan");
        Parameterized_Constructor obj1 = new Parameterized_Constructor(456,"kalyan");
        obj.display();
        obj1.display();
    }
}
