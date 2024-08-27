class Line{
    public class Point{
        public int x,y;
    }
    public Point getPoint(){
        return new Point();
    }
}
public class Innerclass_Eg1 {
    public static void main(String[] args) {
        Line.Point obj = new Line().getPoint();
        /* first crate an object of outer class and then call the method getpoint()
        get point method will return point object , so at the reference variable should also be of point type
        for that outer class name followed by . inner class name and reference variable name
        */

    }
}
