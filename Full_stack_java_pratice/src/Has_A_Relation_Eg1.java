class Inner{
    private int x;
    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
}

    class Outer_0{
        private Inner y;

        public void setY(Inner y) {
            this.y = y;
        }

        public Inner getY() {
            return y;
        }
    }

public class Has_A_Relation_Eg1 {
    public static void main(String[] args) {
        Outer_0 o = new Outer_0();
        Inner i = new Inner();
        int n = 10;
        i.setX(n);
        o.setY(i);
        i.setX(100);
       /* o.getY().setX(100);
        i = new Inner();
        i.setX(100);
        o.setY(i);

        */
        System.out.println(o.getY().getX());

    }
}
