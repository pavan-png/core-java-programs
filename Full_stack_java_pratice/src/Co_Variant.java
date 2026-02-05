class Interest {
}

class Interest_Personal_Loan extends Interest {
}

class Loans {
    protected Interest rate_Of_Interest() {
        System.out.println("Loans rate of interest");
        return new Interest();
    }
}

class Personal_Loan extends Loans {
    // visibility increased + covariant return type
    public Interest_Personal_Loan rate_Of_Interest() {
        System.out.println("Personal Loan rate of interest");
        return new Interest_Personal_Loan();
    }
}

public class Co_Variant {
    public static void main(String[] args) {

        // Parent reference, child object (polymorphism)
        Loans loan = new Personal_Loan();

        // Parent expects Interest,
        // Child actually returns Interest_Personal_Loan
        Interest i = loan.rate_Of_Interest();

        System.out.println(i.getClass().getSimpleName());
    }
}
