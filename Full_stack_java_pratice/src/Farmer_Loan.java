import java.util.Scanner;

class Loan {

    private float principal;
    private float time;
    private float interest;

    private static float rate; // common to all farmers

    static {
        rate = 2.0f;
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal:");
        principal = sc.nextFloat();
        System.out.println("Enter time in years:");
        time = sc.nextFloat();
    }

    void calculate() {
        interest = (principal * time * rate) / 100;
    }

    void display() {
        System.out.println("Simple interest = " + interest);
    }
}

public class Farmer_Loan {

    public static void main(String[] args) {

        Loan farmer1 = new Loan();
        farmer1.input();
        farmer1.calculate();
        farmer1.display();
    }
}
