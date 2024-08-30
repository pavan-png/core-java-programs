public class Main_In_Class_2 {
    int id ;
    String name;

    public static void main(String[] args) {
        Main_In_Class_2 obj  = new Main_In_Class_2();
       // since id and name variables are not assigned default values of their respective datatypes are printed
        // they are instance variables to access them we need an object , so object is created to print them.
        System.out.println(obj.name);
        System.out.println(obj.id);
    }

}
