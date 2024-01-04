class tcs{
    String s;
    int Emp_id;
    void project(String name,int id){
        s = name;
        Emp_id = id;

    }
    void details(){
        System.out.println("The employee name is : " +s + " his is id is : " +Emp_id );
    }

}
 class Intilization_Through_Method {
     public static void main(String[] args) {
         tcs obj = new tcs();
         obj.project("pavan",1234);
         obj.details();
     }
}
