import java.util.Scanner;

class mobileLockedException extends Exception{
mobileLockedException(String s){
    super(s);
}
}
class mobile {
    int password = 1239;
    int pin;
    public void trunOn() throws mobileLockedException {

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the pin");
        pin = sc.nextInt();
        if (pin==password){
            System.out.println("you can use the mobile now");
        }
        else {
            mobileLockedException obj = new  mobileLockedException(" phn alsa nideyna ");
            throw obj;
        }
    }
        }
public class Custom_Exceptions {
    public static void main(String[] args) {
        try {
            mobile obj1 = new mobile();
            obj1.trunOn();
        }
        catch (mobileLockedException e1){
            System.out.println("you entered wrong pin  1st time  ");
            System.out.println(e1.getMessage());
            try {
                mobile obj2 = new mobile();
                obj2.trunOn();
            }
            catch (mobileLockedException e2){
                System.out.println("you entered wrong pin 2nd time");
                System.out.println(e2.getMessage());
                try {
                    mobile obj3 = new mobile();
                    obj3.trunOn();
                }
                catch (mobileLockedException e3 ){
                    System.out.println("you entered wrong pin 3rd timed time");
                    System.out.println("ey ra phn dobbeysava ");
                    System.exit(0);
                }
            }
        }
    }

}
