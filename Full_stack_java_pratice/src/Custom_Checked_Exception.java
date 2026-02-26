import java.util.Scanner;
class MobileLockedException extends Exception {

    public MobileLockedException(String message) {
        super(message);
    }
}

class Mobile {

    private final int PASSWORD = 1239;
    private int attempts = 0;

    public void turnOn() throws MobileLockedException {

        Scanner sc = new Scanner(System.in);

        while (attempts < 3) {

            System.out.println("Enter PIN:");
            int pin = sc.nextInt();

            if (pin == PASSWORD) {
                System.out.println("Mobile unlocked successfully.");
                return; // Exit method if correct
            } else {
                attempts++;
                System.out.println("Wrong PIN. Attempts left: " + (3 - attempts));
            }
        }

        // After 3 wrong attempts
        throw new MobileLockedException("Mobile is locked due to 3 wrong attempts.");
    }
}
public class Custom_Checked_Exception {

    public static void main(String[] args) {

        Mobile mobile = new Mobile();

        try {
            mobile.turnOn();
        }
        catch (MobileLockedException e) {
            System.out.println("Access denied.");
            System.out.println(e.getMessage());
        }
    }
}