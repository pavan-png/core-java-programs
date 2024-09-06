class Shape_1{
    private boolean isDisplayed;
    protected int canvasId;
    public Shape_1(){
      isDisplayed = false;
      canvasId = 0;
    }
    public class Color_1{
        public void display(){
            /*
            instance variables can be accessed directly in the inner class , even though they are private and protected
             */
            System.out.println("isDisplayed : "+isDisplayed);
            System.out.println("canvasId "+canvasId);
        }
    }
}
public class Inner_Class_Eg3 {
    public static void main(String[] args) {
        Shape_1.Color_1 obj = new Shape_1().new Color_1();
        obj.display();
    }
}
