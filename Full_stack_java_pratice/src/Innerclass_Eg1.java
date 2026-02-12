// Outer class
class Line {

    // 🔹 Member Inner Class (Non-static)
    public class Point {

        // Instance variables of inner class
        public int x, y;
    }

    // Method of outer class returning inner class object
    public Point getPoint() {

        // Creating and returning object of inner class
        return new Point();
    }
}

public class Innerclass_Eg1 {

    public static void main(String[] args) {

        // 🔹 Creating outer class object
        // 🔹 Calling getPoint() method
        // 🔹 getPoint() returns an object of inner class Point
        // 🔹 So reference type must be Line.Point

        Line.Point obj = new Line().getPoint();

        // Now obj refers to a Point object
        obj.x = 10;
        obj.y = 20;

        System.out.println("x = " + obj.x);
        System.out.println("y = " + obj.y);
    }
}
