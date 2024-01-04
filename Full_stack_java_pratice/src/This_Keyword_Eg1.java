 class Example {
     int instance_Var = 5;
     static int static_Var = 10;

     void display() {

         int instance_Var = 20;
         int static_Var = 40;

         this.instance_Var = 50;
         // static variable can be acessed in non static method using this keyword.
         this.static_Var = 100;

         // printing current class instance and static variables.
         System.out.println("current class instance variable " + this.instance_Var);
         System.out.println("current class static variable " + this.static_Var);

         // printing method specific instance  variables.
         System.out.println("instance var inside method " + instance_Var);
         System.out.println("Static var inside var " + static_Var);
     }
 }

    public class This_Keyword_Eg1{
        public static void main(String[] args) {


            Example obj = new Example();
            obj.display();

        }
}
