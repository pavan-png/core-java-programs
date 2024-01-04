public class Copy_Constructor {
    int id ;
    String name;
    int age;
    Copy_Constructor(int i, String s, int a){
        id = a;
        name = s;
        age = a;
    }
    Copy_Constructor (Copy_Constructor cc){
        id = cc.id;
        name = cc.name;
        age = cc.age;
    }
    void display(){
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] args) {
        Copy_Constructor obj = new Copy_Constructor(123,"pavan",23);
        Copy_Constructor obj1 = new Copy_Constructor(obj);
        obj.display();
        obj1.display();

    }
}
