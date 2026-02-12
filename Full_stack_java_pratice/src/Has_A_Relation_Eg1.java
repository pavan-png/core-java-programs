// This is the Inner class
// It contains one variable x
class Inner {

    private int x;   // Instance variable

    // Setter method to set value of x
    public void setX(int x) {
        this.x = x;  // 'this.x' refers to current object's variable
    }

    // Getter method to return value of x
    public int getX() {
        return x;
    }
}


// This is the Outer class
// It HAS-A Inner object
class Outer_0 {

    // HAS-A relationship
    // Outer_0 contains reference of Inner class
    private Inner y;

    // Setter injection: assign Inner object to Outer
    public void setY(Inner y) {
        this.y = y;
    }

    // Getter method to return Inner reference
    public Inner getY() {
        return y;
    }
}


// Main class
public class Has_A_Relation_Eg1 {

    public static void main(String[] args) {

        // Create Outer object
        Outer_0 o = new Outer_0();

        // Create Inner object
        Inner i = new Inner();

        int n = 10;

        // Set x value inside Inner object to 10
        i.setX(n);

        // Inject Inner object into Outer
        o.setY(i);

        // Now change x value inside same Inner object to 100
        i.setX(100);

        /*
         Alternative ways (commented):

         // This also changes same object value
         o.getY().setX(100);

         // If we create new Inner object:
         i = new Inner();     // new object created
         i.setX(100);         // set value
         o.setY(i);           // now Outer points to new object
        */

        // Print value of x through Outer
        System.out.println(o.getY().getX());
    }
}
