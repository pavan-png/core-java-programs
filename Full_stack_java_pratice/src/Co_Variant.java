
class Interest{

}
class Interest_Personal_Loan extends Interest{

}
class Loans {
    protected Interest rate_Of_Interest(){
        Interest obj = new Interest();
        return obj;
    }
}
class Personal_Loan extends Loans{
    // overridden method visibility can be increased ( or) same but cannot be decreased
     public Interest_Personal_Loan rate_Of_Interest(){
        Interest_Personal_Loan obj1 = new Interest_Personal_Loan();
        return obj1;
    }
}
public class Co_Variant {
    public static void main(String[] args) {
        Personal_Loan obj2 = new Personal_Loan();
        obj2.rate_Of_Interest();

    }

}
