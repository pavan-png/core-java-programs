public class Problem_Without_This_In_Instance_Var {
String student_Name;
int roll_No;
int age;
        Problem_Without_This_In_Instance_Var(String student_Name, int roll_No, int age){
    student_Name = student_Name;
    roll_No = roll_No;
    age = age;
}
void  display(){
            System.out.println(student_Name +"  "+roll_No + "  "+ age);
}

    public static void main(String[] args) {
        Problem_Without_This_In_Instance_Var obj = new Problem_Without_This_In_Instance_Var("pavan",123,23);
        obj.display();
    }
}
