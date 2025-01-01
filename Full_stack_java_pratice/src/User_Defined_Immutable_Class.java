 final class Employee_98
{
    private final String pancardNumber;
    public Employee_98(String pancardNumber)
    {
        this.pancardNumber=pancardNumber;
    }
    public String getPancardNumber(){
        return pancardNumber;
    }
}
public class User_Defined_Immutable_Class
{
    public static void main(String ar[])
    {
        Employee_98 e = new Employee_98("ABC123");
        String s1 = e.getPancardNumber();
        System.out.println("Pancard Number: " + s1);
    }
}