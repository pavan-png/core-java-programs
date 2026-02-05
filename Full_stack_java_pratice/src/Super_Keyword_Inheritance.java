// ------------------ LEVEL 1 ------------------
class BaseAccount {

    private int basePrivateCode = 1;
    int baseAmount = 100;

    BaseAccount() {
        System.out.println("BaseAccount constructor");
    }

    BaseAccount(int amount) {
        System.out.println("BaseAccount parameterized constructor: " + amount);
    }

    void displayAccount() {
        System.out.println("BaseAccount displayAccount()");
    }

    static void accountCategory() {
        System.out.println("BaseAccount static category");
    }
}

// ------------------ LEVEL 2 ------------------
class SavingsAccount extends BaseAccount {

    int baseAmount = 200;

    SavingsAccount() {
        super();   // must be first statement
        System.out.println("SavingsAccount constructor");
    }

    SavingsAccount(int amount) {
        super(amount);   // parameterized parent constructor
        System.out.println("SavingsAccount parameterized constructor");
    }

    void displayAccount() {
        System.out.println("SavingsAccount displayAccount()");
    }

    void accessBaseAccount() {

        System.out.println(super.baseAmount); // accesses BaseAccount variable
        super.displayAccount();               // calls BaseAccount method

        // System.out.println(super.basePrivateCode); // ❌ private not accessible
        // super.accountCategory();                   // ❌ static via super not allowed
    }
}

// ------------------ LEVEL 3 ------------------
class PremiumSavingsAccount extends SavingsAccount {

    int baseAmount = 300;

    PremiumSavingsAccount() {
        super(999);  // must be first statement, chosen at compile time
        System.out.println("PremiumSavingsAccount constructor");
    }

    void demonstrateSuperKeywordRules() {

        // 1️⃣ super refers only to immediate parent
        System.out.println(super.baseAmount); // SavingsAccount value (200)

        // System.out.println(super.super.baseAmount); // ❌ invalid

        // 2️⃣ super resolves variable hiding
        System.out.println(baseAmount);       // child variable (300)
        System.out.println(super.baseAmount); // parent variable (200)

        // 3️⃣ super resolves method overriding
        super.displayAccount(); // calls SavingsAccount version

        // 4️⃣ super cannot be used in static context
        // (compile-time restriction)

        // 5️⃣ super cannot access private members
        // System.out.println(super.basePrivateCode); // ❌ invalid

        // 6️⃣ super cannot access static members
        // super.accountCategory(); // ❌ invalid
        BaseAccount.accountCategory(); // ✔ correct way

        // 7️⃣ super cannot be stored, reassigned, or passed
        // super = new SavingsAccount(); // ❌ invalid
        // validate(super);              // ❌ invalid
        validate(this);                 // ✔ allowed
    }

    void validate(SavingsAccount acc) {
        System.out.println("Validation completed");
    }
}

// ------------------ MAIN CLASS ------------------
public class Super_Keyword_Inheritance {
    public static void main(String[] args) {

        // Object creation order:
        // Object → BaseAccount → SavingsAccount → PremiumSavingsAccount
        PremiumSavingsAccount account = new PremiumSavingsAccount();

        account.demonstrateSuperKeywordRules();
    }
}
