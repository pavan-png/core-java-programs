public class Copying_Constructor_Without_Constructor {
    int id ;
    String name;
    int age;
    Copying_Constructor_Without_Constructor(int i, String s, int a){
        id = i;
        name = s;
        age = a;
    }
    Copying_Constructor_Without_Constructor(){
    }
    void display1(){
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] args) {
        Copying_Constructor_Without_Constructor obj = new Copying_Constructor_Without_Constructor(99,"pavan",23);
        Copying_Constructor_Without_Constructor obj1 = new Copying_Constructor_Without_Constructor();
        obj1.id = obj.id;
        obj1.name = obj.name;
        obj1.age = obj.age;
        obj.display1();
        obj1.display1();

    }
}
