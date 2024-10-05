class Ann_1{
    void disp(){
        System.out.println("parent class method");
    }
}
public class Annotation_Eg2 extends Ann_1{
    @Override
    /*
    here since we have included override annotation , if we do not override the method it will give compile time
    error.
     */
    void disp() {
        System.out.println("child class method ");
    }

    public static void main(String[] args) {

    }
}
