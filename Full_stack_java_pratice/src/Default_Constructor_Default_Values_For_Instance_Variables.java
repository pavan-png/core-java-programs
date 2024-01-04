public class Default_Constructor_Default_Values_For_Instance_Variables {
    int id;
    String name;
    void display(){
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Default_Constructor_Default_Values_For_Instance_Variables obj = new Default_Constructor_Default_Values_For_Instance_Variables();
        obj.display();
    }
}
