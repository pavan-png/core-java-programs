class InvalidAmountException extends RuntimeException {

    public InvalidAmountException(String message) {
        super(message);
    }
}

class Bank {

    private int balance = 5000;

    public void withdraw(int amount) {

        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be positive.");
        }

        if (amount > balance) {
            throw new InvalidAmountException("Insufficient balance.");
        }

        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
}
public class Custom_Unchecked_Exception {

    public static void main(String[] args) {

        Bank bank = new Bank();

        // not compulsorily to handle runtime exception but recommended
        try {
            bank.withdraw(-100);
        }
        catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
