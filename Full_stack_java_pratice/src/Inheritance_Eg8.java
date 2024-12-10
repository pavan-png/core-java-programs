class Thingy { Meter m = new Meter(); }

class Component { void go() { System.out.print("c"); } }

class Meter extends Component {
    void go() {
        System.out.print("m");
    }
    //overriding method
}
  public class Inheritance_Eg8 extends Thingy {
      public static void main(String[] args) {
          Inheritance_Eg8 dt = new Inheritance_Eg8();
          dt.m.go();
          Thingy t = new Inheritance_Eg8();
          t.m.go();
      }
  }