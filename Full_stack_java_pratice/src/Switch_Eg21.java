
class Infinity { }
public class Switch_Eg21 extends Infinity {
    static Integer i;

    public static void main(String[] args) {
        int sw = (int) (Math.random() * 3);
        switch (sw) {
            case 0: {
                for (int x = 10; x > 5; x++)
                    // this  condition would result in infinite loop
                    if (x > 10000000)
                        x = 10; // not declaration but intialization
                /*
                 if there are no braces only one line is allowed. so break is not a part of for loop
                only if and next two lines are considered inside for loop.
                 */
                break;
            }
            case 1: {
                int y = 7 * i;
                /*
                if control comes here on a null we are trying to perform operation so , it will lead to
                null pointer exception. but control never comes here for loop is itself infinite.
                 */
                break;
            }
            case 2: {
                Infinity inf = new Switch_Eg21();
                Switch_Eg21 b = (Switch_Eg21) inf;
            }

        }
    }
    void demo(){
        for (int x = 10; x > 5; x++)
            if (x > 10000000)
                x = 1;
    }
}
