public class Static_Block_Eg4 {
    static String Emp_name;
    static  String Emp_package;
    static int Emp_id;
    static int Emp_age;
    String Company_name = "Tcs";
    static {
        Emp_name = "mohan pavan kalyan";
        System.out.println("the employee name is " +Emp_name);
    }
    static {
        Emp_package = "6.5 L.P.A";
        System.out.println("the package is " +Emp_package);
    }
    static {
        Emp_id = 123;
        Emp_age = 23;
        System.out.println("the employee id is " +Emp_id +" " + " and age is " +Emp_age);

    }

    public static void main(String[] args) {
        Static_Block_Eg4 obj = new Static_Block_Eg4();
        System.out.println("the company name is " +obj.Company_name);

    }
}
