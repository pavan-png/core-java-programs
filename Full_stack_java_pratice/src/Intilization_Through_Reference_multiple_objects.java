class Employer1{
    String name ;
    int publisher_id ;
}
 class Intilization_Through_Reference_multiple_objects {
     public static void main(String[] args) {
         Employer1 obj1 = new Employer1();
         Employer1 obj2 = new Employer1();
         obj1.name = "srinivas";
         obj1.publisher_id = 12344;
         System.out.println(" the details are : " + obj1.name + " publisher_id :" + obj1.publisher_id);
         obj2.name = "pavan,devadatta";
         obj2.publisher_id = 12344;
         System.out.println(" the details are : " + obj2.name + " publisher_id :" + obj2.publisher_id);
     }
}
