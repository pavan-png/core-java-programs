import java.io.IOException;
import java.io.FileNotFoundException;

// ---------- Helper classes for covariant return ----------
class BaseInterest {
    void info() {
        System.out.println("General interest");
    }
}

class PersonalLoanInterest extends BaseInterest {
    @Override
    void info() {
        System.out.println("Personal loan interest");
    }
}

// ---------- Parent class ----------
class BaseLoan {

    // Method to be overridden
    protected BaseInterest calculateInterest() throws IOException {
        System.out.println("Base loan interest calculation");
        return new BaseInterest();
    }

    // static method (cannot be overridden)
    static void loanCategory() {
        System.out.println("Generic Loan");
    }

    // final method (cannot be overridden)
    final void loanRules() {
        System.out.println("Loan rules");
    }

    // private method (cannot be overridden)
    private void internalLogic() {
        System.out.println("Base internal logic");
    }
}

// ---------- Child class ----------
class PersonalLoanAccount extends BaseLoan {

    // Overriding method:
    // - same name
    // - same parameters
    // - increased visibility
    // - covariant return type
    // - narrower checked exception
    @Override
    public PersonalLoanInterest calculateInterest() throws FileNotFoundException {
        System.out.println("Personal loan interest calculation");
        return new PersonalLoanInterest();
    }

    // static method hiding (NOT overriding)
    static void loanCategory() {
        System.out.println("Personal Loan");
    }

    // new method (NOT overriding private parent method)
    void internalLogic() {
        System.out.println("Personal loan internal logic");
    }
}

// ---------- Test class ----------
public class Overriding_All_Rules_Demo {
    public static void main(String[] args) throws IOException {

        // Polymorphism
        BaseLoan loan = new PersonalLoanAccount();

        // Runtime overriding + covariant return
        BaseInterest interest = loan.calculateInterest();
        interest.info();

        // Static method hiding
        BaseLoan.loanCategory();
        PersonalLoanAccount.loanCategory();

        // Final method (cannot be overridden)
        loan.loanRules();
    }
}
