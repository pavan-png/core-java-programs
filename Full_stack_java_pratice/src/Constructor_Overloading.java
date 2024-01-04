public class Constructor_Overloading {
    int id ;
    String name ;
    int age;
    Constructor_Overloading(int i,String n ){
        id = i;
        name = n;
    }
    // for over loading should have different parameters no.of parameters (or) different types of parameters
    Constructor_Overloading(int i,String n,int a){
        id = i;
        name = n;
        age = a;
    }
    void display(){
        System.out.println(id + " " + name + " " + age);

    }

    public static void main(String[] args) {
        Constructor_Overloading obj = new Constructor_Overloading(123,"pavan",23);
        obj.display();
    }
}
