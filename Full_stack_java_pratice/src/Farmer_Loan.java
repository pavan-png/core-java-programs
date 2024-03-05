import java.util.*;
 class Loan {
private float principal_Amount;
private float time_Period;
private float simple_Interest;
private static float rate_Of_Interest;

static {
    rate_Of_Interest = 2.0f;
}

void input_loan_Details(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the principal amount");
    principal_Amount = sc.nextFloat();
    System.out.println("enter the time  period in years");
    time_Period = sc.nextFloat();

}

void Simple_Interest_Calculate(){
    simple_Interest = (principal_Amount * time_Period * rate_Of_Interest)/100;
}
void disp_Simple_Interest(){
    System.out.println("total simple interest is "+simple_Interest);
}
}
public class Farmer_Loan{
    public static void main(String[] args) {
        Loan f1 = new Loan();
        Loan f2 = new Loan();
        f1.input_loan_Details();
        f1.Simple_Interest_Calculate();
        f1.disp_Simple_Interest();
        f2.input_loan_Details();
        f2.Simple_Interest_Calculate();
        f2.disp_Simple_Interest();

    }
}
